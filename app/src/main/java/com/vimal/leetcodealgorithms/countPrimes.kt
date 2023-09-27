package com.vimal.leetcodealgorithms

class countPrimes {

    fun countPrimes(n: Int): Int {
        var countPrimes = 0

        if (countPrimes % 2 == 0){
            countPrimes++
        }
        if (countPrimes % 3 == 0){
            countPrimes++
        }
        if (countPrimes % 4 == 0){
            countPrimes++
        }
        if (countPrimes % 5 == 0){
            countPrimes++
        }
        if (countPrimes % 6 == 0){
            countPrimes++
        }

        return countPrimes
    }

}