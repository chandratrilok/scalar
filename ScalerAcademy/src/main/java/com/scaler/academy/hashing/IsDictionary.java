package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> A = 
				//List.of("fine", "none", "no"); 
				
				List.of("hello", "scaler", "interviewbit");
		String B = //"qwertyuiopasdfghjklzxcvbnm";
				"adhbcfegskjlponmirqtxwuvzy";
		
		IsDictionary isDisc = new IsDictionary();
		int solve = isDisc.solve(A,B);
		
		System.out.println(solve);

	}
	
	public int solve(List<String> A, String B) {
		
		int ans =0;
		
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<B.length();i++) {
			map.put(B.charAt(i), i+1);
		}
		
		for(int i=1;i<A.size();i++) {
			ans = compareString(A.get(i-1),A.get(i), map);
			if(ans==0) {
				break;
			}
		}
		
		return ans;
    }

	private int compareString(String string, String string2,Map<Character,Integer> map) {
		// TODO Auto-generated method stub
		
		int l1 = string.length();
		int l2 = string2.length();
		int count=0;
		while(l1>count && l2>count) {
			Integer index1 = map.get(string.charAt(count));
			Integer index2 = map.get(string2.charAt(count));
			
			if(index1>index2)
				return 0;
			if(index1<index2)
				return 1;
			
			count++;
			
		}
		
		if(l2==count) {
			return 0;
		}
		return 1;
	}
}
