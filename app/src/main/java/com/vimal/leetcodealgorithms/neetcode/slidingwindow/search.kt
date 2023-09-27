package com.vimal.leetcodealgorithms.neetcode.slidingwindow

class search {

    fun search(nums: IntArray, target: Int): Int {
        var search = -1
        for (i in 0 until nums.size) {
            if (nums[i] == target) {
                search = i
            }
        }
        return search
    }
}