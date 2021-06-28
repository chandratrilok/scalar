package com.scaler.academy.pointer2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairsGivenDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {1, 5, 3, 4, 2};
		int B= 3;
		
		
		PairsGivenDiff p = new PairsGivenDiff();
		int solve = p.solve(A, B);
		System.out.println(solve);
	}
	
	
	public int solve(int[] A, int B) { 
		int result =0;
		Map<Integer,Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();

		for(int val:A) {
			Integer count = map.getOrDefault(val, 0);
			map.put(val, ++count);
			set.add(val);

		}
		
		
		
		for(int val:set) {
			if(B==0) {
				if(map.containsKey(val+B) && map.get(val)>1) {
					result++;
				}
			} else {
				if(map.containsKey(val+B) && map.get(val+B)>=1) {
					result++;
				}
			}
		}
		
		return result;
	}

}
