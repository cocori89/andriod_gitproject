package com.gmail.appstudy3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("스피너예제");

        String[] nation = {"한국","미국","러시아","중국","일본"};
        String[] city =  {"서울","위싱턴","모스크바","베이징","도쿄"};

        Spinner s1 = (Spinner) findViewById(R.id.spinner1);// 선택뷰
        Spinner s2 = (Spinner) findViewById(R.id.spinner2);// 드롭다운 뷰

        //글자나 레이아웃을 적용할려면 필요한거 ? Adapter
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.spin,nation);
        adapter.setDropDownViewResource(R.layout.spindropbox);
        s1.setAdapter(adapter);

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),R.layout.spin,city);
        arrayAdapter.setDropDownViewResource(R.layout.spindropbox);
        s2.setAdapter(arrayAdapter);

    }
}
