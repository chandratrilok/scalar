package com.scaler.academy.string;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list =  List.of("abcdefgh", "aefghijk", "abcefgh");
		
		LongestCommonPrefix lpa= new LongestCommonPrefix();
		String prefix = lpa.longestCommonPrefix1(list);

		System.out.println(prefix);
	}
	
	public String longestCommonPrefix1(List<String> A) {
		
		if(A.size()==0) return "";
		
		Integer min = Integer.MAX_VALUE;
		
		for(String str:A) {
			min = Math.min(min, str.length());
		}
		
		
		String prefix = "";
		
		for(int i=0;i<min;i++) {
			
			char c = A.get(0).charAt(i);
			
			for(int j=1;j<A.size();i++)   {
				if(c!=A.get(j).charAt(i)) {
					return prefix;
					
				}
				prefix+=c;
			}
		}
		
		return prefix;
    }

	public String longestCommonPrefix(List<String> A) {
		
		if(A.size()==0) return "";
		
		String prefix = A.get(0);
		
		for(int i=1;i<A.size();i++) {
			
			while(A.get(i).indexOf(prefix)!=0) {
				prefix = prefix.substring(0,prefix.length()-1);
			}
			
		}
		
		return prefix;
    }
}
