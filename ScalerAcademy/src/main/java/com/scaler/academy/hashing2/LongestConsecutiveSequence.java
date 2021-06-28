package com.scaler.academy.hashing2;

import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> A = List.of(100, 4, 200, 1, 3, 2);
		int []A= {6, 4, 5, 2, 3};
		LongestConsecutiveSequence l = new LongestConsecutiveSequence();
		int longestConsecutive = l.longestConsecutive(A);
		System.out.println(longestConsecutive);
		

	}
	public int longestConsecutive(int []A) {
		int ans=0;
		Arrays.sort(A);
		int count=1;
		for(int i=1;i<A.length;i++) {
			if(A[i]-A[i-1]==1) {
				count++;
			} else {
				ans=Math.max(ans, count);
				count=0;
			}
		}
		return ans;
	}
	public int longestConsecutive1(final List<Integer> A) {
		
		int ans=0;
		
		for(int val:A) {
			int copy=val;
			
			if(!A.contains(copy	-1)) {
				int count =1;
				while(A.contains(copy+1)) {
					copy++;
					count++;
				}
				ans=Math.max(ans, count);
				
			} 
			
		}
		
		return ans;
    
	}
	

}
