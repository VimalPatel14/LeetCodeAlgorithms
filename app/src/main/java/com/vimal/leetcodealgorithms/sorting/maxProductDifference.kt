package com.vimal.leetcodealgorithms.sorting

class maxProductDifference {

    fun maxProductDifference(nums: IntArray): Int {
        var result = 0

        val array = nums.sortedArrayDescending()
        val first = array[0]
        val second = array[1]

        val third = array[array.size]
        val four = array[array.size - 1]

        result = (first * second) - (third * four)

        return result
    }
}