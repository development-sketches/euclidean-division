package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author Eugene Ossipov
 */
internal class EuclideanDivisionKtTest {

    @Test
    fun euclideanDivision() {
        val dividend = 12
        val divisor = 5

        val expectedQuotient = 2
        val expectedRemainder = 2

        val (quotient, remainder) = euclideanDivision(dividend, divisor)

        assertEquals(expectedQuotient, quotient)
        assertEquals(expectedRemainder, remainder)
    }
}
