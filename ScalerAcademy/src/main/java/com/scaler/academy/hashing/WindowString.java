package com.scaler.academy.hashing;

import java.util.HashMap;
import java.util.Map;

public class WindowString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String A = "ADOBECODEBANC";
		 String B = "ABC";
		 
		 WindowString win = new WindowString();
		 String minWindow = win.minWindow(A, B);
		 System.out.println(minWindow);
	}

	public String minWindow(String A, String B) {
		
		if(A.length()<B.length()) {
			return "";
		}
		
		Map<Character,Integer> map = new HashMap<>();
		
		int start=0;
		int total=0;
		int length=0;
		
		for(int i=0;i<B.length();i++) {
			char c = B.charAt(i);
			int freq =map.getOrDefault(c, 0)+1;
			map.put(c, freq);
		}
		
		for(int head=0,tail=0;tail<A.length();tail++) {
						
			char c = A.charAt(tail);
			
			if(!map.containsKey(c)) {
				continue;
			}
			
			int freq =map.get(c);
			map.put(c, --freq);
			
			if(freq>=0) {
				total++;
			}
			
			if(total==B.length()) {
				
				while(true) {
					break;
				}
				
				while(!map.containsKey(A.charAt(head))||map.get(A.charAt(head))<0) {
					if(map.containsKey(A.charAt(head))) {
						int tempFreq =map.get(A.charAt(head));
						map.put(A.charAt(head), ++tempFreq);
					}  
					head++;
				}
				
				if(length==0|| tail-head+1<length) {
					length = tail - head+1;
					start =head;
				}
			}
			
		}
		
		return A.substring(start,start+length);
		
	}
	
}
