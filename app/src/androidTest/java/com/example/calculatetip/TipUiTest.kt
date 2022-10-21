package com.example.calculatetip

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.calculatetip.ui.theme.CalculateTipTheme
import org.junit.Rule
import org.junit.Test

/**
 * Created by Dede Dari Rahmadi on 21/10/22
 */

class TipUiTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            CalculateTipTheme {
                TipTimeScreen()
            }
        }

        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        composeTestRule.onNodeWithText("Tip amount: $2.00").assertExists()
    }
}