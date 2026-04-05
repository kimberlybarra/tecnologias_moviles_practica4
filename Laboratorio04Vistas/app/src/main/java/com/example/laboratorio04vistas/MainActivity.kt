package com.example.laboratorio04vistas

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.txtPrincipal)

        txt.text = "Para interactuar con el sistema usa algunas de las opciones del menu de abajo 👇😁 "

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.nav_auto -> {
                    startActivity(Intent(this, AutoActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_time -> {
                    startActivity(Intent(this, TimeActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_date -> {
                    startActivity(Intent(this, DateActivity::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}