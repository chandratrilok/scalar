package com.scaler.academy.array.problem;

import java.util.Stack;

public class RainWaterTrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A= {0, 1, 0, 2};
		
		RainWaterTrapped rainWaterTrapped= new RainWaterTrapped();
		int trap = rainWaterTrapped.trap(A);
		System.out.println(trap);

	}
	
	 public int trap(final int[] A) {
		 int ans = 0;
		 
		 Stack<Integer> stack = new Stack<>();
		 for(int i =0; i<A.length; i++) {
			 
			 while(!stack.isEmpty() &&  A[i]>A[stack.peek()]) {
				 int top = stack.pop();
				 int nextTop = (stack.isEmpty())?0:stack.peek();
				 
				 int distance = i-nextTop-1;
				 int boundedH = Math.min(A[i], A[top]) - A[top];
				 ans+=boundedH*distance;
			 }
			 stack.push(i);
		 }
		 
		 
		 return ans;
	 }

}
