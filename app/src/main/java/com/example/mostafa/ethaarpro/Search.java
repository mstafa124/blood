package com.example.mostafa.ethaarpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Search extends AppCompatActivity {
    EditText editnameupdate,editidentityupdate,editphoneupdate,editaddressupdate,editdatedonateupdate,editpatientnameuodate,editsexupdate;
    DB_sql db=new DB_sql(this);
    DataDoner dataDoner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editnameupdate=findViewById(R.id.editnameupdate2);
        editidentityupdate=findViewById(R.id.editidentityupdate2);
        editphoneupdate=findViewById(R.id.editphoneupdate2);
        editaddressupdate=findViewById(R.id.editaddressupdate2);
        editdatedonateupdate=findViewById(R.id.editdatedonateupdate2);
        editpatientnameuodate=findViewById(R.id.editpatientnameuodate2);
        editsexupdate=findViewById(R.id.editsexupdate2);

        dataDoner2= (DataDoner) getIntent().getExtras().getSerializable("Datadoner1");

        editnameupdate.setText(dataDoner2.getName1());
        editidentityupdate.setText(dataDoner2.getIdentity());
        editphoneupdate.setText(dataDoner2.getPhone());
        editaddressupdate.setText(dataDoner2.getAddress());
        editdatedonateupdate.setText(dataDoner2.getDatedonate());
        editpatientnameuodate.setText(dataDoner2.getNamepatient());
        editsexupdate.setText(dataDoner2.getSex());

        editnameupdate.setEnabled(false);
        editidentityupdate.setEnabled(false);
        editphoneupdate.setEnabled(false);
        editaddressupdate.setEnabled(false);
        editdatedonateupdate.setEnabled(false);
        editpatientnameuodate.setEnabled(false);
        editsexupdate.setEnabled(false);
       // Toast.makeText(Search.this, "you choose"+editaddressupdate.getText(), Toast.LENGTH_SHORT).show();

    }
    public void setenable2(View view){
        editnameupdate.setEnabled(true);
        editidentityupdate.setEnabled(true);
        editphoneupdate.setEnabled(true);
        editaddressupdate.setEnabled(true);
        editdatedonateupdate.setEnabled(true);
        editpatientnameuodate.setEnabled(true);
        editsexupdate.setEnabled(true);
    }
    public void upadtebtn2(View view) {
        String Identity=editidentityupdate.getText().toString();

        String Name1=editnameupdate.getText().toString();
        String Phone=editphoneupdate.getText().toString();
        String Sex=editsexupdate.getText().toString();
        String Address=editaddressupdate.getText().toString();

        String Date=editdatedonateupdate.getText().toString();
        String Namepatient=editpatientnameuodate.getText().toString();
        DataDoner dataDoner=new DataDoner(Identity,null,Name1,null,null,null,null,Phone,Sex
                ,Address,null,null,null,Date,Namepatient,null,null,null,null,null
                ,null,null,null,null,null,null,null,null,null,null);
        Boolean result= db.updatedata(dataDoner);

        if (result==true){
            editdatedonateupdate.setText(null);
            editpatientnameuodate.setText(null);
            editaddressupdate.setText(null);

            editsexupdate.setText(null);
            editphoneupdate.setText(null);
            editnameupdate.setText(null);
            editidentityupdate.setText(null);

        }

    }
}
