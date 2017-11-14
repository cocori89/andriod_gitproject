package com.gmail.appstudy;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_dice);
        setTitle("주사위 화면");

        /*리스너 형식으로 최대한 자바마나 만들어서 하기 */
        Button buttonDice = (Button) findViewById(R.id.buttonDice);// 뷰에서 버튼 정보 가져 오기
        final TextView textViewDice = (TextView) findViewById(R.id.textViewDice);// 뷰에서 텍스트 뷰 정보 가져오기
        /*buttonDice를 클릭하는 이벤트가 발생했을때 실행될수 있도록 하는 리스너*/
        buttonDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"주사위가 돌아갑니다.",Toast.LENGTH_LONG).show();//토스트 메시지

                int randomNum = ((int)((Math.random())*10))%6+1;//1~6까지 주사위가 나오게
                String result = randomNum+"";
                textViewDice.setText(result);


            }
        });

    }

}
