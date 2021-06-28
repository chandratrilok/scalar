package com.scaler.academy.sorting2;

import java.util.Arrays;

public class BottelsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16, 3, 8, 17, 12, 5, 3, 14, 13, 3, 2, 17, 19, 16, 8, 7, 12, 19, 10, 13, 8, 20, 16, 15, 4, 12, 3};
		BottelsGame bg = new BottelsGame();
		int solve = bg.solve(A);
		System.out.println(solve);
		
	}
	
	public int solve(int[] A) {
        Arrays.sort(A);
        
        int count=A.length;
        int i=0;
        int j=1;
        while(j<A.length) {
            
            if(A[i]<A[j]) {
                i++;
            }
            
            j++;
            
        }
        
        System.out.println(count+" "+i);
       
        return count-i;
    }

}
