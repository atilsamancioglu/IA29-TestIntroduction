package com.atilsamancioglu.testintroduction

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTestClass {

    private lateinit var tax : Tax

    @Before
    fun setup() {
        tax = Tax()
    }

    @After
    fun teardown() {
        
    }

    @Test
    fun testNetIncome() {
        val netIncome = tax.calculateNetIncome(100.0,0.1)
        assertThat(netIncome).isEqualTo(90)
    }

    @Test
    fun testNetTax() {
        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)

    }
}