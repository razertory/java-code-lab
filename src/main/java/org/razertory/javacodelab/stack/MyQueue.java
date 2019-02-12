package org.razertory.javacodelab.stack;

import java.util.Stack;

/*
 * 栈实现队列
 */
public class MyQueue {

    private Stack<Integer> in, out;

    MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    void push(int val) {
        in.push(val);
    }

    int pop() {
        transferIfEmpty();
        return out.pop();
    }

    int peek() {
        transferIfEmpty();
        return out.peek();
    }

    boolean isEmpty() {
        return in.isEmpty() && out.empty();
    }

    private void transferIfEmpty() {
        if(out.empty()) {
            while(!in.empty()) {
                out.push(in.pop());
            }
        }
    }
}
