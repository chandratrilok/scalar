package com.scaler.academy.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
		LongestSubString longestSubString = new LongestSubString();
		int lengthOfLongestSubstring = longestSubString.lengthOfLongestSubstring(A);
		System.out.println(lengthOfLongestSubstring);

	}
	
	public int lengthOfLongestSubstring(String A) {
		 
		Set<Character> set= new HashSet<>();
		
		int ans=0;
		int count =0;
		int i =0;
		int j=0;
		while(j<A.length()) {
			char c= A.charAt(j);
			while(set.contains(c)) {
				ans=Math.max(ans, count);
				set.remove(A.charAt(i));
				i++;
				count=j-i;
			}
			set.add(c);
			count++;
			j++;
		}
		
		return Math.max(ans, count);
    }

}
