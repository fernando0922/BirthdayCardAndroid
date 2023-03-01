package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val otherName:TextView = findViewById(R.id.other_name)
        val yourName:TextView = findViewById(R.id.your_name)
        val button: Button = findViewById(R.id.go)

        button.setOnClickListener {
            if(otherName.text.length > 1 && yourName.text.length > 1 ){
                Toast.makeText(this, "DONE :) !!", Toast.LENGTH_SHORT).show()
                val intent:Intent = Intent(this, CardActivity::class.java)
                intent.putExtra(OTHER_NAME,otherName.text.toString())
                intent.putExtra(YOUR_NAME,yourName.text.toString())
                startActivity(intent)
            }else {
                Snackbar.make(
                    findViewById(R.id.mainCoordinatorLayout),
                    R.string.fill_fildes,
                    Snackbar.LENGTH_LONG
                ).setBackgroundTint(this.getColor(R.color.teal_700)).show()
            }
        }

    }
}