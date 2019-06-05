package org.razertory.javacodelab.linkedlist;

import org.razertory.javacodelab.ListNode;

public class LinkedListHelper {
    /**
     * 构建一个链表
     * 1->2->3->4->5->null
     */
    public static ListNode createLinedList() {
        ListNode head = new ListNode(1);
        ListNode tail = head.setNext(2);
        tail = tail.setNext(3);
        tail = tail.setNext(4);
        tail.setNext(5);
        return head;
    }

    /**
     * 构建一个上述反转后的链表
     * 5->4->3->2->1->null
     */
    public static ListNode createReversedLinedList() {
        ListNode head = new ListNode(5);
        ListNode tail = head.setNext(4);
        tail = tail.setNext(3);
        tail = tail.setNext(2);
        tail.setNext(1);
        return head;
    }

    /**
     * 比较两个链表是否相同
     */
    public static boolean isSameLinkedList(ListNode a, ListNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.val == b.val && isSameLinkedList(a.next, b.next);
    }

    /**
     * 打印链表，用来 debug
     */
    public static void printLinkedList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        LinkedListHelper.printLinkedList(LinkedListHelper.createLinedList());
        LinkedListHelper.printLinkedList(LinkedListHelper.createReversedLinedList());
    }
}
