package com.vimal.leetcodealgorithms.hashtable

class sortPeople {

    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val hashList = HashMap<Int,String>()
        val sortPeople = mutableListOf<String>()

        for (i in 0 until names.size){
            hashList.set(i, names[i])
        }

        hashList.toSortedMap()

        for (i in hashList){
            sortPeople.add(i.value)
        }
        sortPeople.reverse()
        return sortPeople.toTypedArray()

    }
}