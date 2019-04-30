package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FriendpersonActivity extends AppCompatActivity {
    private ImageButton imageButton2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendperson);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        button = (Button)findViewById(R.id.button);
        imageButton2.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendpersonActivity.this, PersonpicActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(FriendpersonActivity.this, ChatActivity.class);
                startActivity(intent);
                FriendpersonActivity.this.finish();
            }
        });
    }
}
