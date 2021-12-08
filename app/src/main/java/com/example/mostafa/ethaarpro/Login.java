package com.example.mostafa.ethaarpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText editusername,editpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editusername=findViewById(R.id.editusername);
        editpassword=findViewById(R.id.editpassword);



    }
    public void login(View view){
        String username=editusername.getText().toString();
        String pass=editpassword.getText().toString();
        if (username.equals("admin")&&pass.equals("1234")){
            Intent log=new Intent(Login.this,Home.class);
            startActivity(log);
        }

    }
}
