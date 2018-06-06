package org.razertory.datastructure.linkedlist;

import org.razertory.datastructure.Node;

/**
 * 删除链表中重复的元素
 * 
 * @author razertory
 * 
 */
public class DeleteDups {

	public static void delete(Node<Integer> head) {
		if (head == null) {
			return;
		}
		Node<Integer> current = head;
		while (current != null) {
			Node<Integer> runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}

			current = current.next;
		}
	}
}
