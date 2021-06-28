package com.scaler.academy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {1};
		int []B = {1};
		
		TaskScheduling taskScheduling = new TaskScheduling();
		int solve = taskScheduling.solve(A, B);
		System.out.println(solve);

	}
	
	public int solve(int[] A, int[] B) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int ans =0;
		for(int val:A) {
			queue.add(val);
		}
		
		
		for(int i=0;i<B.length;i++) {
			
			while(B[i]!=queue.peek()) {
				Integer poll = queue.poll();
				ans++;
				queue.add(poll);
			}
			ans++;
			queue.remove();
		}
		
		return ans;
				
	}

}
