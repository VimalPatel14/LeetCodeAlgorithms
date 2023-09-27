package com.vimal.leetcodealgorithms

class countPairs {

    fun countPairs(nums: List<Int>, target: Int): Int {
        var counter = 0
        for (element in nums) {
            if (nums[0] + element < target) {
                counter++
            }
        }
        return counter
    }
}