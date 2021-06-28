package com.scaler.academy.string;

import java.util.ArrayList;
import java.util.List;

public class AmazingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmazingSubarrays as = new AmazingSubarrays();
		int solve = as.solve("ABEC");
		System.out.println(solve);

	}

	public int solve(String A) {
		int count=0;
		
		
		for(int i=0;i<A.length();i++) {
			if (isVowel(A.charAt(i))) {
				count+=A.length()-i;
			}		
		}	
		return count%10003;
	}
	
	public boolean isVowel(char c) {
	if (	   c == 'A' || c == 'a'
	        || c == 'E' || c == 'e'
	        || c == 'I' || c == 'i'
	        || c == 'O' || c == 'o'
	        || c == 'U' || c == 'u') 
		        return true; 
		    else
		        return false; 
	}
	
}
