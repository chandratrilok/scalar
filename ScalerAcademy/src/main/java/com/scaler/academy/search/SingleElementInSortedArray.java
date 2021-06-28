package com.scaler.academy.search;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleElementInSortedArray singleElementInSortedArray = new SingleElementInSortedArray();
		
		int []A = {1, 1, 2, 2, 3};
		int solve = singleElementInSortedArray.solve(A);
		System.out.println(solve);

	}
	
	public int solve(int[] A) {
        int i=1;
        for(;i<A.length;i+=2) {
            if(A[i-1]!=A[i]) {
                return A[i-1];
            }
        }
        return A[i-1];
    }

}
