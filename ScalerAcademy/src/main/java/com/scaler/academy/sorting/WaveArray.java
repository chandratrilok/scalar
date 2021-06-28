package com.scaler.academy.sorting;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1, 2, 3, 4};
		
		WaveArray wa = new WaveArray();
		int[] wave = wa.wave(A);
		
		System.out.println(Arrays.toString(wave));
		
	}
	
	
	public int[] wave(int[] A) {
		
		Arrays.sort(A);
		
		for(int i=1;i<A.length;i+=2) {
			
			int temp = A[i-1];
			A[i-1]=A[i];
			A[i]=temp;
			
		}
		
		return A;
    }

}
