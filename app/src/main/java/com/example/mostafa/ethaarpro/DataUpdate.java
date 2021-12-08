package com.example.mostafa.ethaarpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataUpdate extends AppCompatActivity {
EditText editnameupdate,editidentityupdate,editphoneupdate,editaddressupdate,editdatedonateupdate,editpatientnameuodate,editsexupdate;
    DB_sql db=new DB_sql(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_update);

        editnameupdate=findViewById(R.id.editnameupdate);
        editidentityupdate=findViewById(R.id.editidentityupdate);
        editphoneupdate=findViewById(R.id.editphoneupdate);
        editaddressupdate=findViewById(R.id.editaddressupdate);
        editdatedonateupdate=findViewById(R.id.editdatedonateupdate);
        editpatientnameuodate=findViewById(R.id.editpatientnameuodate);
        editsexupdate=findViewById(R.id.editsexupdate);


        DataDoner dataDoner= (DataDoner) getIntent().getExtras().getSerializable("Datadoner");


        editnameupdate.setText(dataDoner.getName1());
        editidentityupdate.setText(dataDoner.getIdentity());
        editphoneupdate.setText(dataDoner.getPhone());
        editaddressupdate.setText(dataDoner.getAddress());
        editdatedonateupdate.setText(dataDoner.getDatedonate());
        editpatientnameuodate.setText(dataDoner.getNamepatient());
        editsexupdate.setText(dataDoner.getSex());

        editnameupdate.setEnabled(false);
        editidentityupdate.setEnabled(false);
        editphoneupdate.setEnabled(false);
        editaddressupdate.setEnabled(false);
        editdatedonateupdate.setEnabled(false);
        editpatientnameuodate.setEnabled(false);
        editsexupdate.setEnabled(false);

    }

    public void setenable(View view){
        editnameupdate.setEnabled(true);
        editidentityupdate.setEnabled(true);
        editphoneupdate.setEnabled(true);
        editaddressupdate.setEnabled(true);
        editdatedonateupdate.setEnabled(true);
        editpatientnameuodate.setEnabled(true);
        editsexupdate.setEnabled(true);
    }
    public void upadtebtn(View view) {
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
public void delete(View view){
    String dentity=editidentityupdate.getText().toString();
    Integer result=db.deletedata(dentity);

}

}
