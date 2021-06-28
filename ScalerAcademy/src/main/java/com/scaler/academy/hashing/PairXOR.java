package com.scaler.academy.hashing;

import java.util.HashSet;
import java.util.Set;

public class PairXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairXOR p = new PairXOR();
		
		int[] A = {3, 6, 8, 10, 15, 50};
		//{5, 4, 10, 15, 7, 6};
		int B= 5;
		int solve = p.solve(A, B);
		
		System.out.println("Solve::" + solve);
	}
	
	public int solve(int[] A, int B) {
		
		int count =0;
		
		Set<Integer> set = new HashSet<>();
		
		
		
		for(int i=0;i<A.length;i++) {
			/*
			 * for(int j=i+1;j<A.length;j++) { if(A[j]==(B^A[i])) { count++; } }
			 */
			//System.out.println((B^A[i])+" "+A[i]);
			if(set.contains(B^A[i] )) {
				count++;
			}
			//System.out.println(A[i]+" is added to "+(set.add(A[i])));
			set.add(A[i]);
		}
		return count;
    }

}
