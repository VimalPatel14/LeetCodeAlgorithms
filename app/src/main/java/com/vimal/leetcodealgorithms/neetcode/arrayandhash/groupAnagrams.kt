package com.vimal.leetcodealgorithms.neetcode.arrayandhash

class groupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val returnList = mutableListOf<List<String>>()
        val hashList = HashMap<String,Int>()
        for (i in returnList){
            for (j in i){

            }
        }

        return returnList
    }

    fun isAnagram(s: String, t: String): Boolean {
        var check = false
        if (s.length != t.length) {
            return check
        }
        var first = HashMap<Char, Int>()
        var second = HashMap<Char, Int>()

        for (i in s) {
            if (first.containsKey(i)) {
                val getHash = first.get(i)!!
                first[i] = getHash + 1
            } else {
                first[i] = 1
            }
        }

        for (i in t) {
            if (second.containsKey(i)) {
                val getHash = second.get(i)!!
                second[i] = getHash + 1
            } else {
                second[i] = 1
            }
        }

        if (first == second) {
            check = true
        }
        return check
    }
}