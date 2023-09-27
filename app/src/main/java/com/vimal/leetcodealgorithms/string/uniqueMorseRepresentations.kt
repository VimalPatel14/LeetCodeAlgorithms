package com.vimal.leetcodealgorithms.string

class uniqueMorseRepresentations {

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        var count = 0
        val char = listOf<String>(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )
        var charaddarray = mutableListOf<String>()
        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        for (element in words) {
            val word = element
            for (element in word) {
                val wordchar = element
                for (q in alphabet.indices) {
                    if (wordchar == alphabet[q]) {
                        if (char[q] !in charaddarray) {
                            charaddarray.add(char[q])
                        }

                    }
                }
            }
        }

        return if (charaddarray.size > 0) {
            charaddarray.size
        } else {
            count
        }


    }
}