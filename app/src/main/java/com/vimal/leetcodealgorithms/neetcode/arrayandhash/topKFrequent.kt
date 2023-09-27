package com.vimal.leetcodealgorithms.neetcode.arrayandhash

class topKFrequent {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var retrunArray = mutableListOf<Int>()
        var hashmap = HashMap<Int, Int>()

        for (i in nums) {
            if (hashmap.containsKey(i)) {
                val getHash = hashmap.get(i)!!
                hashmap[i] = getHash + 1
            } else {
                hashmap[i] = 1
            }
        }

        for (i in hashmap) {
            if (i.value >= k) {
                retrunArray.add(i.key)
            }
        }

        return if (retrunArray.size > 0) {
            retrunArray.toIntArray()
        } else {
            intArrayOf()
        }


    }
}