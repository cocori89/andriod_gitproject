package com.gmail.appstudy2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ChackBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*xml의 정보를 모두 가져 와서 출력하고 이벤트 처리를 할 수 있는 방법*/
        setContentView(R.layout.activity_chackbox);
        setTitle("라디오 버튼 예제");

        // 주문하기 버튼의 객체정보를 가져옴
        Button btnOrder = (Button) findViewById(R.id.button5);

        // 음식 체크 버든의 객체 정보를 가져온
        final CheckBox cnkDonGas = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox cnkJjamPong = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox cnkGukSoo = (CheckBox) findViewById(R.id.checkBox3);

        //주문 음식을 출력한 텍스트의 객체 정보를 가져옴
        final TextView txtOrder = (TextView) findViewById(R.id.textView5);

        //주문 버튼 리스너 추가
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOrder.setText("주문완료");
                String result = "";
                // 체크가 된 경우 isChecked() == true -> 이부분이 체크박스 의 포인트
                if (cnkDonGas.isChecked()) result = result + "돈까스";
                if (cnkJjamPong.isChecked()) result = result + "짬뽕";
                if (cnkGukSoo.isChecked()) result = result + "국수";

                String order = txtOrder.getText().toString();// 주문완료라는 문장을 가져옴
                result = result + " "+order;
                txtOrder.setText(result);

            }
        });


    }

}
