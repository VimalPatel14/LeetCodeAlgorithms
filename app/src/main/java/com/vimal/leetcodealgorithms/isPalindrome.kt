package com.vimal.leetcodealgorithms

class isPalindrome {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        val reverse = str.reversed()
        return str == reverse
    }

    companion object{
        const val stringValue = "Vimal"
    }
}