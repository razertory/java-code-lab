package org.razertory.datastructure.linkedlist;

import org.junit.Test;
import org.razertory.datastructure.Node;

public class SortWithValueTest {
    @Test
    public void sort() throws Exception {
    }

    @Test
    public void sortGood() throws Exception {
        Node<Integer> node1 = new Node<Integer>(2);
        Node<Integer> node2 = new Node<Integer>(8);
        Node<Integer> node3 = new Node<Integer>(6);
        Node<Integer> node4 = new Node<Integer>(10);
        Node<Integer> node5 = new Node<Integer>(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node<Integer> head = node1;
        while (node1 != null) {
            System.out.print(node1.data + " ");
            node1 = node1.next;
        }

        System.out.println("\r\nSort....");
        node1 = SortWithValue.sortGood(head, 6);

        while (node1 != null) {
            System.out.print(node1.data + " ");
            node1 = node1.next;
        }
    }

}