package com.scaler.academy.sorting2;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {4, 7, 9};
		int []B = {2 ,11, 19};
		MergeSortArray mergeSortArray = new MergeSortArray();
		int[] solve = mergeSortArray.solve(A, B);
		System.out.println(Arrays.toString(solve));

	}
	
    public int[] solve(final int[] A, final int[] B) {
    	int sum =A.length+B.length;
        int []result = new int[sum];
        int countA =0;
        int countB =0;
        int count=0;
       
        while(countA<A.length && countB<B.length) {
            if( A[countA]<B[countB]) {
                result[count++]=A[countA++];
                
            } else {
            	result[count++]=B[countB++];
            }
        }
        while(countA<A.length) {
        	result[count++]=A[countA++];
        } 
        while(countB<B.length) {
        	result[count++]=B[countB++];
        }
        return result;
    }


}
