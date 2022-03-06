package com.bernardo.aboutme_bernardo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import android.graphics.BitmapFactory
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener {

            GoingToSecondScren()
        }
    }

    private fun GoingToSecondScren(){

        val secondScren = Intent(this,SecondScren::class.java)
        startActivity(secondScren)

        }
    }

