package com.vimal.leetcodealgorithms.neetcode.arrayandhash

class containsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        var hashMap = HashMap<Int, Int>()
        var returnVal = false

        for (i in nums) {
            if (hashMap.containsKey(i)) {
                val getHash = hashMap.get(i)!!
                hashMap[i] = getHash + 1
            } else {
                hashMap[i] = 1
            }
        }

        for (i in hashMap) {
            if (i.value > 1) {
                returnVal = true
            }
        }

        return returnVal
    }
}