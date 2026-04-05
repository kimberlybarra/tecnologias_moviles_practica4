package com.example.laboratorio04vistas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class TimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.selectedItemId = R.id.nav_time

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.nav_auto -> {
                    startActivity(Intent(this, AutoActivity::class.java))
                    finish()
                    true
                }

                R.id.nav_time -> true

                R.id.nav_date -> {
                    startActivity(Intent(this, DateActivity::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }

        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        val btn = findViewById<Button>(R.id.btnHora)

        timePicker.setIs24HourView(true)

        btn.setOnClickListener {
            val hora = timePicker.hour
            val min = timePicker.minute

            Toast.makeText(this, "Hora: $hora:$min", Toast.LENGTH_SHORT).show()
        }
    }
}