package com.scaler.academy.dyamin.prog;

import java.util.Arrays;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int []A = {-44, -41, 1, -26 };
		 int B = 29;
		 int C = -15;
		 int D = 27;
		 
		 MaxSum sum = new MaxSum();
		 int solve = sum.solve(A, B, C, D);
		 System.out.println(solve);

	}
	
	public int solve(int[] A, int B, int C, int D) {
	        
	    int []preMax1=new int[A.length];
	    int []preMax2=new int[A.length];
	    int []preMax3=new int[A.length];
	    
	    preMax1[0]=A[0]*B;
	    for(int i=1;i<A.length;i++) {
	    	preMax1[i]=Math.max(A[i]*B, preMax1[i-1]);
	    }
	    
	    System.out.println(Arrays.toString(preMax1));
	    preMax2[0]=A[0]*C+preMax1[0];
	    
	    for(int i=1;i<A.length;i++) {
	    	preMax2[i]=Math.max(A[i]*C+preMax1[i], preMax2[i-1]);
	    }
	    
	    System.out.println(Arrays.toString(preMax2));
	    preMax3[0]=A[0]*D+preMax2[0];
	    
	    for(int i=1;i<A.length;i++) {
	    	preMax3[i]=Math.max(A[i]*D+preMax2[i], preMax3[i-1]);
	    }
	    
	    System.out.println(Arrays.toString(preMax3));
		
		return preMax3[preMax3.length-1];
		
	}

}
