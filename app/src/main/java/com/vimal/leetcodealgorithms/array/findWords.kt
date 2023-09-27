package com.vimal.leetcodealgorithms.array

class findWords {

    fun findWords(words: Array<String>): Array<String> {
        val list = mutableListOf<String>()
        val first = "qwertyuiop"
        val second = "asdfghjkl"
        val third = "zxcvbnm"

        for (i in words) {
            val wordoriginal = i
            val word = i.toLowerCase()
            val allfirst = word.all { it in first }
            val allsecond = word.all { it in second }
            val allthird = word.all { it in third }

            if (allfirst || allsecond || allthird) {
                list.add(wordoriginal)
            }
        }

        val stringArray: Array<String> = list.toTypedArray()
        return stringArray

    }
}