package org.razertory.javacodelab;

/**
 * 链表的节点
 */
public class ListNode {
    public ListNode next;

    public int val;
    
    public ListNode(int val){
        this.val = val;
    }

    /**
     * 在链表表尾增加一个节点
     */
    public ListNode setNext(int val) {
        ListNode node = new ListNode(val);
        this.next = node;
        return node;
    }
}
