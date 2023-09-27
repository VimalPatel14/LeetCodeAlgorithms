package com.vimal.leetcodealgorithms.hashmap

class countKDifference {

    fun countKDifference(nums: IntArray, k: Int): Int {
        val numCount = mutableMapOf<Int, Int>()
        var count = 0

        for (num in nums) {
            val num1 = num - k
            val num2 = num + k

            if (num1 in numCount) {
                count += numCount[num1]!!
            }

            if (num2 in numCount) {
                count += numCount[num2]!!
            }
            numCount[num] = numCount.getOrDefault(num, 0) + 1
        }

        return count
    }
}