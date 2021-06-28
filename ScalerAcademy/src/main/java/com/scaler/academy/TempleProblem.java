package com.scaler.academy;

import java.util.Arrays;

public class TempleProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempleProblem tp = new TempleProblem();
		
		int [][]B = 
			{
			  {1, 2, 10},
			  {2, 3, 20},
			  { 2, 5, 25}
			};
		int A=5;
		int[] solve = tp.solve(A, B);
		System.out.println(Arrays.asList(solve));
		

	}
	
	public int[] solve(int A, int[][] B) {
	        
	        int [] baggers = new int[A];
	        for(int i=0;i<B.length;i++) {
	            int coin = B[i][2];
	            int leftIndex =  B[i][0];
	            int rightIndex =  B[i][1];
	            
	            baggers[leftIndex-1]+=coin;
	            if(rightIndex==A) {
	                baggers[rightIndex-1]+=(coin);
	            } else {
	                baggers[rightIndex]-=(coin);
	            }
	            
	        }
	        
	        int n= (baggers[A-1])<0?A:A-1;
	        
	        for(int i=1;i<n;i++) {
	        	
	            baggers[i]+=baggers[i-1];
	        }
	        return baggers;
	    }

}
