package kr.co.tjoeun.kotlinbasic_20200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchBtn.setOnClickListener {
        // touchBtn이 눌리면 실행될 코드를 적는 {}

            //Toast를 이용해 사용자에게 안내 메세지.
//            Toast.makeText(this, "터치버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "터치버튼을 눌렀습니다.", Toast.LENGTH_LONG).show()

            Log.d("메인화면","터치버튼눌렸다")

            Log.e("메인화면","에러찍자")
        }

        touchBtn2.setOnClickListener {
            Toast.makeText(this,"두번째 버튼을 눌렸다",Toast.LENGTH_SHORT).show()
            Log.d("메인화면","두번째 버튼을 눌렀다")
        }

//        토스트띄우기 버튼이 눌리면
        showToastBtn.setOnClickListener {
//            EditText에 입력된 내용을 받자. (string 으로 저장해두자)
//            대입값이 string이면 변수타입도 자동으로 string으로 결정
            val inputContent = inputContentEdt.text.toString()

            Toast.makeText(this,inputContent,Toast.LENGTH_SHORT).show()

//            val num1 = 10
        }
    }
}
