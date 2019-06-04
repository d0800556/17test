package com.example;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class login extends AppCompatActivity {
    private Button button;
    private Button button2;
    private EditText name,pass;
    ProgressDialog progressDialog;
    ConnectionClass connectionClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        name = (EditText)findViewById(R.id.name);
        pass = (EditText)findViewById(R.id.pass);

        connectionClass = new ConnectionClass();

        progressDialog=new ProgressDialog(this);

        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Dologin dologin =new Dologin();
                dologin.execute("");
                /*Intent intent = new Intent();
                intent.setClass(login.this, MainActivity.class);
                startActivity(intent);
                login.this.finish();*/
            }
        });
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(login.this, RegisteredActivity.class);
                startActivity(intent);
            }
        });

    }
    private class Dologin extends AsyncTask<String,String,String>{
        String namestr=name.getText().toString();
        String passstr=pass.getText().toString();
        String z = "請確認帳號密碼是否正確";
        boolean isSuccess=false;
        String nm,password;

        @Override
        protected void onPreExecute() {
            progressDialog.setMessage("讀取中...");
            progressDialog.show();
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... params) {
            if(namestr.trim().equals("")||passstr.trim().equals(""))
                z = "請輸入帳密";
            else
            {
                try {
                    Connection con = connectionClass.CONN();
                    if (con == null) {
                        z = "請確認連線";
                    }
                    else {
                        String query=" select * from test where name='"+namestr+"'  and PASSWORD = '"+passstr+"'";
                        Statement stmt = con.createStatement();
                        // stmt.executeUpdate(query);
                        ResultSet rs=stmt.executeQuery(query);
                        while (rs.next())
                        {
                            nm= rs.getString(1);
                            password=rs.getString(3);
                            if(nm.equals(namestr)&&password.equals(passstr))
                            {
                                isSuccess=true;
                                z = "登入成功";
                            }
                            else
                            {
                                isSuccess=false;
                                z = "請確認帳號密碼是否正確";
                            }
                        }
                    }
                }
                catch (Exception ex)
                {
                    //isSuccess = false;
                    //z = "請確認帳號密碼是否正確";
                }
            }
            return z;        }

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(getBaseContext(),""+z,Toast.LENGTH_LONG).show();


            if(isSuccess) {
                Intent intent=new Intent(login.this,MainActivity.class);
                intent.putExtra("name",namestr);
                startActivity(intent);
                finish();
            }
            progressDialog.hide();

        }
    }
}
