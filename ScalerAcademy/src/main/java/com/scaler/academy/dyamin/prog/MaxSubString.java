package com.scaler.academy.dyamin.prog;

public class MaxSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	
	
	public int LBSlength(final String A) {
		
		int []longest =new int[A.length()];
		
		longest[0]=0;
		if(A.charAt(1)==')' && A.charAt(0)=='(') {
			longest[1]=2;
		} else {
			longest[1]=0;
		}
		for(int i=1;i<A.length();i++) {
			
			if(A.charAt(i)=='(') {
				longest[i]=0;
				continue;
			} 
			if(A.charAt(i)==')' && A.charAt(i-1)=='(') {
				longest[i]=longest[i-2]+2;
			}
		}
		return 0;
    }

}
