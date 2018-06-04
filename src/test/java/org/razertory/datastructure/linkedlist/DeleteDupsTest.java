package org.razertory.datastructure.linkedlist;

import org.junit.Before;
import org.junit.Test;
import org.razertory.datastructure.Node;


public class DeleteDupsTest {
    @Before
    public void setUp() {
        Node<Integer> node1 = new Node<Integer>(2);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(2);
        Node<Integer> node5 = new Node<Integer>(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node<Integer> head = node1;
        while (node1 != null) {
            System.out.print(node1.data + " ");
            node1 = node1.next;
        }
    }
    @Test
    public void delete(Node head) throws Exception {

        DeleteDups.delete(head);
        System.out.println(" ");

        Node node1 = head;
        while (node1 != null) {
            System.out.print(node1.data + " ");
            node1 = node1.next;
        }
    }

}