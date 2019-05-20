package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PersonActivity extends AppCompatActivity {
    private Button button;
    private ImageButton imageButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        button = (Button)findViewById(R.id.button);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PersonActivity.this, InviteActivity.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton2.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PersonActivity.this, PersonpicActivity.class);
                startActivity(intent);
            }
        });
    }
}
