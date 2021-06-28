package com.scaler.academy.string;

import java.util.Arrays;

public class LexicographicallyLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LexicographicallyLargest ll = new LexicographicallyLargest();
		String s = "psafelqnoe_eflqypyqecbrvxyoagogravxvlmrirxitihomztvjmenihqvfu";
		String largest = ll.getLargest(s);
		System.out.println(largest);

	}

	public String getLargest(String A) {
		
		String []split = A.split("_");
        String S  = split[0];
        char[] T = split[1].toCharArray();
        String ans="";
        
        Arrays.sort(T);
        int n = T.length-1;
        
        for(int i=0;i<S.length();i++) {
        	if(n<0) {
        		ans+=S.charAt(i);
        		continue;
        	}
        	int val = T[n];
        	int sval = S.charAt(i);
        	if(sval<val) {
        		ans+=T[n];
        		n=n-1;
        	} else {
        		ans+=S.charAt(i);
        	}
        	
        }
        
        return ans;
	}
}
