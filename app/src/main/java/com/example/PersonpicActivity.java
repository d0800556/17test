package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class PersonpicActivity extends AppCompatActivity {

    private Button button3;
    //喧告要用的變數與物件
    private int fruitNo=0;
    ImageView image;
    Button button01,button001;
    ArrayList<String> fruit= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personpic);
        //將題目加入List
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                PersonpicActivity.this.finish();
            }
        });
        fruit= new ArrayList<String>();

        fruit.add("a");

        fruit.add("z");

        fruit.add("zz");

        fruit.add("zzz");

        GetFirstFruit();   //顯示圖片

        button01=(Button) findViewById(R.id.button2);
        button001=(Button) findViewById(R.id.button);

        button01.setOnClickListener(ButtonOnClick);
        button001.setOnClickListener(Button2OnClick);
    }
    private View.OnClickListener ButtonOnClick = new View.OnClickListener() {

        public void onClick(View v) {

            if(fruitNo>=fruit.size()-1)

                fruitNo=0; //超過題目位址,回到初始值

            else

                fruitNo++;

            GetFirstFruit();

        }

    };
    private View.OnClickListener Button2OnClick = new View.OnClickListener() {

        public void onClick(View v) {

            if(fruitNo<=0)

                fruitNo=fruit.size()-1; //超過題目位址,回到初始值

            else

                fruitNo--;

            GetFirstFruit();

        }

    };
    //顯示圖片

    private void GetFirstFruit(){

        image = (ImageView) findViewById(R.id.imageView);

        String[] fruitarray = new String[fruitNo]; //喧告字串陣列大小

        fruitarray = fruit.toArray(fruitarray); //將List放到字串陣列裡來

        String uri = "@drawable/" + fruitarray[fruitNo].toString(); //圖片路徑和名稱

        int imageResource = getResources().getIdentifier(uri, null, getPackageName()); //取得圖片Resource位子

        image.setImageResource(imageResource);

    }
}
