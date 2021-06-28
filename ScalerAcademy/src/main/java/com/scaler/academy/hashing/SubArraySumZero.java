package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySumZero {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[] A = {4,2,-3,1,3};
		
		SubArraySumZero shaggyDistances = new SubArraySumZero();
		int solve = shaggyDistances.solve(A);
		System.out.println(solve);
	}
	
	public int solve(int[] A) {
        
        List<Integer> list = new ArrayList<>();
        int n = A.length;
        int prefixSum=0;
        for(int i=0;i<n;i++) {
            if(list.contains(prefixSum) || prefixSum==0) {
                return 1;
                
            } 
            prefixSum+=A[i];
        }
        return 0;
    }

}
