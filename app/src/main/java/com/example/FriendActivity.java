package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FriendActivity extends AppCompatActivity {
    private Button ButtonTest;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        ButtonTest = (Button)findViewById(R.id. ButtonTest);
        b2 = (ImageButton)findViewById(R.id.b2);
        b3 = (ImageButton)findViewById(R.id.b3);
        b4 = (ImageButton)findViewById(R.id.b4);
        ButtonTest.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendActivity.this, FriendpersonActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendActivity.this, AddfriendActivity.class);
                startActivity(intent);
                FriendActivity.this.finish();
            }
        });
        b3.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendActivity.this, FriendchatActivity.class);
                startActivity(intent);
                FriendActivity.this.finish();
            }
        });
        b4.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendActivity.this, SettingActivity.class);
                startActivity(intent);
                FriendActivity.this.finish();
            }
        });
    }
}
