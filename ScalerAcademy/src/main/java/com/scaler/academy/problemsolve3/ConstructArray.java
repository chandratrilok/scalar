package com.scaler.academy.problemsolve3;

import java.util.Arrays;

public class ConstructArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructArray ca = new ConstructArray();
		int[] solve = ca.solve(5, 20, 50);
		System.out.println(Arrays.toString(solve));
	}
	
	public int[] solve(final int A, final int B, final int C) {
		int maxDiff = C-B;
		
		int []result = new int[5];
		int d=0;
		boolean isContainB=false;
		boolean isContainC=false;
		int i=0;
		for(;i<=maxDiff;i++) {
			if(B==i) {
				isContainB=true;
			}
			if(C==i) {
				isContainC=true;
			}
			
			if(isContainB&&isContainC) {
				break;
			}
				
		}
		
		System.out.println("D::"+i);
		
		
		return result;
    }
	
	

}
