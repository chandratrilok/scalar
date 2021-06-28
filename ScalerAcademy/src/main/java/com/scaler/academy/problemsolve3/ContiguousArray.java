package com.scaler.academy.problemsolve3;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A= {0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0};
		//[-1, -2, -3, -4, -5, -4, -3, -2, -1, -2, -1, -2]
			
			//{ 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1  };
				 // [-1, 0, 1, 0, 1, 0, 1, 0, -1, 0, 1]
		//-1, 0, -1, -2, -1, -2, -1, -2, -1, 0, -1, -2, -3
		
		ContiguousArray ca = new ContiguousArray();
		int solve = ca.solve(A);
		System.out.println(solve);

	}
	
    public int solve(int[] A) {
    	Map<Integer,Integer> map = new HashMap<>();
    	
    	int longestSubArray=0;
    	int sum =0;
    	for(int i=0;i<A.length;i++) {
    		sum += A[i]==0?-1:1;
    		
    		if(sum==0) {
    			longestSubArray= Math.max(longestSubArray, i+1);
    		}
    		
    		if(!map.containsKey(sum)) {
    			map.put(sum, i);
    		} else {
    			
    			longestSubArray = Math.max(longestSubArray,(i-(map.get(sum))));
    		}
    		
    	}
    	
    	return longestSubArray;
    }
	

}
