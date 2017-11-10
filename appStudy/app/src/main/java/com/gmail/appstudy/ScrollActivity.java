package com.gmail.appstudy;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class ScrollActivity extends AppCompatActivity {


    /*이미지 변경을 위한 변수*/
    ScrollView scroll;
    ImageView img;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_scroll);
        setTitle("스크롤 뷰 화면");

        scroll = (ScrollView) findViewById(R.id.scrollView1);
        img = (ImageView) findViewById(R.id.imageView);
//        button = (Button) findViewById(R.id.button4);
    }

    //추가소스

    void changeImg(View v){
        changeImgae();
    }

    /*이미지를 변하는 메서드*/
    void changeImgae(){
    BitmapDrawable bitmap;
//        scroll.setHorizontalScrollBarEnabled(true);
        Resources res = getResources();
        bitmap =(BitmapDrawable) res.getDrawable(R.drawable.flower);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        // 이미지 뷰를 새로운 이미지로 세팅
        img.setImageDrawable(bitmap);
        img.getLayoutParams().width=bitmapWidth;
        img.getLayoutParams().height=bitmapHeight;
    }
}
