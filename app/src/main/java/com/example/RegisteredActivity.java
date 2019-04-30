package com.example;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.Statement;

public class RegisteredActivity extends AppCompatActivity  {


    EditText name,email,pass,nname,nickname,age,password2;
    Button register;
    ProgressDialog progressDialog;
    ConnectionClass connectionClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);

        getSupportActionBar();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        name= (EditText) findViewById(R.id.name);
        email= (EditText) findViewById(R.id.email);
        pass= (EditText) findViewById(R.id.pass);
        nname= (EditText) findViewById(R.id.nname);
        nickname= (EditText) findViewById(R.id.nickname);
        age= (EditText) findViewById(R.id.age);
        password2= (EditText) findViewById(R.id.password2);
        register= (Button) findViewById(R.id.register);


        connectionClass = new ConnectionClass();

        progressDialog=new ProgressDialog(this);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Doregister doregister = new Doregister();
                doregister.execute("");
            }
        });


    }

    public class Doregister extends AsyncTask<String,String,String>
    {


        String namestr=name.getText().toString();
        String emailstr=email.getText().toString();
        String passstr=pass.getText().toString();
        String nnamestr=nname.getText().toString();
        String nicknamestr=nickname.getText().toString();
        String agestr=age.getText().toString();
        String password2str=password2.getText().toString();
        String z="";
        boolean isSuccess=false;

        @Override
        protected void onPreExecute() {
            progressDialog.setMessage("Loading...");
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {


            if(namestr.trim().equals("")|| emailstr.trim().equals("") ||passstr.trim().equals("")||nnamestr.trim().equals("")||nicknamestr.trim().equals("")||agestr.trim().equals("")||password2str.trim().equals(""))
                z = "有欄位未輸入資料";

            else if(!passstr.equals(password2str))
                z = "密碼確認錯誤";

            else
            {
                try {
                    Connection con = connectionClass.CONN();
                    if (con == null) {
                        z = "請確認網路連線";
                    } else {

                        String query="insert into test values('"+namestr+"','"+emailstr+"','"+passstr+"','"+nnamestr+"','"+nicknamestr+"','"+agestr+"')";

                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(query);

                        z = "註冊成功";
                        isSuccess=true;


                    }
                }
                catch (Exception ex)
                {
                    isSuccess = false;
                    z = "帳號重複";
                }
            }
            return z;
        }

        @Override
        protected void onPostExecute(String s) {

            Toast.makeText(getBaseContext(),""+z,Toast.LENGTH_LONG).show();


            if(isSuccess) {
                startActivity(new Intent(RegisteredActivity.this,login.class));

            }


            progressDialog.hide();
        }
    }


}

