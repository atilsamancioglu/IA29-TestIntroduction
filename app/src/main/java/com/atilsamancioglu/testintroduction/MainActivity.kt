package com.atilsamancioglu.testintroduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tax = Tax()
        val netIncome = tax.calculateNetIncome(100.0,0.1)
        val netTax = tax.calculateTax(100.0,0.1)

        println(netIncome)
        println(netTax)

    }
}