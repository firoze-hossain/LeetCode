package com.leetcode.leetcodebeginnerswith17.middleOfTheLinkedList;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode f1 = head;
        ListNode f2 = head;
        while (f2 != null && f2.next != null) {
            f1 = f1.next;
            f2 = f2.next.next;
        }
        return f1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.next = next;
    }
}