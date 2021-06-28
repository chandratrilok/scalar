package com.scaler.academy.problemsolve3;

import java.util.Arrays;

public class SortTheUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {0, 1, 15, 25, 6, 7, 30, 40, 50};
		
		SortTheUnsortedArray sua = new SortTheUnsortedArray();
		
		
		int solve = sua.solve(A);
		System.out.println(solve);
	}
	
	public int solve(int[] A) {
        
        int[] copy = Arrays.copyOf(A, A.length);
        
        Arrays.sort(copy);
        
        int min=-1;
        int max=0;
        
        for(int i=0;i<A.length;i++) {
        	if(A[i]==copy[i]) {
        		continue;
        	}
        	if(min==-1) {
        		min=i;
        	} 
        	
        	max=i;
        	
        }
        if(max==0) {
        	return 0;
        }
        
        return max-min+1;
    }

}
