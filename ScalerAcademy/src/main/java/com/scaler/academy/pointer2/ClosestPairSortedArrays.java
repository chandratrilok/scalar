package com.scaler.academy.pointer2;

import java.util.Arrays;

public class ClosestPairSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int []A = {1, 3, 5, 7, 9};
		 int []B = {2, 4, 6, 8, 10};
		 int C = 10;
		 
		 ClosestPairSortedArrays closestPairSortedArrays = new ClosestPairSortedArrays();
		 int[] solve = closestPairSortedArrays.solve(A, B, C);
		 System.out.println(Arrays.toString(solve));
		 
	}
	public int[] solve(int[] A, int[] B, int C) {
        
        int l=0;
        int r=B.length-1;
        int newl=l;
        int newr=r;
        int diff=Integer.MAX_VALUE;
        
        int [] result=new int[2];
        while(l<A.length && r>=0) {

           
            if(Math.abs(A[l]+B[r]-C)<diff) {
            	
            	newl=l;
                newr=r;
                diff=Math.abs(A[l]+B[r]-C);
            } else if(Math.abs(A[l]+B[r]-C)==diff) {
            	if(r<newr && l==newl) {
            		newr=r;
            	}
            }
            
            if(A[l]+B[r]>C ) {
                r--;
            } else {
                l++;
            }
            
          
        }
        result[0]=A[newl];
        result[1]=B[newr];
        return result;
    }
	
	public void solve(int aVal, int bVal, int C,int []result) {
		
		
	}

}
