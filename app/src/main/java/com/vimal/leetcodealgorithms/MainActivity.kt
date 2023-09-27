package com.vimal.leetcodealgorithms

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a:String = "HelloNayan"
        a.toLowerCase()

//        var nums = arrayOf(-1, 1, 2, 3, 1)
//        countPairs(nums, 2)

        MySingletonClass.doSomething()

        val char = arrayListOf<String>("rwjje", "aittjje", "auyyn", "lqtktn", "lmjwn")
        val reverse = reverseString("vimal")
        val int = intArrayOf(5,6,2,7,4)
        maxProductDifference(int)
//        sortPeople(char, int)

//        containsDuplicate(int)

        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )

        searchMatrix(matrix,5)
    }

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

    fun maxProductDifference(nums: IntArray): Int {
        var result = 0

        val array = nums.sortedArrayDescending()
        val first = array[0]
        val second = array[1]

        val third = array[nums.size]
        val four = array[array.size - 1]

        result = (first * second) - (third * four)

        return result
    }

    fun findSecondlargest(nums: IntArray):Int{
        var first = 0
        var second = 0

        for (i in nums){
            if (i>first){
                second = first
                first = i
            }
        }

        return second
    }

    fun containsDuplicate(nums: IntArray): Boolean {

        var hashMap = HashMap<Int, Int>()
        var returnVal = false

        for (i in nums) {
            if (hashMap.containsKey(i)) {
                val getHash = hashMap.get(i)!!
                hashMap[i] = getHash + 1
            } else {
                hashMap[i] = 1
            }
        }

        for (i in hashMap) {
            if (i.value>1){
                returnVal = true
            }
        }

        return returnVal


    }

    fun charcount(str: String) {
        var hashMap = HashMap<Char, Int>()
        str.replace(" ","")
        for (i in str) {
            if (hashMap.containsKey(i)) {
                var getHas = hashMap[i]!!
                hashMap.put(i,getHas+1)
            } else {
               hashMap.put(i,1)
            }
        }
    }

    fun reverseString(str: String): String {
        var charArray = mutableListOf<Char>()
        for (i in 0 until str.length) {
            charArray.add(str[i])
        }
        charArray.reverse()
        var reversestr = ""
        for (i in charArray) {
            reversestr += i
        }
        return charArray.toString()
    }

    fun sortPeople(names: ArrayList<String>, heights: IntArray): Array<String> {
        val numCount = mutableMapOf<String, Int>()
        val returnArray: Array<String> = mutableListOf<String>().toTypedArray()

        val sortedNumbers = heights.sortedArray()

        for (i in 0 until names.size) {
            numCount.set(names[i], heights[i])
        }

        for (i in heights) {
            if (numCount.containsValue(i)) {
                val string = numCount.values.elementAt(i).toString()
                returnArray.set(i, string.toString())
            }
        }

        Log.e("vml", "$numCount")

        return returnArray
    }


//    if (lastpos == -1) {
//        lastpos = j
//    }
//
//    val result = i - lastpos
//    lastpos = j
//    if (diff == result) {
//        count++
//    }
//

    fun wordCount(string: String) {
        var hashMap = HashMap<String, Int>()
        for (i in string) {
            if (hashMap.containsKey(i.toString())) {
                val currentCount = hashMap[i.toString()]!!
                hashMap[i.toString()] = currentCount + 1
            } else {
                hashMap[i.toString()] = 1
            }

        }
        val sortedList = hashMap.toList().sortedBy { it.second }
    }

    fun singleNumber(nums: IntArray): Int {
        var array = mutableListOf<Int>()
        for (i in nums) {
            if (i !in array) {
                array.add(i)
            } else {
                array.remove(i)
            }
        }
        return array[0]
    }

    fun lengthOfLastWord(s: String): Int {
        val words = s.split("\\s+".toRegex())
        val nonEmptyWords = words.filter { it.isNotEmpty() }
        return nonEmptyWords.get(nonEmptyWords.size - 1).length
    }

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[count] = nums[i] // Move non-matching elements to the front
                count++
            }
        }

        return count
    }

    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        val reverse = str.reversed()
        return str == reverse
    }
}