package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ColorFulNumber {

	public static void main(String[] args) {
		
		
		ColorFulNumber c = new ColorFulNumber();
		System.out.println(c.colorful(123));
		
	}
	public int colorful(int A) {
		
		
		List<Integer> nums = new ArrayList<>();
		while(A>0) {
			int num = A%10;
			
			nums.add(num);
			
			A/=10;
		}
		
		 //Collections.reverse(nums);

		HashSet<Integer> hashSet = new HashSet<>();
	    
		
	    int n = nums.size();

		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int prod=1;
				
				for (int k = i; k <= j; k++) {
	                prod = prod * nums.get(k);
	            }
				if(hashSet.contains(prod)) {
					return 0;
				}
				
				hashSet.add(prod);
				
			}
		}
		
		return 1;
	    
	}
}

