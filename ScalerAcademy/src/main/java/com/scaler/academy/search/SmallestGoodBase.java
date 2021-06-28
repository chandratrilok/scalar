package com.scaler.academy.search;

import java.math.BigInteger;

public class SmallestGoodBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmallestGoodBase smallestGoodBase = new SmallestGoodBase();
		String A="4681";
		String solve = smallestGoodBase.solve(A);
		System.out.println(solve);

	}
	
	public String solve(String A) {
        long num = Long.parseLong(A);
        long res = 0;
        for(int i=60;i>1;i--) {
        	long low=2L;
    		long high=num-1;
    		
    		while(low<=high) {
    			 long mid=low+(high-low)/2L;
    			 double left = num*(mid-1);
    			 double	right = Math.pow(mid, i)-1;
    			 
    			 if(left==right) {
    				 res=mid;
    				 break;
    			 }
    			 
    			 if(left>right) {
    				 low=mid+1;
    			 } else {
    				 high=mid-1;
    			 }
    		}	 
            if(res!=0) {
            	return Long.toString(res);
    		}
        }
        return Long.toString(num-1);
    }

	private long can(long num, int len) {
		// TODO Auto-generated method stub
		long low=2L;
		long high=(long) Math.pow(num, 1d/(len-1));
		while(low<=high) {
			long mid=(low+high)/2L;
			if(compare(mid,len,num)==1) {
				high=mid-1L;
			} else {
				low=mid+1L;
			}
		}
		
		return compare(high,len,num)==0?high:-1L;
	}

	private int compare(long base, int len, long num) {
		// TODO Auto-generated method stub
		
		double would=1d;
		double dbase=base;
		for(int i=1;i!=len;i++) {
			would+=dbase;
			dbase*=dbase;
		}
		return Double.compare(would, num);
	}

}
