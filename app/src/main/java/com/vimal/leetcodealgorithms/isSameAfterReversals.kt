package com.vimal.leetcodealgorithms

fun main(){
    val a = isSameAfterReversals()
    a.isSameAfterReversals(526)
}

class isSameAfterReversals {

    fun isSameAfterReversals(num: Int): Boolean {
        val reverse = num.toString().reversed().toInt()
        return num.toString() == reverse.toString().reversed()
    }
}