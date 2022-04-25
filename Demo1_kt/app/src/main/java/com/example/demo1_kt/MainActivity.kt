package com.example.demo1_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.demolib.LibraryMain

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView1)
        textView.text =
            "5+4 should be ${LibraryMain.add(5, 4)}, 5*4 should be ${LibraryMain.mul(5, 4)}"
    }
}