package com.example

import kotlin.math.absoluteValue

/**
 *
 * @author Eugene Ossipov
 */
fun euclideanDivision(dividend: Int, divisor: Int): Pair<Int, Int> {
    var remainder = dividend % divisor
    if (remainder < 0) remainder += divisor.absoluteValue
    val quotient = (dividend - remainder) / divisor
    return Pair(quotient, remainder)
}
