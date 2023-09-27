package com.vimal.leetcodealgorithms.string

class maximumNumberOfStringPairs {

    fun maximumNumberOfStringPairs(words: Array<String>): Int {

        val wordarr = mutableListOf<String>()
        var count = 0

        for (i in words){
            if (wordarr.contains(i) || wordarr.contains(i.reversed())){
                count++
            }else{
                wordarr.add(i)
            }
        }

        return wordarr.size
    }
}