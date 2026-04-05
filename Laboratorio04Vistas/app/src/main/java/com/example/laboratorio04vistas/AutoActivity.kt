package com.example.laboratorio04vistas

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class AutoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.nav_auto
        bottomNav.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.nav_auto -> true

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

        val presidents = arrayOf(
            "José Luis Bustamante",
            "Zenón Noriega",
            "Manuel Odriá",
            "Manuel Prado",
            "Fco Morales Bermúdez",
            "Fernando Belaunde",
            "Alberto Fujimori",
            "Valentín Paniagua",
            "Alejandro Toledo",
            "Alan García",
            "Pedro Pablo Kuczynski",
            "Martín Alberto Vizcarra",
            "Pedro Castillo Terrones",
            "Dina Boluarte Zegarra",
            "Jose Jeri Ore"
        )

        val auto = findViewById<AutoCompleteTextView>(R.id.txtPresidentes)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            presidents
        )

        auto.setAdapter(adapter)

        auto.threshold = 1
    }
}