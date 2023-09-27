package com.vimal.leetcodealgorithms.array

class missingNumber {

    fun missingNumber(nums: IntArray): Int {
        var missing = 0
        var next = 0
        val sort = nums.sortedArray()
        for (i in sort) {
            if (i == next) {
                next++
            } else {
                missing = next
            }
        }

        if (missing == 0) {
            missing = sort.size
        }
        return missing
    }
}