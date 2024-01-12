package com.vimal.leetcodealgorithms

import android.util.Log

fun main(){
    val a = hammingWeight()
    a.hammingWeight(110)
}

class hammingWeight {

    fun hammingWeight(n:Int):Int {
        var count = 0
        val char = n.toChar()
        for (i in char.toString()){
           println("$i value")
        }

        return count
    }
}