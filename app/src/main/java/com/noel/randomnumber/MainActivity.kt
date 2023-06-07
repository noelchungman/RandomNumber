package com.noel.randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun generateNextNum(v: View){
        var luckyNumberTV = findViewById<TextView>(R.id.luckyNumberTV)
        var luckyNumber = Random.nextInt(1,99)
        luckyNumberTV.text = luckyNumber.toString()
    }
}