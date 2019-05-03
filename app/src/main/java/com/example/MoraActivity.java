package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MoraActivity extends AppCompatActivity {

    private int fruitNo=0;
    ImageView image;
    ImageButton button1,button2,button3;
    ArrayList<String> fruit= null;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mora);
        fruit= new ArrayList<String>();
        fruit.add("okok");
        fruit.add("qq2");
        fruit.add("ww");
        fruit.add("ee");
        GetFirstFruit();
        button1=(ImageButton) findViewById(R.id.imageButton4);
        button2=(ImageButton) findViewById(R.id.imageButton5);
        button3=(ImageButton) findViewById(R.id.imageButton6);
        button1.setOnClickListener(imageButton4OnClick);
        button2.setOnClickListener(imageButton5OnClick);
        button3.setOnClickListener(imageButton6OnClick);
        tv1=(TextView)findViewById(R.id.TextView1);
    }
    private View.OnClickListener imageButton4OnClick = new View.OnClickListener() {

        public void onClick(View v) {
            fruitNo=1;
            tv1.setVisibility(View.VISIBLE);
            GetFirstFruit();
        }

    };
    private View.OnClickListener imageButton5OnClick = new View.OnClickListener() {

        public void onClick(View v) {
            fruitNo=2;
            tv1.setVisibility(View.VISIBLE);
            GetFirstFruit();
        }

    };
    private View.OnClickListener imageButton6OnClick = new View.OnClickListener() {

        public void onClick(View v) {
            fruitNo=3;
            tv1.setVisibility(View.VISIBLE);
            GetFirstFruit();
        }

    };
    private void GetFirstFruit(){
        image = (ImageView) findViewById(R.id.imageView4);
        String[] fruitarray = new String[fruitNo];
        fruitarray = fruit.toArray(fruitarray);
        String uri = "@drawable/" + fruitarray[fruitNo].toString();
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        image.setImageResource(imageResource);
    }
}
