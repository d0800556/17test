package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {
    private LinearLayout bar;
    private TextView tv1;
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        bar = (LinearLayout)findViewById(R.id.bar);
        tv1 = (TextView)findViewById(R.id.tv1) ;
        et1 = (EditText)findViewById(R.id.et1) ;
        bar.bringToFront();
    }

    public void bar(View v)
    {
        bar = (LinearLayout)findViewById(R.id.bar);
        if (bar.getVisibility()==View.INVISIBLE) {
            bar.setVisibility(View.VISIBLE);
        }
        else
        {
            bar.setVisibility(View.INVISIBLE);
        }

    }

    public void game(View v){
        Intent intent = new Intent();
        intent.setClass(ChatActivity.this, GameActivity.class);
        startActivity(intent);
    }

    public void call(View v){
        Intent intent = new Intent();
        intent.setClass(ChatActivity.this, CallActivity.class);
        startActivity(intent);
    }

    public void send_text (View v)
    {
        tv1.setText(et1.getText());
        tv1.setVisibility(View.VISIBLE);
    }

}
