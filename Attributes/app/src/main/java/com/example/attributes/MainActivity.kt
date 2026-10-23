package com.example.attributes

import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.res.ColorStateList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)

        // Чёрный цвет текста
        findViewById<Button>(R.id.button_black).setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        // Красный цвет текста
        findViewById<Button>(R.id.button_red).setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        // Размер текста 8sp
        findViewById<Button>(R.id.button_size_8).setOnClickListener {
            editText.setTextSize(8f)
        }

        // Размер текста 24sp
        findViewById<Button>(R.id.button_size_24).setOnClickListener {
            editText.setTextSize(24f)
        }

        // Белый фон
        findViewById<Button>(R.id.button_white).setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        // Жёлтый фон
        findViewById<Button>(R.id.button_yellow).setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}
