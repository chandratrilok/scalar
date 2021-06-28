package com.scaler.academy.sorting2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinSwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {3,2,1,0};
		
		MinSwapArray msa = new MinSwapArray();
		int solve = msa.solve(A);
		System.out.println(solve);
		
	} 
	
	 public int solve(int[] A) {
		 
		 int ans=0;
		 
		 int n= A.length;
		 boolean []boolArr = new boolean[n];
		 int boolPointer=0;
		 
		 
		 //Map<Integer,Integer> map = new HashMap<>();
		 
		 for(int i=0;i<n;i++) {
			 
			 if(A[i]==i) {
				 boolArr[i]=true;
				 boolPointer++;
			 }
		 }
		 
		 Set<Integer> set = new HashSet<>();
		 
		 int count=0;
		 int i =0;
		 
		 while(true) {
			 
			 if(A[i]!=i) {
				 if(set.contains(i)&&set.contains(A[i])) {
					 ans+=set.size()-1;
				 } else {
					 set.add(i);
					 set.add(A[i]);
					 i=A[i];
				 }
			 }
			 
			 boolArr[i]=true;
			 boolArr[A[i]]=true;
			 
			 for(int j=boolPointer;j<A.length;j++) {
				 boolPointer++;
				 if(!boolArr[boolPointer]) {
					 break;
				 }
				 
			 }
			 i=++count;
			 
			 if(boolPointer>=A.length)
				 break;
			 
			 
			 
		 }
		 
		 return ans;
		 
	 }

}
