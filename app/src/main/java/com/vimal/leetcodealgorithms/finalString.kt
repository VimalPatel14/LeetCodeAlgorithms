package com.vimal.leetcodealgorithms

class finalString {

    fun finalString(s: String): String {
        var returnstr = ""

        for (i in s.indices){
            if (s[i].toString().equals("i")){
                returnstr = returnstr.reversed()
            }else{
                returnstr += s[i].toString()
            }
        }

        return returnstr
    }
}