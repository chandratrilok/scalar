package com.scaler.academy.problemsolve2;

import java.util.Arrays;

public class ColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColumnSum columnSum = new ColumnSum();
		
		int [][]A= {{1,2,3,4},
				{5,6,7,8},
				{9,2,3,4}};
		int[] solve = columnSum.solve(A);
		System.out.println(Arrays.toString(solve));

	}
	
	public int[] solve(int[][] A) {
        
        int []column = new int[A[0].length];
        for(int i=0;i<A[0].length;i++) {
        	int tempSum = 0;
            for(int j=0;j<A.length;j++) {
                tempSum+=A[j][i];
            }
            column[i]=tempSum;
        }
        return column;
    }

}
