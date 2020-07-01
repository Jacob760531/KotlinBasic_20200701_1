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
    }
}
