package com.vimal.leetcodealgorithms

class findSecondlargest {

    fun findSecondlargest(nums: IntArray):Int{
        var first = 0
        var second = 0

        for (i in nums){
            if (i>first){
                second = first
                first = i
            }
        }

        return second
    }
}