package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }

    public void End(View v)
    {
        CallActivity.this.finish();
    }
}
