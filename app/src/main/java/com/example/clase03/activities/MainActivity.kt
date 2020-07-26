package com.example.clase03.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase03.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var context1: Context = this
        context1 = applicationContext

        btnIngresar.setOnClickListener {

            val intent = Intent (this, ListaActivity::class.java)
            startActivity(intent)
        }
    }
}