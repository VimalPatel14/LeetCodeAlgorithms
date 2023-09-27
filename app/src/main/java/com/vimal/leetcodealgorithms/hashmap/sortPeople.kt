package com.vimal.leetcodealgorithms.hashmap

class sortPeople {

    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val numCount = mutableMapOf<String, Int>()
        val returnArray: Array<String> = mutableListOf<String>().toTypedArray()

        for (i in 1 until names.size) {
            numCount.set(names[i], heights[i])
        }



        return returnArray
    }
}