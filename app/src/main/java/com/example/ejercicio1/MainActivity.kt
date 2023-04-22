package com.example.ejercicio1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ejercicio #1 Crea una Funcion que calcule el area de un circulo dado su radio
        circulo()
    }
    private fun circulo() {
        val area = 3.14
        var radio = 2
        val resul = radio*2*area
        println(resul)
    }
}