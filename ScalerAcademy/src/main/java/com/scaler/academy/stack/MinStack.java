package com.scaler.academy.stack;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Stack<Integer> stack= new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    
    public void push(int x) {
        if(minStack.isEmpty()|| x<=minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty()) {
            int pop=stack.pop();
            if(pop==minStack.peek()) {
                minStack.pop();
            }
        }    
        
    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        return stack.peek()	;
    }

    public int getMin() {
        if(stack.isEmpty()||minStack.isEmpty())
            return -1;
        return minStack.peek();
    }
}
