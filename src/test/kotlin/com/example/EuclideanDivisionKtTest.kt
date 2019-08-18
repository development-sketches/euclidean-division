package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.math.absoluteValue

/**
 * @author Eugene Ossipov
 */
internal class EuclideanDivisionKtTest {

    @Test
    fun euclideanDivision() {
        val dividend = 12
        val divisor = 5

        val (quotient, remainder) = euclideanDivision(dividend, divisor)

        assertEquals(dividend, quotient * divisor + remainder)
        assertTrue(remainder >= 0)
        assertTrue(remainder < divisor.absoluteValue)
    }
}
