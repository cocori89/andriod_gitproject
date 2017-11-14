package com.gmail.streamsboardgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NormalActivity extends AppCompatActivity {
    int numTile[];
    int tileIntex=0;
    int getID;
    int[] idint =  new int[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        setTitle("일반 모든 스트림스");

        /*게임이 시작되면서 타일 세팅과 게임 초기화*/
        NumberTile numberTile =  new NumberTile();// 타일 섞을 개체 만들기
        numberTile.mixTile();//타일 섞기
        numTile = numberTile.getNumberTile();// 섞은 타일 얻기
        for(int i = 0; i<20;i++){
        getID = getResources().getIdentifier("numTileView"+(i),"id","com.gmail.streamsboardgame");
        idint[i]=getID;
        }

    }

    //버튼 누르면 타일 숫자 출력
    void setNumberTile(View v){
        if(tileIntex==20){
            return;
        }
        //TextView textView = findViewById(R.id.textView0);
        TextView textView = (TextView) findViewById(idint[3]);
        textView.setText(String.valueOf(numTile[0]));
        tileIntex++;
    }


}
