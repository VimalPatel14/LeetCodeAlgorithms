package com.vimal.leetcodealgorithms

class majorityElement {

    fun majorityElement(nums: IntArray): Int {
        var majorityElement = 0
        var majorityElementCount = 0
        val hashmap = HashMap<Int, Int>()

        for (i in nums) {
            if (hashmap.containsKey(i)) {
                val getHash = hashmap[i]!!
                hashmap[i] = getHash + 1
            } else {
                hashmap[i] = 1
            }
        }

        for (i in hashmap) {
            val hash = i
            if (hash.value > majorityElementCount) {
                majorityElement = hash.key
            }
        }

        return majorityElement
    }
}