package org.razertory.datastructure.stack;

import org.razertory.datastructure.Node;

/**
 * 栈的实现
 * @author razertory
 * @see StackTest
 * @see IStack
 * @see Node
 */
public class Stack<T> implements IStack<T>{
    Node<T> top;
    
    public T pop(){
        if(top != null){
            T item = top.data;
            top = top.next;
            return item;
        }
        
        return null;
    }
    
    public void push(T item){
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }

    public T peek(){
    	if(top != null){
    		return top.data;
    	}
        return null;
    }
    
    
    public boolean isEmpty(){
        return (top == null);
    }
}
