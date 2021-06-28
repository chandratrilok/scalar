package com.scaler.academy.dyamin.prog;

import java.util.Arrays;

public class MaxNonAdajcentSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNonAdajcentSum sum = new MaxNonAdajcentSum();
		int [][]A= {{74, 37, 82, 1},{66, 38, 16, 1}}; 
		
		//int [][]A= {{16, 5, 54, 55, 36, 82, 61, 77, 66, 61},{31, 30, 36, 70, 9, 37, 1, 11, 68, 14}};
		int adjacent = sum.adjacent(A);
		System.out.println(adjacent);
		                    		
	}
	
	public int adjacent(int[][] A) {
        
		int n=A[0].length;
		
		int []max = new int[n];
		
		int [][]dp = new int[2][n];

		for(int i=0;i<max.length;i++) {
			max[i] = Math.max(A[0][i], A[1][i]);
		}
		
		dp[0][0]=0;
		dp[1][0]=max[0];
		
		dp[0][1]=max[0];
		dp[1][1]=max[1];
		
		for(int i=2;i<n;i++) {
		    dp[0][i]=Math.max(dp[0][i-1],dp[1][i-1]);
		    dp[1][i]=Math.max(dp[0][i-2],dp[1][i-2])+max[i];
		    
		    
		}

		return Math.max(dp[0][n-1],dp[1][n-1]);
        
    }

	/*
	 * public int adjacent(int[][] A) {
	 * 
	 * int col=A[0].length;
	 * 
	 * int []max = new int[col]; //int []ans = new int[col];
	 * 
	 * for(int i=0;i<max.length;i++) { max[i] = Math.max(A[0][i], A[1][i]); }
	 * 
	 * System.out.println(Arrays.toString(max)); for(int i=2;i<max.length;i++) {
	 * max[i]=Math.max(max[i]+max[i-2], max[i-1]); }
	 * 
	 * System.out.println(Arrays.toString(max));
	 * 
	 * 
	 * return max[max.length-1];
	 * 
	 * }
	 */
}
