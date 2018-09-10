package org.razertory.datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.razertory.datastructure.Node;


/**
 * 检查链表中是否有重复元素 *
 * 1 2 3 4 4 -> 1 2 3 4
 */
public class DeleteDupsTest {

    private Node<Integer> head;

    @Before
    public void setUp() throws Exception {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        head = node1;
        if (!hasDuplicate(head)) {
            throw new Exception("No Duplicate Element");
        }
        while (node1 != null) {
            node1 = node1.next;
        }
    }

    @Test
    public void testDelete(){
        DeleteDups.delete(head);
        Assert.assertFalse(hasDuplicate(head));
    }

    // 判断链表中包含重复元素
    private boolean hasDuplicate(Node head) {
        Node current = head;
        while (current.next != null) {
            Node runner = current;
            if (runner.data == runner.next.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}