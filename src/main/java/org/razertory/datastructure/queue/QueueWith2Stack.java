package org.razertory.datastructure.queue;

import org.razertory.datastructure.stack.IStack;
import org.razertory.datastructure.stack.Stack;


/**
 * 使用两个栈实现队列
 * @author razertory
 *
 */
public class QueueWith2Stack<T> implements IQueue<T> {
	IStack<T> stackOldest, stackNewest;
	
	public QueueWith2Stack(){
		stackOldest = new Stack<T>();
		stackNewest = new Stack<T>();
	}

	public void enqueue(T item) {
		stackNewest.push(item);
	}

	public T dequeue() {
		shiftStacks();
        return stackOldest.pop();
	}
	
	public T peek() {
		shiftStacks();
        return stackOldest.peek();
	}
	
	/**
     * 如果旧栈已空，将新栈所有数据压入旧栈
     */
    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }

	public boolean isEmpty() {
		return stackOldest.isEmpty();
	}

}
