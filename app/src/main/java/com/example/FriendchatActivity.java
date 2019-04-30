package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FriendchatActivity extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b4;
    private Button ButtonTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendchat);
        b1 = (ImageButton)findViewById(R.id.b1);
        b2 = (ImageButton)findViewById(R.id.b2);
        b4 = (ImageButton)findViewById(R.id.b4);
        ButtonTest = (Button)findViewById(R.id.ButtonTest);
        b1.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendchatActivity.this, FriendActivity.class);
                startActivity(intent);
                FriendchatActivity.this.finish();
            }
        });
        b2.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendchatActivity.this, AddfriendActivity.class);
                startActivity(intent);
                FriendchatActivity.this.finish();
            }
        });
        b4.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendchatActivity.this, SettingActivity.class);
                startActivity(intent);
                FriendchatActivity.this.finish();
            }
        });
        ButtonTest.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendchatActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });
    }
}
