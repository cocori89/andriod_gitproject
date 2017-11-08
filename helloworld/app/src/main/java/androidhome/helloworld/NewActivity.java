package androidhome.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    /*전역 변수*/
    /*텍스트를 가져 오는 객체*/
    /*자동으로 EditText를 찾아서 연결해주는 역할을 하는 듯 보임 */
    EditText editText;

    /*나이를 찾아 오는 객체*/
    EditText editText2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*activity_new.xml 파일의 코드를 가져와서 java코드로 바꿔두는 역할을 한다. */
        setContentView(R.layout.activity_new);
    }

    /*activity_main.xml에서 버튼을 클릭하게 되면 호출되는 함수 */
    void onButtonShowMessageClicked(View v) {
        /*xml에서 찾아서 가져와야 한다.*/
        /*자바 스크립트처럼 Id를 가져 오는 것처럼 가져 오는 것이다. */
        /*이름을 가져 오는 것이다. */
        editText = findViewById(R.id.editText);
        /*나이의 아이디를 찾아서 가져 온다. */
        editText2 = findViewById(R.id.editText2);

        /*들어오는 객체가 Object형이기 떄문에 text를 가져 온 추에 String 형으로 변환해준다. */
        /*이름을 String 형으로 변형한다.*/
        String name =editText.getText().toString();
        /*나이를 STring 형으로 변환 해서 이름 뒤에 더해순다. */
        name =name+editText2.getText().toString();

        /*Toast 메세지를 띄어준다. */
        Toast.makeText(getApplicationContext(), name+"입니다.", Toast.LENGTH_LONG).show();
    }






}
