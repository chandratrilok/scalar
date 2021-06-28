package com.scaler.academy.math.problem;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse reverse=new Reverse();
		long reverse2 = reverse.reverse(3);
		System.out.println(reverse2);

	}
	
	public long reverse(long a) {
		 
	    long rev=0;
	    int count=0;
	    while(count<32) {
	        rev<<=1;
	        if((int)(a&1)==1){
	            rev^=1;
	        }
	        a>>=1;
	        count++;
	    }
	    return rev;
	}

}
