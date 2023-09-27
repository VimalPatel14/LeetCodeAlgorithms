package com.vimal.leetcodealgorithms.string

class reverseWords {

    fun reverseWords(s: String): String {
        return s.split(" ").reversed().joinToString(" ").reversed()
    }
}