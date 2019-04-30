package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AddfriendActivity extends AppCompatActivity {
    private Button button2;
    private ImageButton b1;
    private ImageButton b3;
    private ImageButton b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfriend);
        b1 = (ImageButton)findViewById(R.id.b1);
        b3 = (ImageButton)findViewById(R.id.b3);
        b4 = (ImageButton)findViewById(R.id.b4);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AddfriendActivity.this, CheckActivity.class);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AddfriendActivity.this, FriendActivity.class);
                startActivity(intent);
                AddfriendActivity.this.finish();
            }
        });
        b3.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AddfriendActivity.this, FriendchatActivity.class);
                startActivity(intent);
                AddfriendActivity.this.finish();
            }
        });
        b4.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AddfriendActivity.this, SettingActivity.class);
                startActivity(intent);
                AddfriendActivity.this.finish();
            }
        });
    }
}
