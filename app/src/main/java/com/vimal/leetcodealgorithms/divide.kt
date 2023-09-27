package com.vimal.leetcodealgorithms

class divide {

    fun divide(dividend: Int, divisor: Int): Int {
        var divide = 0

        val divided:Float = (dividend/divisor).toFloat()
        val firstDigit: Char? = divided.toString().firstOrNull { it.isDigit() }
        if (firstDigit != null) {
            val num = firstDigit.toString()
            divide = num.toInt()
        }
        return divide
    }
}