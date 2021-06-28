package com.scaler.academy.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlidingWindow slidingWindow = new SlidingWindow();
		
		int []A = {1, 3, -1, -3, 5, 3, 6, 7};
		int B = 3;
		int[] slidingMaximum = slidingWindow.slidingMaximum(A, B);
		
		System.out.println(Arrays.toString(slidingMaximum));

	}
	
	public int[] slidingMaximum(final int []A,int B) {
		
		int []result = new int[A.length-B+1];

		Deque<Integer> dq = new LinkedList<Integer>();
		for(int i=0;i<A.length;i++) {
			
			
			while(!dq.isEmpty()&&A[dq.getLast()]<A[i]) {
				dq.removeLast();
			}
			dq.add(i);
			
			if(i>=B-1) {
				result[i-B+1] = A[dq.getFirst()];
			}
			if(!dq.isEmpty() && (dq.getFirst()==i-B+1)) {
				dq.removeFirst();
			}
			
			
			
		}
		
		return result;
	}

}
