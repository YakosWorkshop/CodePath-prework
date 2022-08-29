package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



// This kotlin file
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            Log.i("jacob", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
        findViewById<Button>(R.id.button2).setOnClickListener {

            findViewById<View>(R.id.backgroundView).setBackgroundColor(resources.getColor(R.color.purple_500))
        }


    }
}