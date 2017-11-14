package com.gmail.streamsboardgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NormalActivity extends AppCompatActivity {
    int numTile[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        setTitle("일반 모든 스트림스");

        /*게임이 시작되면서 타일 세팅과 게임 초기화*/
        NumberTile numberTile =  new NumberTile();// 타일 섞을 개체 만들기
        numberTile.mixTile();//타일 섞기
        numTile = numberTile.getNumberTile();// 섞은 타일 얻기
    }


}
