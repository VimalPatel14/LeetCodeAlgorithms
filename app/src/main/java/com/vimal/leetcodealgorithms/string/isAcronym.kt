package com.vimal.leetcodealgorithms.string

class isAcronym {

    fun isAcronym(words: List<String>, s: String): Boolean {
        var check = false
        var count = 0

        if (words.size != s.length){
            return false
        }

        for (i in 0 until words.size) {
            var char = '0'
            for (j in 0 until s.length) {
                char = s[i]
            }
            val word = words[i]
            val wordchar = word[0]

            if (wordchar == char) {
                count++
            }
        }
        if (words.size == count) {
            check = true
        }


        return check
    }
}