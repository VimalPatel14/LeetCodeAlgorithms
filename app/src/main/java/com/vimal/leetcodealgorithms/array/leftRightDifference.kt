package com.vimal.leetcodealgorithms.array

class leftRightDifference {

    fun leftRightDifference(nums: IntArray): IntArray {
        val left = IntArray(nums.size)
        val right = IntArray(nums.size)

        left[0] = nums[0]
        for (i in 1 until nums.size) {
            left[i] = left[i - 1] + nums[i]
        }

        right[nums.size - 1] = nums[nums.size - 1]
        for (i in nums.size - 2 downTo 0) {
            right[i] = right[i + 1] + nums[i]
        }

        val answer = IntArray(nums.size)
        for (i in 0 until nums.size) {
            val left = if (i == 0) 0 else left[i - 1]
            val right = if (i == nums.size - 1) 0 else right[i + 1]
            answer[i] = Math.abs(left - right)
        }


        return answer
    }
}