package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import kotlin.random.Random.Default.nextInt


class RandomActivity : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        var randomInt = 0

        if (count > 0) {
            randomInt = nextInt(count + 1)
        }

        textViewRandom.text = randomInt.toString()

        textViewLabel.text = getString(R.string.random_heading, count)
    }
}
