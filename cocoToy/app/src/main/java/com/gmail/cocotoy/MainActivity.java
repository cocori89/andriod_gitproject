package com.gmail.cocotoy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer bgm;// 아따 맘마 배경음악
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*아따맘마 배경음악*/
        bgm = MediaPlayer.create(this,R.raw.Atamamma_hello);// (여기 이 엑티비티에서 실행하며, R.raw.Atamamma_hello에 있는 자원을 만든다.)
        bgm.setLooping(true);// 연속적으로 계속 해서 재생한다.
        bgm.start();// 음악지 재생됨


    }

    //아따 맘마로 이동
    public void atamamma(View v) {
        Intent  atamam = new Intent(getApplicationContext(), AtamammaActivity.class);
        startActivity(atamam);

    }
}
