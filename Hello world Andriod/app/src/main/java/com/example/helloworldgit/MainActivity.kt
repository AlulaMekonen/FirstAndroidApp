package com.example.helloworldgit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find views by their Id and assign it to a variable
        var clickButton = findViewById<Button>(R.id.clickMeButton)
        var firstTxt = findViewById<TextView>(R.id.text1)
        var secondTxt = findViewById<TextView>(R.id.text2)


        // add an event listener for a click, when button is clicked display a greeting text
        clickButton.setOnClickListener {
            firstTxt.setText("Greeting From")
            secondTxt.setText("First Andriod App")

        }

    }
}