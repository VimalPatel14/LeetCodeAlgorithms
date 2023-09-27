package com.vimal.leetcodealgorithms.string

class checkIfPangram {

    fun checkIfPangram(sentence: String): Boolean {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val lowercaseInput = sentence.toLowerCase()

        for (char in alphabet){
            if (char !in lowercaseInput){
                return false
            }
        }

        return true
    }
}