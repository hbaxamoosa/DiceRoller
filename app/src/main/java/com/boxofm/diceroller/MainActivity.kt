package com.boxofm.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: com.boxofm.diceroller.databinding.ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // val rollButton: Button = findViewById(R.id.roll_button)

        binding.rollButton.setOnClickListener {
            // Toast.makeText(this, "button clicked", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        // diceImage = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // diceImage.setImageResource(drawableResource)
        binding.diceImage.setImageResource(drawableResource)
    }
}
