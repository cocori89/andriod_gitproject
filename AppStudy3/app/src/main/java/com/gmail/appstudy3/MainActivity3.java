package com.gmail.appstudy3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("스피너예제");

        final String[] nation = {"한국","미국","러시아","중국","일본"};
        String[] city =  {"서울","위싱턴","모스크바","베이징","도쿄"};

        Spinner s1 = (Spinner) findViewById(R.id.spinner1);// 선택뷰
        Spinner s2 = (Spinner) findViewById(R.id.spinner2);// 드롭다운 뷰

        //글자나 레이아웃을 적용할려면 필요한거 ? Adapter
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.spin,nation);
        adapter.setDropDownViewResource(R.layout.spindropbox);

        s1.setAdapter(adapter);
        s1.setSelection(1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),R.layout.spin,city);
        arrayAdapter.setDropDownViewResource(R.layout.spindropbox);
        s2.setAdapter(arrayAdapter);

        //국가 스피너에 대한 이벤트 처리
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            // 다른 아이템을 선택할 경우
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                String selNation =  nation[pos];
                Toast.makeText(getApplicationContext(),selNation,Toast.LENGTH_LONG).show();
            }

            //아무것도 택하지 않았을 경우
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(getApplicationContext(),"선택안함",Toast.LENGTH_LONG).show();
            }
        });



    }
}
