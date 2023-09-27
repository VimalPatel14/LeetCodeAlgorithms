package com.vimal.leetcodealgorithms.string

class frequencySort {

    fun frequencySort(s: String): String {
        val charArray = s.toCharArray()
        charArray.sort()
        return String(charArray)
    }
}