package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello, Toast", LENGTH_SHORT)

        myToast.show()
    }

    fun countMe(view: View){
        val countString = textView.text.toString()

        var count: Int = countString.toInt()
        count++

        textView.text=count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, RandomActivity::class.java)

        val countString = textView.text.toString()

        val count = countString.toInt()

        randomIntent.putExtra(RandomActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)

    }
}
