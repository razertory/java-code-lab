package org.razertory.javacodelab.stack;

import java.util.Stack;

public class StackWithMin extends Stack<Integer> {
	Stack<Integer> stackMin;
	
	public StackWithMin(){
		stackMin = new Stack<Integer>();
	}

	public Integer push(Integer item){
        if(item <= min()){
            stackMin.push(item);
        }
        super.push(item);
        return item;
    }
	
	public Integer pop(){
        int value = super.pop();
        if(value == min()){
        	stackMin.pop();
        }
        return value;
    }
	
	public Integer min(){
        if(stackMin.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return stackMin.peek();
        }
    }
}
