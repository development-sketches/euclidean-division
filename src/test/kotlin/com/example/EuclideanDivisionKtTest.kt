package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.math.absoluteValue

/**
 * @author Eugene Ossipov
 */
internal class EuclideanDivisionKtTest {

    @ParameterizedTest
    @CsvSource("12,5", "12,-5", "-12,5", "-12,-5", "15,5")
    fun testEuclideanDivision(dividend: Int, divisor: Int) {

        val (quotient, remainder) = euclideanDivision(dividend, divisor)

        println("dividend: $dividend, divisor: $divisor, quotient: $quotient, remainder: $remainder")

        assertEquals(dividend, quotient * divisor + remainder)
        assertTrue(remainder >= 0)
        assertTrue(remainder < divisor.absoluteValue)
    }
}
