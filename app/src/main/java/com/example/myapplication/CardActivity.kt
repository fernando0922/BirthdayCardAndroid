package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val otherName = intent?.extras?.getString(OTHER_NAME).toString();
        val yourName = intent?.extras?.getString(YOUR_NAME).toString();

        val birthdayMessage:TextView = findViewById(R.id.to_message)
        val fromMessage:TextView = findViewById(R.id.from_message)

        birthdayMessage.text = "${this.getString(R.string.happy_birthday_text)}$otherName!!"
        fromMessage.text = "${this.getString(R.string.from)}$yourName."


    }
}