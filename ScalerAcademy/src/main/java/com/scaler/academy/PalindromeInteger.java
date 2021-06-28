package com.scaler.academy;

import java.util.List;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeInteger p = new PalindromeInteger();
		int A =943566;
		System.out.println(p.convertToTitle(A));

	}
	
	public String convertToTitle(int A) {
        String str = "";
        while(A>0) {
        	int rem = A%26;
        	if(rem==0) {
        		str="Z"+str;
        		A=(A/26)-1;
        	} else {
        		str=(char)((rem-1)+'A')+str;
        		A=(A/26);
        	}
        	
        }
        return str;
    }
	
	public int reverse(int A) {
		boolean isPos = true;
        if(A<0) {
        	A=Math.abs(A);
        	isPos=false;
        }
        int rev=0;
        while(A>0) {
        	if(rev>=(Integer.MAX_VALUE/10)) {
            	return 0;
            }
            rev=rev*10+A%10;
            A/=10;
        }
        
        if(!isPos) {
        	rev*=-1;
        }
        
        return rev;
    }
	
	public int isPalindrome(int A) {
        
        if(A<0) {
            return 0;
        }
        int temp =A;
        int rev=0;
        while(A>0) {
            
            rev=rev*10+A%10;
            
            A/=10;
        }
        if(rev==temp) {
            return 1;
        }
        return 0;
    }

}
