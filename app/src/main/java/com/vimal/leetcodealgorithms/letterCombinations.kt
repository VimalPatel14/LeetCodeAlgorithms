package com.vimal.leetcodealgorithms

class letterCombinations {

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return emptyList()
        }
        val letters = mutableListOf<String>(
            "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        )
        val lettercombinations = mutableListOf<String>()

        if (digits.length == 1) {
            val value = letters[digits.toInt() - 2]
            for (i in value) {
                lettercombinations.add(i.toString())
            }
            return lettercombinations
        }

        val lettermulti = mutableListOf<String>()
        for (i in digits) {
            val d = i.toString()
        }

        return lettercombinations
    }
}