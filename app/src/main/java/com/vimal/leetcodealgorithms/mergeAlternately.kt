package com.vimal.leetcodealgorithms

class mergeAlternately {

    fun mergeAlternately(word1: String, word2: String): String {
        val mergedStringBuilder = StringBuilder()

        val minLength = minOf(word1.length, word2.length)

        for (i in 0 until minLength) {
            mergedStringBuilder.append(word1[i])
            mergedStringBuilder.append(word2[i])
        }

        mergedStringBuilder.append(word1.substring(minLength))
        mergedStringBuilder.append(word2.substring(minLength))

        return mergedStringBuilder.toString()
    }
}