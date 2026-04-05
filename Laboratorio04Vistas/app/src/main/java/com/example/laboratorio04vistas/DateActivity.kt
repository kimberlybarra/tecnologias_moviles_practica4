package com.example.laboratorio04vistas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class DateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.nav_date
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

                R.id.nav_date -> true

                else -> false
            }
        }

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val btn = findViewById<Button>(R.id.btnFecha)

        btn.setOnClickListener {
            val dia = datePicker.dayOfMonth
            val mes = datePicker.month + 1
            val anio = datePicker.year

            Toast.makeText(this,
                "Fecha: $dia/$mes/$anio",
                Toast.LENGTH_SHORT).show()
        }
    }
}