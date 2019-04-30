package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SetpersonalActivity extends AppCompatActivity {
    private Button button;
    private ImageButton imageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setpersonal);
        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        button = (Button)findViewById(R.id.button);
        imageButton1.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SetpersonalActivity.this, SetperpicActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                SetpersonalActivity.this.finish();
            }
        });
    }
}
