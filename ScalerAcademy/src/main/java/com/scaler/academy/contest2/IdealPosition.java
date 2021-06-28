package com.scaler.academy.contest2;

import java.util.ArrayList;
import java.util.Arrays;

public class IdealPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int A=4;
		int B=10;
		
		IdealPosition pos = new IdealPosition();
		int result = pos.solve1(A, B);
		
		System.out.println(result);
		
		

	}
	
	boolean isValid(int A,int i, int B) {
		
		int total = (A*(A+1))/2;
		int indexVal = ((A-i)*(A-i+1))/2;
		int req = total - indexVal;
		
		if(req<=B) {
			return true;
		}
		return false;
	}
	
	public int solve1(int A,int B) {	
		int low=1;
		int high =A;
		
		int ans =-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(isValid(A, mid, B) && !isValid(A, mid+1, B)) {
				ans=mid;
				break;
			}	
			if(isValid(A, mid, B) && isValid(A, mid+1, B)) {
				low=mid+1;
			} else {
				high= mid-1;
			}
		}
		int res = A-ans;
		if(res>A) {
			return 0;
		}
		return res;
	}
	 
	
	public int solve(int A,int B) {	
		
		if(A<=0 || A>1000) {
            return 0;
        }
		int []arr = new int[A];
        
		int sum=0;
		
		OUTER: for(int i=0;i<A;i++) {
		 for(int j=A-1;j>=i;j--) {
			 if(sum==B) {
				 break OUTER;
			 }
         	arr[j]++;
         	sum++;
         	
         }
		}
		
        int count=0;
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]-arr[i-1]>1) {
        		return 0;
        	}
        	if(i+1==arr[i]) {
        		continue;
        	}
        	
        	count++;
        }
        
       return count;
		
	}

}
