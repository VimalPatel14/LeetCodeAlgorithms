package com.vimal.leetcodealgorithms.string

class replaceDigits {
    fun replaceDigits(s: String): String {
        val abcd = "abcdefghijklmnopqrstuvwxyz"
        var returnstr = ""
        for (i in s.indices) {
            returnstr += if (s[i].isDigit()) {
                if (s[i] != '0') {
                    abcd[i]
                } else {
                    s[i - 1]
                }

            } else {
                s[i]
            }
        }
        return returnstr
    }
}