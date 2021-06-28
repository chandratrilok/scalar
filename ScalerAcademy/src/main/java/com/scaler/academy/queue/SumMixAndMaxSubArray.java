package com.scaler.academy.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SumMixAndMaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumMixAndMaxSubArray slidingWindow = new SumMixAndMaxSubArray();
		
		int []A = {2, 5, -1, 7, -3, -1, -2};
		int B = 4;
		int sum= slidingWindow.solve(A, B);
		
		System.out.println(sum);

	}
	
	public int solve(int []A,int B) {
		
		int []result = new int[A.length-B+1];
		int mod= (int)Math.pow(10,9)+7;

		Deque<Integer> dqMax = new LinkedList<Integer>();
		Deque<Integer> dqMin = new LinkedList<Integer>();
		for(int i=0;i<A.length;i++) {
			
			
			while(!dqMax.isEmpty()&&A[dqMax.getLast()]<A[i]) {
				dqMax.removeLast();
			}
			
			while(!dqMin.isEmpty()&&A[dqMin.getLast()]>A[i]) {
				dqMin.removeLast();
			}
			
			dqMax.add(i);
			dqMin.add(i);
			
			if(i>=B-1) {
				result[i-B+1] = A[dqMax.getFirst()]+A[dqMin.getFirst()];
			}
			if(!dqMax.isEmpty() && (dqMax.getFirst()==i-B+1)) {
				dqMax.removeFirst();
			}
			if(!dqMin.isEmpty() && (dqMin.getFirst()==i-B+1)) {
				dqMin.removeFirst();
			}
		}
		
		int sum=0;
		for(int el:result) {
			sum+=el;
		}
		return sum;
	}

}
