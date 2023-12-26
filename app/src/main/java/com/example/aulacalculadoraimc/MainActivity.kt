package com.example.aulacalculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn_calcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcular = findViewById(R.id.btn_Calcular)
        btn_calcular.setOnClickListener{

            val intent = Intent(this,Resultadoctivity::class.java)
            startActivity(intent)

        }

    }
}