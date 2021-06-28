package com.scaler.academy.pointer2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []A= {1, 1, 3};
		//int []A = { 93, 9, 12, 32, 97, 75, 32, 77, 40, 79, 61, 42, 57, 19, 64, 16, 86, 47, 41, 67, 76, 63, 24, 10, 25, 96, 1, 30, 73, 91, 70, 65, 53, 75, 5, 19, 65, 6, 96, 33, 73, 55, 4, 90, 72, 83, 54, 78, 67, 56, 8, 70, 43, 63 };
		int []A= {3,2,5,3,2};
		
		CountSubArrays countSubArrays=new CountSubArrays();
		
		int solve = countSubArrays.solve(A);
		System.out.println(solve);
		
	}
	
	public int solve(int[] A) {
		
		int mod = (int)1e9+7;
		Map<Integer,Integer> map = new HashMap<>();
		long ans = 0;
		int l=0,r=0;
		for(int x:A) {
			
			if(map.get(x)!=null) {
				while(map.get(x)!=0) {
					map.put(A[l], 0);
			          l++;
				}
			}
			map.put(x, 1);
			ans += r - l + 1;
		    ans %= mod;
		    r++;
		}

		
		return  (int)ans%mod;
		
    }
	
}