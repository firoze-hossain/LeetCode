package com.leetcode.topInterview150.linkedList.linkedListCycle;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println("Has Cycle: " + hasCycle(head));

        ListNode head2 = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        head2.next = nodeB;

        System.out.println("Has Cycle: " + hasCycle(head2));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}