package com.scaler.academy.hashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayInGivenOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []A = {1, 2, 3, 4, 5};
		//int []B = {5, 4, 2};
		
		int []A= { 10, 2, 18, 16, 16, 16};
		int []B = { 3, 13, 2, 16, 4, 19 };
		SortArrayInGivenOrder sortArrayInGivenOrder = new SortArrayInGivenOrder();
		int[] solve = sortArrayInGivenOrder.solve(A, B);
		System.out.println(Arrays.toString(solve));

	}
	
	public int[] solve(int[] A, int[] B) {
		
		Arrays.sort(A);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<A.length;i++) {
			int count = map.getOrDefault(A[i], 0)+1;
			map.put(A[i], count);
		}
		
		int [] ans = new int[A.length];
		
		
		int j=0;
		for(int i=0;i<B.length;i++) {
			if(map.containsKey(B[i])) {
				for(int k=0;k<map.get(B[i]);k++) {
					ans[j]=B[i];
					j++;
				}
				map.remove(B[i]);
			}
		}
		
		for(int i=0;i<A.length;i++) {
			if(map.containsKey(A[i])) {
				ans[j]=A[i];
				j++;
			}
			
		}
		
		return ans;
	}
	

}
