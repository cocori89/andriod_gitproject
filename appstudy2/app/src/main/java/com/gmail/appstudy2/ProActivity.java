package com.gmail.appstudy2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*xml의 정보를 모두 가져 와서 출력하고 이벤트 처리를 할 수 있는 방법*/
        setContentView(R.layout.activity_pro);
        setTitle("프로그레스바 버튼 예제");


        Button apply = (Button) findViewById(R.id.button11);
        final EditText inputText = (EditText) findViewById(R.id.editText);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            //메디터 값을 가져옴
            public void onClick(View view) {
            int num  = Integer.valueOf(inputText.getText().toString());

            if(num<0|| num>100){
                Toast.makeText(getApplicationContext(),"입력오류",Toast.LENGTH_LONG).show();

            }else {
                ProgressBar pro1 = (ProgressBar) findViewById(R.id.progressBar4);
                //프로그래스를 적용
                pro1.setProgress(num);
            }

            }
        });


    }

}
