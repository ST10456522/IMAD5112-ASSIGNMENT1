package com.example.assignment1project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btncancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..12 -> "child"
                    in 13..19 -> "Teenager"
                    in 20..59 -> "Adult"
                    else -> "Senior"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "child" -> "you are a child."
                        "Teenager" -> "you are a teenager."
                        "Adult" -> "you are an Adult"
                        else -> "You are a senior"
                    }

                } "
                else {
                    txtResult.text = "Please enter a valid age"
                }
            }
        }
    }
}
