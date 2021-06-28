package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubArray lsa = new LongestSubArray();
		
		//int[] A = {1, 0, 1, 0, 1};
		
		//int[] A = {0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0 };
		
		
		int[] A = {1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0};

		ArrayList<Integer> list = (ArrayList)Arrays.stream(A).boxed().collect(Collectors.toList());
		
		int result = lsa.solve(list);
		
		System.out.println("Result::" +result);
	}
	
	public int solve(ArrayList<Integer> A) {
		int longestArrayCount=0;
		int sum=0;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<A.size();i++) {
			int val = A.get(i);
			sum+=(val==0)?-1:1;
			
			if(sum==0) {
				int currentIndex = i+1;
				if(longestArrayCount<currentIndex) {
					longestArrayCount= currentIndex;
				} 
			} else if(map.containsKey(sum)) {
				Integer ind = map.get(sum);
				
				int diff = i-ind;
				if(longestArrayCount<diff) {
					longestArrayCount= diff;
				} 
			} else {
				map.put(sum, i);
			}
		}
		return longestArrayCount;
    }

}
