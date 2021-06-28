package com.scaler.academy.hashing;

import java.util.HashMap;
import java.util.Map;

public class PermutationAInB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String A = "aca";
		 String B = "acaa";
		 
		 PermutationAInB win = new PermutationAInB();
		 int permutation = win.solve(A, B);
		 System.out.println(permutation);
	}

	public int solve(String A, String B) {
		
		if(A.length()>B.length()) {
			return 0;
		}
		
		Map<Character,Integer> amap = new HashMap<>();
		Map<Character,Integer> bmap = new HashMap<>();
		
		for(int i=0;i<A.length();i++) {
			char c = A.charAt(i);
			int freq =amap.getOrDefault(c, 0)+1;
			amap.put(c, freq);
			
			
		}
		
		int count=0;
		for(int i=0;i<B.length();i++) {
			
			if(i>=A.length()) {
				
				char  prevC = B.charAt(i-A.length());
				int prevCFreq =bmap.getOrDefault(prevC, 0)-1;
				if(prevCFreq<=0) {
					bmap.remove(prevC);
				} else {
					bmap.put(prevC, prevCFreq);
				}
				
			}
			
			char c = B.charAt(i);
			int freq =bmap.getOrDefault(c, 0)+1;
			bmap.put(c, freq);
			
			if(amap.equals(bmap)) {
				count++;
			}
			
		}
		return count;
	}
}
