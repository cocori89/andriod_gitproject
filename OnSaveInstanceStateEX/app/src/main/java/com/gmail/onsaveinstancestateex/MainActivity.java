package com.gmail.onsaveinstancestateex;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // 숫자 입력
    String[] testText = {"일","이","삼"};
    //출력할 인덱스 값
    int indexnum=0;

    // 텍스트 뷰
    TextView testView;
    // 텍스뷰 리스트
    ArrayList<TextView> textViewArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //뷰의 아이디 얻기
        textViewArrayList = new ArrayList<TextView>();// 안만들어줘서 그럼
        for(int i =0 ; i<3;i++){
            testView =  (TextView) findViewById(getResources().getIdentifier("textView"+i,"id","com.gmail.onsaveinstancestateex"));
            textViewArrayList.add(i,testView);
        }

        // 화면 전환시 인덱스 값을 저장하기 위한 메서드
        if(savedInstanceState != null){
           //int data = savedInstanceState.getInt("indexnum");
            indexnum=savedInstanceState.getInt("idx");

        }

    }


    // 클릭 했을 떄 저장하는 텍스트 뷰에 저장
    public void testClick(View v){
        testView = textViewArrayList.get(indexnum);
        testView.setText(testText[indexnum]);
        indexnum++;
        if(indexnum==3){
            indexnum=0;
        }

    }


    //1.일단 버튼의 인데스박만 유요하게 해서 일단 버튼만 작동 할수 있도록한다.

   /*오버라이드한다.*/
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("idx",indexnum);
    }
}
