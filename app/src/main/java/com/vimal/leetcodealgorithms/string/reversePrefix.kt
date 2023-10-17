package com.vimal.leetcodealgorithms.string

fun main() {

    val reverse = reversePrefix()
    val ans = reverse.reversePrefix("abcdefd", 'd')
    println("$ans")
}

class reversePrefix {

    fun reversePrefix(word: String, ch: Char): String {
        var firstWord = ""
        var first = true
        for (i in word) {
            firstWord += i
            if (i == ch && first) {
                first = false
                firstWord = firstWord.reversed()
            }
        }
        return firstWord
    }
}