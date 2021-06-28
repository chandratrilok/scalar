package com.scaler.academy.problemsolve3;

import java.util.Arrays;

public class SumTheDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= {1,3,2,5,7};
		SumTheDiff sum = new SumTheDiff();
		int solve = sum.solve(A);
		System.out.println(solve);
	}
	
    public int solve(int[] A) {
        
        int n =A.length-1;
        if(n<=1) {
            return 0;
        }
        Arrays.sort(A);

        long max=0;	
        long min=0;
        long sum=0;
        for(int i=0;i<n;i++) {
            
        	sum+=(pow(2,i)-pow(2,n-i-1))*A[i];
           // max+=pow(2,i)*A[i];
            //min+=pow(2,i)*A[n-i];
        }
        int result = (int)((max-min));
        return (int) sum;
    }
    
    public long pow(int base,int exponent) {
    	long result =1;
    	for (;exponent != 0; --exponent)
        {
            result =(result%1000000007)* base;
        }
    	return result%1000000007;
    }

}
