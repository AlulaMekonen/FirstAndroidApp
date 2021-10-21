package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find elements by id from the layout and assign them to variables
        var firsttext = findViewById<TextView>(R.id.text1)
        var clickMe = findViewById<Button>(R.id.clickMe)
        var secondText = findViewById<TextView>(R.id.text2)

        // call a click event on the button
        clickMe.setOnClickListener {
            //while the button is clicked display a greeting
            firsttext.text = "Hello HCC"
            secondText.text = "From My First Andriod App"
            //change the text
            clickMe.text = "Thank You"

        }


    }
}