package com.gmail.appstudy;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_scroll);
        setTitle("주사위 화면");

        /*리스너 형식으로 최대한 자바마나 만들어서 하기 */
    }

}
