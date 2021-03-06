package com.example.philipdiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage1: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage1 = findViewById(R.id.dice_image1)
        // Get the Button view from the layout and assign a click
        // listener to it.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {
         Toast.makeText(this, "button clicked",
          Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        val randomInt1 = (1..6).random()

        val diceImage1: ImageView = findViewById(R.id.dice_image1)

        val drawableResource1 = when (randomInt1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage1.setImageResource(drawableResource1)

        val resultText: TextView = findViewById(R.id.result_text)
        val sum = randomInt + randomInt1
        val total = "Total: "
        resultText.text = total + sum.toString()
    }
}