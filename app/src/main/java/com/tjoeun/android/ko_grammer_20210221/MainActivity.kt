package com.tjoeun.android.ko_grammer_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 변수로 => 정수를 담을 공간
        var num1: Int

        // 변수에 값 대입
        num1 = 10
        num1 = 20

        // 상수로
        val num2: Int
        num2 = 10
        //  num2 = 20                 //num2는 value(상수), 한번 대입하고나면 변경불가

        // Int, Double, String, Boolean 자동할당
        val num3 = 30                   //num3는 30이 int이므로 자동으로 Int
        val num4 = 3.14                 //num4는 Double이므로 자동으로 Double
        val teacherName = "조경진"       //String 자동할당
        val isMale = true               // Boolean자동할당

        Log.d("강사이름", teacherName)

        okBtn.setOnClickListner {
            val inputMessage = messageEdit.text.ToString()

            Toast.makeText(this, inputMessage.Text, Toast.LENGTH_SHORT).show()

            if (inputMessage == "안녕하세요"){
                Log.d("메인화면", "인사문구 입력됨")
            }
            else{
                Log.d("메인화면", "일반문구 입력됨")
            }
        }
    }
}