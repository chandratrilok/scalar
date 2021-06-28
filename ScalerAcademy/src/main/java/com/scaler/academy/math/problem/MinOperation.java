package com.scaler.academy.math.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinOperation {
	
	public static void main(String[] args) {
		MinOperation minOperation = new MinOperation();
		
		int [][]A =  { 
		        {0, 2, 8},
		        {8, 2, 0},
		        {0, 2, 8}
		};
		int B = 2;
		int solve = minOperation.solve(A, B);
		System.out.println(solve);
	}
	
	public int solve(int[][] A, int B) {
		int row = A.length;
		int col = A[0].length;
		
		int mod=0;
		if(A[0][0]<0) {
			mod=B-Math.abs(A[0][0])%B;
		} else {
			mod=A[0][0]%B;
		}
				
				
		ArrayList<Integer> list= new ArrayList<>();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int val = A[i][j];

				list.add(val);
				
				if(val<0) {
					int res=B-Math.abs(A[0][0])%B;
					if(res!=mod) {
						return -1;
					}
				} else {
				
					if(A[i][j]%B!=mod) {
						return -1;
					}
				}	
				
			}
		}
		
		Collections.sort(list);
		
		int minOps = 0;
		
		int median = list.get((row*col) / 2);

		
		for(int i=0;i<(row*col);i++) {
			minOps+=Math.abs(median-list.get(i))/B;
		}
		
		if ((row * col) % 2 == 0)
	    {
	 
	      
	      int median2 = list.get((row*col) / 2 -1);;
	 
	      int minOps2 = 0;
	      for (int i = 0; i < row*col; ++i)
	    	  minOps2 += Math.abs(list.get(i) - median2) / B;
	 
	      minOps= Math.min(minOps, minOps2);
	    }
		
		return minOps;
	}

}
