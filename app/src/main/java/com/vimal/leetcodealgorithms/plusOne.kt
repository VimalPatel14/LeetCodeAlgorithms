package com.vimal.leetcodealgorithms

class plusOne {
    fun plusOne(digits: IntArray): IntArray {
        var num = ""
        for (i in digits) {
            num += i
        }
        val number = num.toInt() + 1
        var returnArray = mutableListOf<Char>()
        for (j in number.toString()) {
            returnArray.add(j)
        }
        val charList = returnArray
        val intList = charList.map { it.toString().toInt() }.toMutableList()
        return intList.toIntArray()
    }
}