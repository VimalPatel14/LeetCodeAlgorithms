package com.vimal.leetcodealgorithms.string

class truncateSentence {
    fun truncateSentence(s: String, k: Int): String {
        val words = s.split(" ")
        val truncatedWords = words.take(k)
        return truncatedWords.joinToString(" ")
    }


}