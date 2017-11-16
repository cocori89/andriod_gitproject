package com.gmail.appstudy2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//Button.OnClickListener 인터페이스이므로 함수의 재정의 필요함
//인터페이스는 모든 함수가 추상 함수인 클래스
//추상함수는 함수 이름만 있고 구현 되지 않은 상수
public class AlertActivity extends AppCompatActivity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*xml의 정보를 모두 가져 와서 출력하고 이벤트 처리를 할 수 있는 방법*/
        setContentView(R.layout.activity_alert);
        setTitle("알람 버튼 예제");

        /*알람 버튼 물렀을때 */
        Button btnAlert = findViewById(R.id.button13);
        btnAlert.setOnClickListener(this);//여기서 this를 하면 @Override한 OnClick methiod가 실행된다.
    }
    //리스너는 무조건 재정의 한다. 왜냐하면 추상 함수 이기 때문이다.
    @Override
    public void onClick(View view) {
        showAlert();
    }


    public void showAlert(){// 알람 뜨는 메서드
        /*알람을 띄어주는 기능을 넣어준다. */
        AlertDialog.Builder buller = new AlertDialog.Builder(this);// 어디에 띄울지 (목표지점)
        buller.setTitle("알림 다이얼로그 제목");// 다이얼로그의 제목
        buller.setMessage("메세지 내용입니다. "); // 다이얼 로그의 내용

        buller.setPositiveButton("예[=확인]", /*확인(그정하는 버튼)을 눌렀을때 어떤 기능 을 만글때 */
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        buller.setNegativeButton("아니오",//부정한 메세지를 만들때
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        buller.setNeutralButton("중립 버튼 취소!",// 취소 버튼
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        buller.show();
    }


}
