package com.scaler.academy.bit.manipulation;

import java.util.Arrays;

public class MinorXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {0, 2, 5, 7};
		MinorXor minorXor = new MinorXor();
		int ans = minorXor.minorXor(A);
		System.out.println(ans);
		

	}

		
	public int minorXor(int []A) {
		int min = Integer.MAX_VALUE;
		
		Arrays.sort(A);
		
		for(int i=1;i<A.length;i++) {
			int xor = A[i-1]^A[i];
			min = Math.min(min, xor);
		}
		
		return min;
	}
}
