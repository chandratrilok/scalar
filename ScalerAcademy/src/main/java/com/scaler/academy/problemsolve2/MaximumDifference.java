package com.scaler.academy.problemsolve2;

import java.util.Arrays;

public class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaximumDifference maximumDifference = new MaximumDifference();
		int A[] = {93, 51, 84, 81, 89, 82, 28, 78, 86, 35, 64, 38, 49, 99, 83};
		int B = 4;
		int solve = maximumDifference.solve(A,B);
		System.out.println(solve);
	}
	
	public int solve(int[] A, int B) {
        Arrays.sort(A);
        
        int count=0;
        
        int maxSum=0;
        int minSum=0;
        
        for(int i=0;i<A.length;i++) {
            if(count<B) {
            	minSum+=A[i];
            } else {
            	maxSum+=A[i];
            }
            count++;
        }
        
        int maxDiff = Math.abs(maxSum-minSum);
        
       // int tempMinSum=minSum;
        
        for(int i=0;i<A.length-B;i++) {
        	minSum= minSum-A[i]+A[i+B];
        	maxSum=maxSum-A[A.length-i-1]+A[i];
        	int tempDiff = Math.abs(minSum-maxSum);
        	maxDiff=Math.max(maxDiff, tempDiff);
        }
        
        return maxDiff;
    }

}
