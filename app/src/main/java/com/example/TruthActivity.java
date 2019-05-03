package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class TruthActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truth);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void truth (View v){
        Random x=new Random();
        int y=x.nextInt(23);
        String truth[]=getResources().getStringArray(R.array.truth);
        textView.setText(truth[y]);
    }

    public void DO (View v){
        Random x=new Random();
        int y=x.nextInt(4);
        String DO[]=getResources().getStringArray(R.array.DO);
        textView.setText(DO[y]);
    }
}
