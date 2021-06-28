package com.scaler.academy.stack;

import java.util.Stack;

public class AllXORSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllXORSubarrays arr = new AllXORSubarrays();
		int []A= {2, 3, 1, 4};
		int solve = arr.solve(A);
		System.out.println(solve);
	}
	
	
	public int solve(int[] A) {
		int ans=0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < A.length; i += 1) {
			while(!stack.isEmpty()) {
				int xor = A[stack.peek()]^A[i];
				System.out.println("xor "+xor);
				ans = Math.max(ans, xor);
				if(A[stack.peek()] > A[i]) break;
				
				stack.pop();
			}
			stack.push(i);
			System.out.println(stack);
		}
		
		return ans;
		
	}

	 
	public int solve1(int[] A) {
		int ans=-1;
		
		Stack<Integer> fwStack = new Stack<>();
		Stack<Integer> bkStack = new Stack<>();
		int n=A.length;
		
		for(int i=0;i<n;i++) {
		
			while(!fwStack.isEmpty() && A[i]<A[fwStack.peek()]) {
				ans=Math.max(ans, A[i]^A[fwStack.peek()]);
				fwStack.pop();		
			}
			
			fwStack.add(i);
			
			while(!bkStack.isEmpty() && A[n-1-i]<A[bkStack.peek()]) {
				ans=Math.max(ans, A[n-1-i]^A[bkStack.peek()]);
				bkStack.pop();		
			}
			bkStack.add(n-i-1);
			
		}
		
		
		return ans;
    }
}
