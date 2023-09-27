package com.vimal.leetcodealgorithms

class repeatedCharacter {

    fun repeatedCharacter(s: String): Char {

        var countArr = HashMap<Char,Int>()
        val emptyChar: Char = '\u0000'

        for (i in s){
            if (countArr.containsKey(i)){
                return i
            }else{
                countArr[i] = 1
            }
        }
        return emptyChar

    }
}