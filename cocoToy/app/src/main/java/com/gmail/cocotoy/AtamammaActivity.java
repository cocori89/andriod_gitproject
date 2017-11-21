package com.gmail.cocotoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AtamammaActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atamamma);





    }


    public void onClickShake(View v){
        img = findViewById(R.id.imageView);
        img.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake));
    }



    //뒤로가기
    public void onClickBack(View v){
           finish();
    }
}
