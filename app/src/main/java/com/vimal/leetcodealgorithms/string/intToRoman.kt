package com.vimal.leetcodealgorithms.string

class intToRoman {

    fun intToRoman(num: Int): String {
        var roman = ""

        val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val romanNumerals = arrayOf(
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        )
        var n = num

        for (i in values.indices) {
            while (n >= values[i]) {
                roman += romanNumerals[i]
                n -= values[i]
            }
        }

        return roman

    }
}