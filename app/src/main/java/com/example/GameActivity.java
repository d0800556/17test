package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
    public void face(View v){
        Intent intent = new Intent();
        intent.setClass(GameActivity.this, FaceActivity.class);
        startActivity(intent);
    }
    public void mora(View v){
        Intent intent = new Intent();
        intent.setClass(GameActivity.this, MoraActivity.class);
        startActivity(intent);
    }
    public void truth(View v){
        Intent intent = new Intent();
        intent.setClass(GameActivity.this, TruthActivity.class);
        startActivity(intent);
    }
}
