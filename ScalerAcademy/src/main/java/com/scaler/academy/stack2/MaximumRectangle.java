package com.scaler.academy.stack2;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []A= {2, 1, 5, 6, 2, 3};
		
		int [][]A = {
		             {0, 1, 1},
		             {1, 0, 0},
		             {1, 0, 0},
		             {1, 0, 0},
		             {1, 0, 0},
		             {1, 1, 1},
		             {0, 1, 0}};
		            		
		
		 //int [][]A = {{0, 0, 1}, {0, 1, 1}, {1, 1, 1}};
		 
		
		/*
		 * int [][]A = {{ 0, 1, 0, 1}, {1, 0, 1, 0}};
		 */
		MaximumRectangle large  = new MaximumRectangle();
		int largestRectangleArea = large.solve(A);
		System.out.println(largestRectangleArea);
		
	}
	
	public int solve(int[][] A) {
		int n = A.length;
		int m = A[0].length;
		
		int ans=largestRectangleArea(A[0]);

		for(int i=1;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(A[j][i]>0) 
					A[j][i]=A[j][i-1]+A[j][i];
			} 
			
			System.out.println(Arrays.toString(A[i]));
			int area = largestRectangleArea(A[i]);
			
			ans =Math.max(ans, area);
		}
		
		 
		return ans;
    }
	
	public int largestRectangleArea(int[] A) {
		Stack<Integer> stack = new Stack<>();
		
		int ans=0;
		int n= A.length;
		int i=0;
		while(i<n) {
			
			if(stack.isEmpty() || A[stack.peek()] <= A[i]) {
				stack.push(i++);
			} else {
				int top = stack.peek();
				stack.pop();
				int area = A[top] * (stack.isEmpty()?i:i-stack.peek()-1);
				ans=Math.max(ans, area);
					
			}
			
		}
		
		
	   while(!stack.isEmpty()) { 
		  int top = stack.peek();
		  stack.pop();
		  int area = A[top] * (stack.isEmpty()?i:i-stack.peek()-1);
		  ans=Math.max(ans, area);
	    }
		 
		return ans;
	}
}
