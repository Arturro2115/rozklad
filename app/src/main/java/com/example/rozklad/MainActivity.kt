package com.example.rozklad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.oblicz) .setOnClickListener{
            var x = findViewById<EditText>(R.id.liczba).text.toString().toInt()
            var y = 2
            val wynik = mutableListOf<String>()

            do {
                do {
                    val x2 = x.toString()
                    wynik += x2
                    x /= y
                }
                    while (x % y == 0)
                    x +=1
            }
                while (x>1)
                findViewById<TextView>(R.id.wynik).text = wynik.toString()
        }
    }
}