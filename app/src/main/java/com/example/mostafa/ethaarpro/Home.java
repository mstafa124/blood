package com.example.mostafa.ethaarpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Home extends AppCompatActivity {
TextView txtmain,txtupdate,txtdel,txtsearch;
EditText editsearchhome;
ListView listsearch;
    DB_sql db=new DB_sql(this);
    List<DataDoner> list;
    ArrayAdapter<DataDoner> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtmain=findViewById(R.id.txtmain);
        txtupdate=findViewById(R.id.txtupdate);
        txtdel=findViewById(R.id.txtdelete);
        txtsearch=findViewById(R.id.txtsearch);
        editsearchhome=findViewById(R.id.editsearchhome);
        listsearch=findViewById(R.id.listsearch);
        txtmain.setVisibility(View.VISIBLE);

        editsearchhome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                listsearch.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                listsearch.setVisibility(View.VISIBLE);
                txtmain.setVisibility(View.INVISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
                listsearch.setVisibility(View.INVISIBLE);
                txtmain.setVisibility(View.VISIBLE);
            }
        });


        list=db.getallrecord();


        txtsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search();

            }
        });



        txtmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(Home.this,MainActivity.class);
                startActivity(main);
            }
        });
        txtupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(Home.this,ShowData.class);
                startActivity(main);
            }
        });


    }
    public void search(){
        List<DataDoner > arrayList2=db.searchdata(editsearchhome.getText().toString());
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listsearch.setAdapter(arrayAdapter);
        txtmain.setVisibility(View.INVISIBLE);
        listsearch.setVisibility(View.VISIBLE);
        listsearch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataDoner dataDoner=list.get(position);
                Intent inn=new Intent(Home.this,Search.class);
                inn.putExtra("Datadoner1",dataDoner);
                startActivity(inn);

            }
        });



    }
}
