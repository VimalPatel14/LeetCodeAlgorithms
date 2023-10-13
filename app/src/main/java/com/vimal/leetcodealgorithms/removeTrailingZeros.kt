package com.vimal.leetcodealgorithms

fun main() {
    val res = removeTrailingZeros("1720865079269529096765717822459")
    println(res)
}

fun removeTrailingZeros(num: String): String {
    val result = num.trimEnd('0')
    return if (result.endsWith('.')) {
        result.dropLast(1)
    } else {
        result
    }
}