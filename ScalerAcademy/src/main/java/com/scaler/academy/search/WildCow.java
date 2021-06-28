package com.scaler.academy.search;

import java.util.Arrays;

public class WildCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildCow wildCow=new WildCow();
		int []A= {1, 2, 3, 4, 5};
		int B=3;
		int solve = wildCow.solve(A, B);
		System.out.println(solve);
	}

	public int solve(int[] A, int B) {
        Arrays.sort(A);
        int start=0;
        int end=A[A.length-1];
        int ans=0;
        while(start<=end) {
            int mid=(start+end)/2;
            
            if(check(mid,A,B)){
                start=mid+1;
                ans=Math.max(ans, mid);
            }else {
                end=mid-1;
            }
        }
        return ans;
    }
    
    private boolean check(int mid,int []A,int B) {
        int placed=1;
        int pos=A[0];
        
        for(int i=1;i<A.length;i++) {
        	if(A[i]-pos>=mid) {
        		pos=A[i];
        		if(++placed==B) {
        			return true;
        		}
        	}
        }
        return false;
    }
}
