package com.scaler.academy.dyamin.prog;

import java.util.ArrayList;
import java.util.List;

public class LISLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LISLength l=new LISLength();
		int []A= {2, 1, 4, 3};
		int findLIS = l.findLIS(A);
		System.out.println(findLIS);

	}
	
	public int findLIS(int[] A) {
		
		if(A==null||A.length==0) {
			return 0;
		}
		
		List<Integer> res=new ArrayList<>();
		res.add(A[0]);
		
		int max=1;
		
		for(int i=1;i<A.length;i++) {
			
			if(res.get(res.size()-1)<A[i]) {
				res.add(A[i]);
				max++;
			} else {
				int ind=find(res,A[i])+1;
				res.set(ind, A[i]);
			}
		}
		
		return max;
		
		
	}

	private int find(List<Integer> res, int element) {
		// TODO Auto-generated method stub
		
		int l=0,h=res.size()-1;
		int result=-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(res.get(mid)<element) {
				result=mid;
				l=mid+1;
			} else {
				h=mid-1;
			}
		}
		return result;
	}

}
