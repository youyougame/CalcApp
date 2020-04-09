package jp.techacademy.yusuke.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.truncate

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener {
            if (editText1.text.toString() != "" && editText2.text.toString() != "") {
                if (editText1.text.toString() != "." && editText2.text.toString() != ".") {
                    val num1: Double = editText1.text.toString().toDouble()
                    val num2: Double = editText2.text.toString().toDouble()
                    val answer: Double = num1 * num2
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE", answer)
                    startActivity(intent)
                } else {
                    textView2.text = "数値を入力してください"
                }
            } else {
                textView2.text = "何か数値を入力してください"
            }

        }
        button2.setOnClickListener {
            if (editText1.text.toString() != "" && editText2.text.toString() != "") {
                if (editText1.text.toString() != "." && editText2.text.toString() != ".") {
                    val num1: Double = editText1.text.toString().toDouble()
                    val num2: Double = editText2.text.toString().toDouble()
                    if (num2 != 0.0) {
                        val answer: Double = num1 / num2
                        val intent = Intent(this, SecondActivity::class.java)
                        intent.putExtra("VALUE", answer)
                        startActivity(intent)
                    } else {
                        textView2.text = "ゼロ除算のため、計算できません"
                    }
                } else {
                    textView2.text = "数値を入力してください"
                }
            } else {
                textView2.text = "何か数値を入力してください"
            }

        }
        button3.setOnClickListener {
            if (editText1.text.toString() != "" && editText2.text.toString() != "") {
                if (editText1.text.toString() != "." && editText2.text.toString() != ".") {
                    val num1: Double = editText1.text.toString().toDouble()
                    val num2: Double = editText2.text.toString().toDouble()
                    val answer: Double = num1 + num2
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE", answer)
                    startActivity(intent)
                } else {
                    textView2.text = "数値を入力してください"
                }
            } else {
                textView2.text = "何か数値を入力してください"
            }
        }
        button4.setOnClickListener {
            if (editText1.text.toString() != "" && editText2.text.toString() != "") {
                if (editText1.text.toString() != "." && editText2.text.toString() != ".") {
                    val num1: Double = editText1.text.toString().toDouble()
                    val num2: Double = editText2.text.toString().toDouble()
                    val answer: Double = num1 - num2
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE", answer)
                    startActivity(intent)
                } else {
                    textView2.text = "数値を入力してください"
                }
            } else {
                textView2.text = "何か数値を入力してください"
            }
        }





    }

}
