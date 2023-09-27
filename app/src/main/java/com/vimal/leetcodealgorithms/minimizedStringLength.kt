package com.vimal.leetcodealgorithms

class minimizedStringLength {

    fun minimizedStringLength(s: String): Int {
        var countArr = HashMap<Char,Int>()

        for (i in s){
            if (countArr.containsKey(i)){

            }else{
                countArr[i] = 1
            }
        }

        return countArr.size
    }
}