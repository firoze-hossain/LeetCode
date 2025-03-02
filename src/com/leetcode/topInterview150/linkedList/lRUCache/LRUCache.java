package com.leetcode.topInterview150.linkedList.lRUCache;

import java.util.HashMap;

public class LRUCache {
    class Node {
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m = new HashMap<>();

    LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public void addNode(Node newNode) {
        Node tem = head.next;
        newNode.next = tem;
        newNode.prev = head;
        head.next = newNode;
        tem.prev = newNode;
    }

    public void deleteNode(Node delNode) {
        Node pre = delNode.prev;
        Node nex = delNode.next;
        pre.next = nex;
        nex.prev = pre;

    }

    public int get(int key) {
        if (m.containsKey(key)) {
            Node resNode = m.get(key);
            int ans = resNode.val;
            m.remove(key);
            deleteNode(resNode);
            addNode(resNode);
            m.put(key, head.next);
            return ans;
        }
        return -1;
    }

    public void put(int key, int val) {
        if (m.containsKey(key)) {
            Node cur = m.get(key);
            m.remove(key);
            deleteNode(cur);
        }
        if (m.size() == cap) {
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        addNode(new Node(key, val));
        m.put(key, head.next);
    }
}
