package com.scaler.academy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class ChangeCharacter {

	public static void main(String[] args) {
		
		ChangeCharacter c = new ChangeCharacter();
		String A = "scaler";
		int B=2;
		String solve = c.rotation(A, B);
		
		System.out.println(solve);
		
	}
	
	public String rotation(String A, int B) {
		
		String ans="";
		int n = A.length();
		B=B%n;
		if(B==0) {
			return A;
		}
		for(int i=0;i<B;i++) {
			ans=A.charAt(n-i-1)+ans;
		}
		return ans+A.substring(0,n-B);
	}
	
	public int solve(String A, int B) {
    
		int count = 0;
		
		int []prefix = new int[26];
		
		for(int i=0;i<A.length();i++) {
			prefix[A.charAt(i)-'a']++;
			if(prefix[A.charAt(i)-'a']==1) {
				count++;
			}
			
		}
		
		Arrays.sort(prefix);
		
		for(int i=0;i<26;i++) {
			if(prefix[i]!=0&& B-prefix[i]>=0) {
				count--;
				B-=prefix[i];
				
			}
		}
		
		return count;
		
	}
	

}
