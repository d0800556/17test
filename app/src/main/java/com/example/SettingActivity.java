package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SettingActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button4;
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        b1 = (ImageButton)findViewById(R.id.b1);
        b2 = (ImageButton)findViewById(R.id.b2);
        b3 = (ImageButton)findViewById(R.id.b3);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button4 = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, SetpersonalActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, SetidActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, SetremindActivity.class);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, FriendActivity.class);
                startActivity(intent);
                SettingActivity.this.finish();
            }
        });
        b2.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, AddfriendActivity.class);
                startActivity(intent);
                SettingActivity.this.finish();
            }
        });
        b3.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, FriendchatActivity.class);
                startActivity(intent);
                SettingActivity.this.finish();
            }
        });
    }
}
