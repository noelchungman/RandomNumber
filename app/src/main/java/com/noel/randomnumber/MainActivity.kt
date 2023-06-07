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
        val luckyNumberTV = findViewById<TextView>(R.id.luckyNumberTV)

        // 2nd property of Random.nextInt is until, so 101 will not be in possibility
        var luckyNumber = Random.nextInt(1,101)
        luckyNumberTV.text = luckyNumber.toString()
    }
}