package org.razertory.datastructure.linkedlist;

import org.razertory.datastructure.Node;

/**
 * 删除链表中重复的元素
 * 用一个指针current来从头扫链表，runner指针来基于current的位置判断重复
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
