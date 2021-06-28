package com.scaler.academy.pointer2;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeSum threeSum = new ThreeSum();
		int []A = { -5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3 };

		//int []A = { 2, 1, -9, -7, -8, 2, -8, 2, 3, -8 };
		int B = -1;
		int threeSumClosest = threeSum.threeSumClosest(A, B);
		System.out.println(threeSumClosest);

	}
	
	public int threeSumClosest(int[] A, int B) {
        
        
        int n=A.length;
        if(n==3) {
            return A[0]+A[1]+A[2];
        }
        Arrays.sort(A);
        
        long current=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++) {
            int a = i;
            int b= i+1;
            int c = n-1;
            
            while(b<c) {
                
                int sum = A[a]+A[b]+A[c];
                
                if(Math.abs(sum-B)<Math.abs(current-B)) {
                    current=sum;
                } 
                
                if(sum<B) {
                    b++;
                } 
                
                if(sum>B) {
                    c--;
                }
                if(sum==B) {
                    return B;
                }
                
            }
            
        }
        
        return (int)current;
        
        
    }

}
