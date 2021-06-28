package com.scaler.academy.sorting2;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A= //{5, -17, -100, -11}; 
			//{-1,-2,-3,4,5};
			{24, -8, 7, 20, -19, -13, -3, 25, -10, 10, -25, 7, 22, -15, 23, 6, -2, 26, 10, -14, -8, 5, -7, 27, 19, 15, -28, -30, 9, -19, -30, -2, -27, -9, 4, 14, -8, -4, 15, 24, -8, -27, -16, -11, 1, 18, -2, -5, 9, 28, -23, 23, -26, 8, -17, 20, -7, 5, -18, 8, -24, -20, 20, -28, -3, -18, 1, -8, 26, 14, -6, 15, 9, 12, -1, 29, -12, -3, 8, 23, -21, -7, -4, -25, -18, -12, -17, -15, -11, -3, -29, -13, 10, 1, 11, 11, 15, -9, -29, 12, -21, -17, 1, 7, 11, 7, 15, 21, -4, -20, 17, -8, 1, -3, 28, -8, -29, 9, 29, 26, -16, -21, -23, -5, 25, -13, -1, -29, 25, 17, 3, 11, 26, 14, -30, 12, -4, 29, 21, -25, 8, -4, 11, -28, -16, -26};
		RearrangeArray rearrangeArray = new RearrangeArray();
		int[] solve = rearrangeArray.solve(A);
		System.out.println(Arrays.toString(solve));

	}
	
    public int[] solve(int[] A) {
    	
    	for(int i=0;i<A.length;i++) {
    		if(i%2==0) {
    			if(A[i]<0)
    				continue;
    			else {
    				int pos=-1;
    				for(int j=i+1;j<A.length;j++) {
    					if(A[j]<0) {
    						pos=j;
    						break;
    					}
    				}
    				if(pos>-1) {
	    				int temp=A[pos];
	    				for(int k=pos;k>i;k--) {
	    					A[k]=A[k-1];
	    				}
	    				A[i]=temp;
    				}
    			}
    		} else {
    			if(A[i]>=0)
    				continue;
    			else {
    				int neg=-1;
    				for(int j=i+1;j<A.length;j++) {
    					if(A[j]>=0) {
    						neg=j;
    						break;
    					}
    				}
    				if(neg>-1) {
	    				int temp=A[neg];
	    				for(int k=neg;k>i;k--) {
	    					A[k]=A[k-1];
	    				}
	    				A[i]=temp;
    				}
    			}
    		}
    	}
    	
    	return A;
        
    }
}
