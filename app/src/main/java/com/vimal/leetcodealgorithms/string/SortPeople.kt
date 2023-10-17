package com.vimal.leetcodealgorithms.string

fun main() {
    val sort = SortPeople()
    val names = arrayOf("Mary", "John", "Emma")
    val heights = intArrayOf(180, 165, 170)
    val ans = sort.sortPeople(names,heights)
}

class SortPeople {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val pair = HashMap<Int, String>()
        val retrunArr = mutableListOf<String>()
        for (i in names.indices) {
            pair[heights[i]] = names[i]
        }
        heights.sortDescending()
        for (i in heights) {
            retrunArr.add(pair.getValue(i))
        }
        println("$retrunArr")
        return retrunArr.toTypedArray()
    }
}