package com.scaler.academy.problemsolve3;

import java.util.Arrays;

public class MinimumDifferencePuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumDifferencePuzzle mp = new MinimumDifferencePuzzle();
		int []A= {759, 106, 827, 279, 722, 954, 80, 577, 273, 538, 963, 296, 693, 694, 684, 406, 603, 192, 166, 233, 310, 969, 980, 36, 322, 409, 392, 824, 422, 729, 76, 532, 186, 902, 811, 907, 855};
		int B=16;
		//int[]A = {10, 12, 10, 7, 5, 22};
		//int B=4;
		int solve = mp.solve(A, B);
		System.out.println(solve);
		
	}
	
	public int solve(int[] A, int B) {
        
        Arrays.sort(A);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=A.length-B;i++) {
           
        	System.out.println("MaxValue  "+A[i+B-1]);
        	System.out.println("MaxValue  "+A[i]);

            minDiff=Math.min(minDiff,(A[i+B-1]-A[i]));
            
            System.out.println("MinDiff::"+minDiff);
        }
        return minDiff;
    }

}
