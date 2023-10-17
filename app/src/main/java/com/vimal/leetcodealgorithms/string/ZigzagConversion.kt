package com.vimal.leetcodealgorithms.string

fun main() {
    val solution = ZigzagConversion()
    println(solution.convert("PAYPALISHIRING", 3)) // Output: "PAHNAPLSIIGYIR"
    println(solution.convert("PAYPALISHIRING", 4)) // Output: "PINALSIGYAHRPI"
    println(solution.convert("A", 1)) // Output: "A"
}

class ZigzagConversion {

    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) {
            return s
        }

        val result = Array(numRows) { StringBuilder() }
        var currentRow = 0
        var goingDown = false

        for (char in s) {
            result[currentRow].append(char)
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown
            }
            if (goingDown) {
                currentRow++
            } else {
                currentRow--
            }
        }

        val convertedString = StringBuilder()
        for (row in result) {
            convertedString.append(row)
        }
        return convertedString.toString()
    }
}