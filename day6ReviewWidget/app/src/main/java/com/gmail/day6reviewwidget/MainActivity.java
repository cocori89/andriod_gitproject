package com.gmail.day6reviewwidget;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("기본위젯 연습");

        /*글자 보이기 */
        Button button = findViewById(R.id.button);
        final EditText editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();//텍스트를 가져옴
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });

        /*사이트 접속 하기*/
        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = editText.getText().toString();
                Intent uriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + uri));// 홈페이지 이동
                startActivity(uriIntent);
            }
        });

        /*이미지 변경하기*/
        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 /*이미지의 경우에도 계속 적으로 바뀌어야 하기 때문에 이리로 들어와야한다.*/
                ImageView imgView = findViewById(R.id.imageView);
                /*라디오 버튼은 유동적이기 때문에 바꿔줘야한다. */
                RadioGroup radioGroup = findViewById(R.id.radioGroup);
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);// 라디오 버튼의 아이디를 얻는다.
                Resources resources = getResources();// 자원을 얻는다.
                BitmapDrawable bitmap = null;
                /*라디오 버튼이 무엇이 있는지 판단한다*/
                if (radioButton.getText().toString().equals("킬켓")) {
                    bitmap = (BitmapDrawable) resources.getDrawable(R.drawable.and_kitkat); // 경로에 접근한다.
                } else if (radioButton.getText().toString().equals("롤리팟")) {
                    bitmap = (BitmapDrawable) resources.getDrawable(R.drawable.and_lollipop);
                }
                 int bitmapWidth = bitmap.getIntrinsicWidth(); // 이미지의 크기를 구한다.
                 int bitmapHeghit = bitmap.getIntrinsicHeight(); //이미지의 크기를 구한다.
                imgView.setImageDrawable(bitmap); // 이미지뷰에 넣어준다.
                imgView.getLayoutParams().width = bitmapWidth; // 이미지 크기를 세팅해준다.
                imgView.getLayoutParams().height = bitmapHeghit; //이미지 크기를 세팅해준다.

            }
        });


    }


}
