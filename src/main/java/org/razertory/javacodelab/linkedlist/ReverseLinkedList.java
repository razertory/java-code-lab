package org.razertory.javacodelab.linkedlist;

import org.razertory.javacodelab.ListNode;

/**
 * 反转链表
 * 双指针法，反转的过程中让链表不要断掉
 * https://leetcode.com/problems/reverse-linked-list
 */
public class ReverseLinkedList {

    ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode pre = null, cur = head;

        while(cur != null) {
            ListNode n = cur.next;
            cur.next = pre;
            pre = cur;
            cur = n;
        }

        return pre;
    }
}
