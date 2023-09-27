package com.vimal.leetcodealgorithms.hashmap

class arithmeticTriplets {

    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val countMap = mutableMapOf<Int, Int>()
        var totalTriplets = 0

        for (num in nums) {
            // Calculate the two other elements of the triplet
            val num1 = num - diff
            val num2 = num + diff

            val countNum1 = countMap.getOrDefault(num1, 0)
            val countNum2 = countMap.getOrDefault(num2, 0)

            totalTriplets += countNum1 // Add the count of triplets where num is the last element
            countMap[num] = countMap.getOrDefault(num, 0) + 1 // Update the count of num
        }

        return totalTriplets
    }
}