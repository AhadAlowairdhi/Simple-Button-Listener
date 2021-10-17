package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var kotlinButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton = findViewById(R.id.kotlinBtn)
        kotlinButton.setOnClickListener {
            Toast.makeText(applicationContext,"Coding", Toast.LENGTH_LONG ).show()
        }

    }
    fun clickButton(view: View){
        Toast.makeText(this@MainActivity,"xml",Toast.LENGTH_LONG).show()
    }
}