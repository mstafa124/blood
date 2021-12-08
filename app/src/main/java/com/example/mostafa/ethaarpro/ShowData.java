package com.example.mostafa.ethaarpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ShowData extends AppCompatActivity {
ListView listblooddonate,listblooddonate2;
    DB_sql db=new DB_sql(this);
    List<DataDoner> list;
    ArrayAdapter<DataDoner> arrayAdapter;
    EditText editsearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        listblooddonate=findViewById(R.id.listblooddonate);
        listblooddonate2=findViewById(R.id.listblooddonate2);
        editsearch=findViewById(R.id.editsearch);

        list=db.getallrecord();





    }
    public void showdata(){
        List<DataDoner> listdata =db.getallrecord();
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,listdata);
        listblooddonate.setAdapter(arrayAdapter);
    }
    public void search(View view){
       List<DataDoner > arrayList2=db.searchdata(editsearch.getText().toString());
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
       listblooddonate.setAdapter(arrayAdapter);
     //  editsearch.setText("");
       // Toast.makeText(this, "you choose", Toast.LENGTH_SHORT).show();

//        listblooddonate2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                DataDoner dataDoner=list.get(position);
//                Intent inn=new Intent(ShowData.this,Search.class);
//                inn.putExtra("Datadoner1",dataDoner);
//                startActivity(inn);
//
//
//            }
//        });

   search2();
    }
    public void search(){
        listblooddonate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataDoner dataDoner=list.get(position);
                Intent inn=new Intent(ShowData.this,DataUpdate.class);
                inn.putExtra("Datadoner",dataDoner);
                startActivity(inn);


            }
        });
    }
    public void search2(){
        listblooddonate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataDoner dataDoner=list.get(position);

                Intent inn2=new Intent(ShowData.this,Search.class);
                inn2.putExtra("Datadoner1",dataDoner);
                startActivity(inn2);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        showdata();


       search();
    }
}
