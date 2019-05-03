package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ChatActivity extends AppCompatActivity {
    private LinearLayout bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        bar = (LinearLayout)findViewById(R.id.bar);
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

}
