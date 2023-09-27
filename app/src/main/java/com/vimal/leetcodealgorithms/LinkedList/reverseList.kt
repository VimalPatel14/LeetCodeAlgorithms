package com.vimal.leetcodealgorithms.LinkedList

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class reverseList {

    fun reverseList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        val reversedList = reverseList(head.next)
        head.next!!.next = head
        head.next = null
        return reversedList
    }
}