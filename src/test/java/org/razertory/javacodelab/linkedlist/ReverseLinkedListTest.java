package org.razertory.javacodelab.linkedlist;

import org.junit.Assert;
import org.junit.Test;
import org.razertory.javacodelab.ListNode;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = LinkedListHelper.createLinedList();
        ListNode expect = LinkedListHelper.createReversedLinedList();
        ListNode actual = reverseLinkedList.reverseList(head);
        Assert.assertTrue(LinkedListHelper.isSameLinkedList(expect, actual));
    }
}