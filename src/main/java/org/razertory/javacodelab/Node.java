package org.razertory.javacodelab;

/**
 * 链表的节点
 * @author razertory
 */
public class Node<T> {
    public Node<T> next;
    public T data;
    
    public Node(T _data){
        data = _data;
    }
}
