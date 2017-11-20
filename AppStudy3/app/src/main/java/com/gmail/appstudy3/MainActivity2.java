package com.gmail.appstudy3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //String LIST_MENU ="리스트";
    final String[]  LIST_MENU = {"리스트1", "리스트2","리스트3"};// 0,1,2, 순으로
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //리스트 글자들을 리스트 뷰에 담으려면 필요 한 것이 있는데 그것이 adpater이다 .
        //BaseAdapter
        //값자체가 리스트 형태이기 떄문에 ArrayAdapter를 사용 한다.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,LIST_MENU);
        //컨텍스트,리스트뷰의 레이아웃, 리스트 글자

        ListView listView = (ListView)  findViewById(R.id.listView); // 레이아웃이 있는 리스트 뷰
        listView.setAdapter(adapter);//어답터를 세팅 해준다.

        //리스트 뷰의 아이템들을 클리했을때 작동하는 메서드
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v,int pos,long i) { // pos : 인덱스 값
                String selectTile = (String) parent.getItemAtPosition(pos);
                Toast.makeText(getApplicationContext(),selectTile,Toast.LENGTH_LONG).show();
            }
        });


    }

    public void back(View v){
        finish();
    }
}
