package com.vimal.leetcodealgorithms

class searchMatrix {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var searchMatrix = false
        for (i in matrix){
            for (j in i){
                if (j == target){
                    searchMatrix = true
                }
            }
        }
        return searchMatrix
    }
}