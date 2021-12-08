package com.example.mostafa.ethaarpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DB_sql db=new DB_sql(this);
    EditText editid,editidentity,editphone,edittelephone,editname4,editname3,editname2,editname1,editstreet,
            editaddress,editwork,editstatus,editdate,edeitsex,editnamepatient,editweight,editheart,editheat,editprssure,
            editstatus2,editdisseas,editresponsible,editrh,edithb,editgdl,editwbc,editrbc,editplt,editnamelab,edittech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editid=(EditText)findViewById(R.id.editid);
        editidentity=(EditText)findViewById(R.id.editidentity);
        editphone=(EditText)findViewById(R.id.editphone);
        edittelephone=(EditText)findViewById(R.id.edittelephone);
        editname4=(EditText)findViewById(R.id.editname4);
        editname3=(EditText)findViewById(R.id.editname3);
        editname2=(EditText)findViewById(R.id.editname2);
        editname1=(EditText)findViewById(R.id.editname1);
        editstreet=(EditText)findViewById(R.id.editstreet);
        editaddress=(EditText)findViewById(R.id.editaddress);
        editwork=(EditText)findViewById(R.id.editwork);
        editstatus=(EditText)findViewById(R.id.editstatus);
        editdate=(EditText)findViewById(R.id.editdate);
        edeitsex=(EditText)findViewById(R.id.edeitsex);
        editnamepatient=(EditText)findViewById(R.id.editnamepatient);
        editweight=(EditText)findViewById(R.id.editweight);
        editheart=(EditText)findViewById(R.id.editheart);
        editheat=(EditText)findViewById(R.id.editheat);
        editprssure=(EditText)findViewById(R.id.editprssure);
        editstatus2=(EditText)findViewById(R.id.editstatus2);
        editdisseas=(EditText)findViewById(R.id.editdisseas);
        editresponsible=(EditText)findViewById(R.id.editresponsible);
        editrh=(EditText)findViewById(R.id.editrh);
        edithb=(EditText)findViewById(R.id.edithb);
        editgdl=(EditText)findViewById(R.id.editgdl);
        editwbc=(EditText)findViewById(R.id.editwbc);
        editrbc=(EditText)findViewById(R.id.editrbc);
        editplt=(EditText)findViewById(R.id.editplt);
        editnamelab=(EditText)findViewById(R.id.editnamelab);
        edittech=(EditText)findViewById(R.id.edittech);

    }

    public void save_btn(View view) {
        String editIdentity=editidentity.getText().toString();
        String editId=editid.getText().toString();
        String editName1=editname1.getText().toString();
        String editName2=editname2.getText().toString();
        String editName3=editname3.getText().toString();
        String editName4=editname4.getText().toString();
        String editTelephone=edittelephone.getText().toString();
        String editPhone=editphone.getText().toString();
        String edeitSex=edeitsex.getText().toString();
        String editAddress=editaddress.getText().toString();
        String editStreet=editstreet.getText().toString();
        String editWork=editwork.getText().toString();
        String editStatus=editstatus.getText().toString();
        String editDate=editdate.getText().toString();
        String editNamepatient=editnamepatient.getText().toString();
        String editHeat=editheat.getText().toString();
        String editWeight=editweight.getText().toString();
        String editHeart=editheart.getText().toString();
        String editStatus2=editstatus2.getText().toString();
        String editPrssure=editprssure.getText().toString();
        String editDisseas=editdisseas.getText().toString();
        String editResponsible=editresponsible.getText().toString();
        String editRh=editrh.getText().toString();
        String editHb=edithb.getText().toString();
        String editGdl=editgdl.getText().toString();
        String editWbc=editwbc.getText().toString();
        String editRbc=editrbc.getText().toString();
        String editPlt=editplt.getText().toString();
        String editNamelab=editnamelab.getText().toString();
        String editTech=edittech.getText().toString();

        DataDoner dataDoner=new DataDoner(editIdentity,editId,editName1,editName2,editName3,editName4,editTelephone,editPhone,edeitSex,editAddress,editStreet
                ,editWork,editStatus,editDate,editNamepatient,editHeat,editWeight,editHeart,editStatus2,editPrssure,editDisseas,editResponsible,editRh
                ,editHb,editGdl,editWbc,editRbc,editPlt,editNamelab,editTech);

        Boolean result= db.insertdata(dataDoner);
        if (result == true){
            editidentity.setText(null);
            editid.setText(null);
            editname1.setText(null);
            editname2.setText(null);
            editname3.setText(null);
            editname4.setText(null);
            edittelephone.setText(null);
            editphone.setText(null);
            edeitsex.setText(null);
            editaddress.setText(null);
            editstreet.setText(null);
            editwork.setText(null);
            editstatus.setText(null);
            editdate.setText(null);
            editnamepatient.setText(null);
            editheat.setText(null);
            editweight.setText(null);
            editheart.setText(null);

            editstatus2.setText(null);
            editprssure.setText(null);
            editdisseas.setText(null);
            editresponsible.setText(null);
            editrh.setText(null);
            edithb.setText(null);
            editgdl.setText(null);
            editwbc.setText(null);
            editrbc.setText(null);
            editplt.setText(null);
            editnamelab.setText(null);
            edittech.setText(null);

            Toast.makeText(MainActivity.this,"add successfully",Toast.LENGTH_LONG).show();
            // showdata();
        }
    }

}
