package com.scaler.academy.hashing2;

import java.util.Arrays;
import java.util.Objects;

public class CompareSortedSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []A= {1, 7, 11, 8, 11, 7, 1};
		int [][]B= {{0, 2, 4, 6}};
		CompareSortedSubarrays arrays = new CompareSortedSubarrays();
		int[] solve = arrays.solve(A, B);
		System.out.println(Arrays.toString(solve));
	}
	
	public int[] solve(int[] A, int[][] B) {
		
		int []result = new int[B.length];
		long pow = 10000000000000L;
		
		for(int i=0;i<B.length;i++) {
			int[] temp = B[i];
			long leftSum=0;
			for(int j=temp[0];j<=temp[1];j++) {
				int k = A[j];
				int hashCode = Objects.hashCode(k*pow);
				leftSum+=hashCode;
			}
			long rightSum=0;
			for(int j=temp[2];j<=temp[3];j++) {
				int k = A[j];
				int hashCode = Objects.hashCode(k*pow);
				rightSum+=hashCode;
			}
			
			if(leftSum==rightSum) {
				result[i]=1;
			} else {
				result[i]=-1;
			}
		}
		
		return result;
		
	}
	
	

}
