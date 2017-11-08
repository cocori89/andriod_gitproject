package androidhome.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*activity_main.xml 파일의 코드를 가져와서 java코드로 바꿔두는 역할을 한다. */
        setContentView(R.layout.activity_main);
    }

    /*activity_main.xml에서 버튼을 클릭하게 되면 호출되는 함수 */
    void onButtonClicked(View v) {
        /*화면에 출력할 메시지*/
        String text = "1~100의 합은? ";
        int sum =0; // 1~100까지의 합
        /*for문을 사용 하여 1~100까지의 합을 구한다.*/
        for(int i = 0 ; i<=100;i++){
            sum += i;
        }

        text = text + sum;

        /*웹에서 alert창 처럼 문장이 뜨는 역할을 한다. */
        /*text+sum을 활용 하여 화면에 원하는 값을 출력한다.*/
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    /*네이버 접속하기 버튼을 누르면 naver에 접속 할수 있도록하는 메서드*/
    void onButtonNaverClicked(View v){
        /*네이버 접속하기 버튼을 누르면  "네이버를 접속합니다라 는 메세지가 뜸"*/
        Toast.makeText(getApplicationContext(),"네이버에 접속합니다. ",Toast.LENGTH_LONG).show();

        /*네이버 접속 하기 버튼이 클릭이 되었을때  실제 네이버에 접속 할수 있도록 하는 객체*/
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        /*Intent 객체를 시작하는 메서드*/
        startActivity(myIntent);
    }

    /*전화걸기 버튼을 누르면 전화가 걸릴수 있도록 하는 메서드*/
    void onButtonPhoneClicked(View v){
        /*전화걸기 버튼을 누르면 "전화를 겁니다"라는메세지가 뜸*/
        Toast.makeText(getApplicationContext(),"전화를 겁니다.!!",Toast.LENGTH_LONG).show();

        /*전화 걸기 버튼을 누르면 정말로 전화가 걸릴 수 있도록 하는 객체*/
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0001"));
        /*만들어진 Intent객체를 시작할수 있도록 하는 메서드*/
        startActivity(myIntent);
    }
}
