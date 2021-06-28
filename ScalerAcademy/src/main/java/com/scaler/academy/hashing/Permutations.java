package com.scaler.academy.hashing;

import java.util.HashMap;
import java.util.Map;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "abc";
		String B = "abcbacabc";
		Permutations p = new Permutations();
		int result = p.solve1(A, B);
		
		System.out.println("Result::"+result);
	}
	
	/**
	 * @param A
	 * @param B
	 * @return
	 */
	public int solve(String A, String B) {
		
		int count=0;
		
		Map<Character,Integer> mapA= populateMap(A);
		Map<Character,Integer> mapB= populateMap(B.substring(0,A.length()));
		count+=same(mapA, mapB);
		
		int n=A.length();
		
		for(int i=n,j=0;i<B.length();i++,j++) {
		
			char firstChar = B.charAt(j);			
			mapB.computeIfPresent(firstChar,(key,val)->(val==1)? null:val-1);
			char lastestChar = B.charAt(i);
			mapB.compute(lastestChar,(key,val)->(val==null)?1:val+1);
			count+=same(mapA, mapB);
			
		}
		return count;
    }
	
	public int same(Map<Character,Integer> mapA,Map<Character,Integer> mapB) {
		return mapA.equals(mapB)?1:0;
	}
	public Map<Character,Integer> populateMap(String str) {
		Map<Character,Integer> map= new HashMap<>();
		char[] chars = str.toCharArray();
		for(char c:chars) {
			int count=map.containsKey(c)?map.get(c)+1:1;
			map.put(c,count);
		}
		return map;

	}
	
	 public int solve1(String A, String B) {
		 
	 	int n = A.length();
        int m = B.length();
        int hash1[] = new int[26];
        int hash2[] = new int[26];
        int count = 0;
        
        for(int i=0;i<n;i++) {
        	hash1[A.charAt(i) - 'a'] += 1;
        }
        for(int i=0;i<n;i++) {
        	hash2[B.charAt(i) - 'a'] += 1;
        }
        count+=same(hash1,hash2);
        
        for(int i = n, j = 0; i < m; i += 1, j += 1) {
            hash2[B.charAt(j) - 'a'] -= 1;
            hash2[B.charAt(i) - 'a'] += 1;
            count += same(hash1, hash2);
        }
        
        return count;
        
		 
	 }
	 
	 public int same(int[] hash1, int[] hash2) {
	        for(int i = 0; i < 26; i += 1) {
	            if(hash1[i] != hash2[i])
	                return 0;               // not a permutation of A
	        }
	        return 1;                       // got a permutation of A in G
	    }

}
