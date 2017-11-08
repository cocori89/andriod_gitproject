package androidhome.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    /*전역 변수*/
    /*텍스트를 가져 오는 객체*/
    /*자동으로 EditText를 찾아서 연결해주는 역할을 하는 듯 보임 */
    /*숫자를 찾아서 연결한후에 받아 올 준비를 하는 변수  */
    EditText editText1;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*activity_new.xml 파일의 코드를 가져와서 java코드로 바꿔두는 역할을 한다. */
        setContentView(R.layout.activity_calculator);
    }

    /*값을 받아서 가져오는 메서드*/
    /*값을 받아서 가져오는 메서드*/

    /*토스트 메세지를 뿌려주는 메서드*/
    void calculatorToast(int firstNum, int secondNum, int result, String mark){
        Toast.makeText(getApplicationContext(), firstNum+ mark +secondNum+ "="+result+"입니다.", Toast.LENGTH_LONG).show();
    }


    /*activity_calculator.xml에서 버튼을 클릭하게 되면 호출되는 함수 */
    void onButtonPlusClick(View v) {
        editText1 = findViewById(R.id.editText1);
        int firstNum = Integer.parseInt(editText1.getText().toString());
        editText2 = findViewById(R.id.editText2);
        int secondNum = Integer.parseInt(editText2.getText().toString());
        int result=0;
        String mark="+";
        result = firstNum + secondNum;
        calculatorToast(firstNum,secondNum,result,mark);
    }



    /*activity_calculator.xml에서 버튼을 클릭하게 되면 호출되는 함수 */
    void onButtonSubClick(View v) {
        editText1 = findViewById(R.id.editText1);
        int firstNum = Integer.parseInt(editText1.getText().toString());
        editText2 = findViewById(R.id.editText2);
        int secondNum = Integer.parseInt(editText2.getText().toString());
        int result=0;
        String mark="-";
        result = firstNum - secondNum;
        calculatorToast(firstNum,secondNum,result,mark);
    }


    /*나누기 함수*/
    void onButtonDivClick(View v) {
        editText1 = findViewById(R.id.editText1);
        int firstNum = Integer.parseInt(editText1.getText().toString());
        editText2 = findViewById(R.id.editText2);
        int secondNum = Integer.parseInt(editText2.getText().toString());
        int result=0;
        String mark="/";
        result = firstNum / secondNum;
        calculatorToast(firstNum,secondNum,result,mark);
    }

    /*나누기 함수*/
    void onButtonMulClick(View v) {
        editText1 = findViewById(R.id.editText1);
        int firstNum = Integer.parseInt(editText1.getText().toString());
        editText2 = findViewById(R.id.editText2);
        int secondNum = Integer.parseInt(editText2.getText().toString());
        int result=0;
        String mark="X";
        result = firstNum * secondNum;
        calculatorToast(firstNum,secondNum,result,mark);
    }





}
