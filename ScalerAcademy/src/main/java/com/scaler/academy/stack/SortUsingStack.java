package com.scaler.academy.stack;

import java.util.Arrays;
import java.util.Stack;

public class SortUsingStack {
	
	public static void main(String[] args) {
		
		int []A= {5, 17, 100, 11};
		SortUsingStack sortUsingStack = new SortUsingStack();
		int[] solve = sortUsingStack.solve(A);
		System.out.println(Arrays.toString(solve));
	}
	
	public int[] solve(int[] A) {
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> tempStack = new Stack<>();
		
		for(int i=0;i<A.length;i++) {
			stack.push(A[i]);
		}
		while(!stack.isEmpty()) {
			int x = stack.pop();
			
			
			while(!tempStack.isEmpty() && x<tempStack.peek()) {
				Integer num = tempStack.pop();
				stack.push(num);
			}
			tempStack.push(x);
		}
		
		int count=tempStack.size()-1;
		while(!tempStack.isEmpty()) {
			A[count--]=tempStack.pop();
		}
		return A;
	}

}
