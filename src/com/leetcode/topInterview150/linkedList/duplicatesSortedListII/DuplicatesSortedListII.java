package com.leetcode.topInterview150.linkedList.duplicatesSortedListII;

public class DuplicatesSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode cur = node;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int duplicate = cur.next.val;
                while (cur.next != null && cur.next.val == duplicate) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return node.next;
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
        this.val = val;
        this.next = next;
    }
}