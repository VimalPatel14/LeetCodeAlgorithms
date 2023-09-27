package com.vimal.leetcodealgorithms

class Number_of_Employees_Who_Met_the_Target {

    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var meetTarget = 0
        for (i in 0 until hours.size) {
            if (target <= hours.get(i)) {
                meetTarget++
            }
        }
        return meetTarget
    }
}