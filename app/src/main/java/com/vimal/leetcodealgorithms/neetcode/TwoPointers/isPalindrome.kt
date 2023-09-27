package com.vimal.leetcodealgorithms.neetcode.TwoPointers

class isPalindrome {
    fun isPalindrome(s: String): Boolean {
        val s = "A man, a plan, a canal: Panama"
        val resultString = s.replace(Regex("[^a-zA-Z0-9]"), "").toLowerCase()
        val reversed = resultString.reversed()
        return resultString == reversed
    }
}