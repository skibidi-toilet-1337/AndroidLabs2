package com.example.logging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Инициализация Timber
        Timber.plant(Timber.DebugTree())

        //находим элементы интерфейса
        val editText = findViewById<EditText>(R.id.edit_text)
        val buttonLog = findViewById<Button>(R.id.button_log)
        val buttonTimber = findViewById<Button>(R.id.button_timber)

        //лог Android Log
        buttonLog.setOnClickListener {
            val text = editText.text.toString()
            Log.v("From EditText", text)
        }

        //лог Timber
        buttonTimber.setOnClickListener {
            val text = editText.text.toString()
            Timber.v(text)
        }
    }
}
