package com.gmail.appstudy2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*xml의 정보를 모두 가져 와서 출력하고 이벤트 처리를 할 수 있는 방법*/
        setContentView(R.layout.activity_radio);
        setTitle("라디오 버튼 예제");

        /*화면에 클릭한 버튼의 정보를 가져옴*/
        Button button = (Button) findViewById(R.id.button4);
        /*라디오그룹 정보를 가져 온다.*/
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        final TextView textMsg = (TextView) findViewById(R.id.textView2);// 출력할 view를 찾음

        /*아래 버튼*/
        Button button5 = (Button) findViewById(R.id.button5);
        final RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        final TextView textMsg4 = (TextView) findViewById(R.id.textView4);// 출력할 view를 찾음

        /*xml에서 추가로 코딩하지 않고 java로만 onClick 이벤트 처리방법*/
        /*OnClick 리스너를 만들어서 버튼을 누르면 이벤트가 발생하면 알수 있도록 하는 함수 이다. */
        /*내장 클래스 (내장 클래스의 경우에는 컴파일을 할경우에는 class파일이 하나더 생긴다. )*/
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View n){
                /*아이디의 값은 int 값으로 되어있다.*/
                int id = radioGroup.getCheckedRadioButtonId();// 체크되어진 라디오 버튼의 아이디를 가져 온다
                RadioButton radioButton = findViewById(id); // 찾아온 라디오 버튼의 아이디를 이용 하여 체크되어진 라디오 버튼의 정보를 가져온다

                String teamName = radioButton.getText().toString();
                textMsg.setText(teamName+"팀의 우승을 축하합니다. ");
            }
        });
//--------------------------- 아래 버튼
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            int id = radioGroup2.getCheckedRadioButtonId();// 체크되어진 라디오 버튼의 아이디를 가져 온다
            RadioButton radioButton = findViewById(id); // 찾아온 라디오 버튼의 아이디를 이용 하여 체크되어진 라디오 버튼의 정보를 가져온다
            String subjectName = radioButton.getText().toString();
            textMsg4.setText("과목은:" + subjectName);
            }
        });
    }

}
