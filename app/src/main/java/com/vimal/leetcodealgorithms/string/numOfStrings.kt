package com.vimal.leetcodealgorithms.string

fun main(){

}

class numOfStrings {

    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var count = 0

        for (i in patterns) {
            if (word.contains(i)) {
                count++
            }
        }

        return count
    }
}