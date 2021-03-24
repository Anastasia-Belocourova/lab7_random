package com.example.random7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val textView1 = findViewById<TextView>(R.id.textView)
        val res1 = findViewById<TextView>(R.id.textView2)
        val res2 = findViewById<TextView>(R.id.textView3)

        btn.setOnClickListener {
            val random = Random.nextInt(-100, 100) +1
            textView1.text = random.toString()
            val r = when {
                (random%2)==0 -> res1.text = "Число чётное"
                else -> res1.text = "Число нечётное"
            }

            val s = when {
                random > 0 -> res2.text = "Число положительное"
                random <0 -> res2.text = "Число отрицательное"
                else -> res2.text = "Cгенерированное число = 0"
            }
        }
    }
}