package com.example.calculatetip

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Dede Dari Rahmadi on 21/10/22
 */

class TipCalculatorTest {

    @Test
    fun calculate_20_percent_tip_no_roundup(){
        val amount = 10.00
        val tipPercent = 20.00
        val expecetedTip = "IDR2.00"
        val actualTip = calculateTheTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expecetedTip, actualTip)
    }
}