package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {

       Toast.makeText(this, "roll clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        //  resultText.text = "Dice Rolled!"
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()



    }
private fun countUp()
{
    Toast.makeText(this, "counter clicked", Toast.LENGTH_SHORT).show()
    val resultText: TextView = findViewById(R.id.result_text)
    val str: String=resultText.text.toString()
    val output=str.toInt()
    val randomInt=output+1
    resultText.text= randomInt.toString()

}
    private fun resetDice() {
        Toast.makeText(this, "reset clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text="0";

    }
}