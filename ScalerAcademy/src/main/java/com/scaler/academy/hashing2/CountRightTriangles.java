package com.scaler.academy.hashing2;

import java.util.HashMap;
import java.util.Map;

public class CountRightTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int []A = {1, 1, 2, 3, 3};
		 int []B = {1, 2, 1, 2, 1};
		 
		 CountRightTriangles countRightTriangles = new CountRightTriangles();
		 
		 
		 int solve = countRightTriangles.solve(A, B);
		 System.out.println(solve);
	}
	
    public int solve(int[] A, int[] B) {
    	
    	int mod=(int)Math.pow(10, 9)+7;
    	
    	Map<Integer,Integer> mx = new HashMap<>();
    	Map<Integer,Integer> my = new HashMap<>();
    	
    	for(int i=0;i<A.length;i++) {
    		int countX = mx.getOrDefault(A[i], 0)+1;
    		mx.put(A[i], countX);
    		
    		int countY = my.getOrDefault(B[i], 0)+1;
    		my.put(B[i], countY);
    	}
    	
    	int ans=0;
    	for(int i=0;i<A.length;i++) {
    		int x = mx.get(A[i]);
    		int y = my.get(B[i]);
    		ans+=((x-1)*(y-1)%mod);
    	}
    	
    	return ans;
    }
	
	

}
