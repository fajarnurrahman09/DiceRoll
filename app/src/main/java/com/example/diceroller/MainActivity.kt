package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
// Dibawah kode untuk memunculkan text ketika tombol di tekan
//            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
//            toast.show()
// Atau bisa menggunakan kode dibawah
//            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
// KETIKA TOMBOL DITEKAN AKAN KELUAR ANGKA 6
//            val resultTextView: TextView = findViewById(R.id.textView).
//            resultTextView.text = "6"
            rollDice()
        }
    }
    private fun rollDice() {
//        membuat 6 sisi pada dadu
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll2()

//        mengupdate tampilan screen
        val diceImage: ImageView = findViewById(R.id.imageView)
        // mengatur perubahan dadu sesuai dengan gambar
        when (diceRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        // dibawah ini adalah kode singkatnya
//        val drawableResource = when (diceRoll){
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        // mengubah gambar agar sesuai dengan ID
//        diceImage.setImageResource(drawableResource)
        // menambahkan deskripsi dadu
        diceImage.contentDescription = diceRoll.toString()

        val diceImage2: ImageView = findViewById(R.id.imageView2)
        when (diceRoll2){
            1 -> diceImage2.setImageResource(R.drawable.dice_1)
            2 -> diceImage2.setImageResource(R.drawable.dice_2)
            3 -> diceImage2.setImageResource(R.drawable.dice_3)
            4 -> diceImage2.setImageResource(R.drawable.dice_4)
            5 -> diceImage2.setImageResource(R.drawable.dice_5)
            6 -> diceImage2.setImageResource(R.drawable.dice_6)
        }
//        val drawableResource = when (diceRoll2){
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        // mengubah gambar agar sesuai dengan ID
//        diceImage2.setImageResource(drawableResource)
        // menambahkan deskripsi dadu
        diceImage2.contentDescription = diceRoll2.toString()

    }
}
class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
    fun roll2(): Int{
        return (1..numSides).random()
    }
}