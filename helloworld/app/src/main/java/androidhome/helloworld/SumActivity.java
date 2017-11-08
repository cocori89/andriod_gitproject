package androidhome.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {
    /*전역 변수*/
    /*텍스트를 가져 오는 객체*/
    /*자동으로 EditText를 찾아서 연결해주는 역할을 하는 듯 보임 */
    /*첫 숫자를 찾아서 연결한후에 받아 올 준비를 하는 변수  */
    EditText editText;

    /*마지막 숫자를 찾아서 연결 후에 받아 올 준비를 하는 변수*/
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*activity_new.xml 파일의 코드를 가져와서 java코드로 바꿔두는 역할을 한다. */
        setContentView(R.layout.activity_sum);
    }

    /*activity_sum.xml에서 버튼을 클릭하게 되면 호출되는 함수 */
    void onButtonShowMessageClicked(View v) {
        /*xml에서 찾아서 가져와야 한다.*/
        /*자바 스크립트처럼 Id를 가져 오는 것처럼 가져 오는 것이다. */
        /*첫 숫자를  가져 오는 것이다. */
        editText = findViewById(R.id.editText);
        /*마지막 숫자를 찾아서 가져 온다. */
        editText2 = findViewById(R.id.editText2);

        /*첫번째 들어오는 숫자 형변환 Object->String->Integer*/
        int first = Integer.parseInt(editText.getText().toString());
        /*마지막  들어오는 숫자 형변환 Object->String->Integer*/
        int second = Integer.parseInt(editText2.getText().toString());

        /*첫번째 들어오는 숫자부터 시작해서 마지막 끝나는 숫자까지 더하기*/
        int sum=0;
        for(int i = first;second>=i ; i++){
            sum += i;
        }



        /*Toast 메세지를 띄어준다. */
        Toast.makeText(getApplicationContext(), "시작숫자 : "+first+ "끝나는 숫자 " +second+ "사이의 모든 합은"+sum+"입니다.", Toast.LENGTH_LONG).show();
    }






}
