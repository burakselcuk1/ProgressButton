package com.example.progressbutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view:View

        view = findViewById(R.id.myProgressButton)

        view.setOnClickListener {
            val progressButton = ProgressButton(this,view)

            progressButton.ActiveButton()

            Handler().postDelayed({
                progressButton.finishButton()
                Handler().postDelayed({
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                },2000)
            },3000)
        }
    }
}