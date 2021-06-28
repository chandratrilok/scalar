package com.scaler.academy.hashing;

import java.util.HashMap;
import java.util.Map;

public class ShaggyDistances {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[] A = {7, 1, 3, 4, 1, 7};
		
		ShaggyDistances shaggyDistances = new ShaggyDistances();
		int solve = shaggyDistances.solve(A);
		System.out.println(solve);
	}
	
	public int solve(int[] A) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++) {
            if(map.containsKey(A[i])) {
                int currentIndex =map.get(A[i]);
                ans=Math.min(ans,i-currentIndex);
                
            }
            map.put(A[i],i);
        }
        return ans;
    }

}
