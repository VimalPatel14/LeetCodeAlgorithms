package com.vimal.leetcodealgorithms

fun main() {
    val v = sumOfMultiples(9)
    println(v)
}


fun sumOfMultiples(n: Int): Int {
    val sumList = mutableListOf<Int>()
    var sum = 0
    for (i in 0 .. n) {
        if ((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
            sumList.add(i)
        }
    }
    for (i in sumList) {
        sum += i
    }
    return sum
}