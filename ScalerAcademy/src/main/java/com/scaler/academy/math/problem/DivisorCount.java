package com.scaler.academy.math.problem;

import java.util.Arrays;

public class DivisorCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A= {2, 3, 4, 5};
		DivisorCount divisorCount= new DivisorCount();
		int []solve = divisorCount.solve(A);
		System.out.println(Arrays.toString(solve));

	}
	
	private int getMax(int []A) {
		
		int max=Integer.MIN_VALUE;
		for(int i:A) {
			max=Math.max(max, i);
		}
		return max;
	}
	public int[] solve(int[] A) {
		
		int n=A.length;
		int max=getMax(A);
		int []spf=new int[max+5];
		for(int i=1;i<=max;i++) {
			spf[i]=i;
		}
		
		for(int i=2;i*i<=max;i++) {
			if(spf[i]==i) {
				for(int j=i*i;j<=max;j+=i) {
					if(spf[j]==j) {
						spf[j]=i;
					}
				}
			}
			
		}
		int [] res=new int[n];
		for(int i=0;i<n;i++) {
			int temp=A[i];
			int ans=1;
			
			while(temp!=1) {
				int pow=1;
				int d=spf[temp];
				while(d>0 && temp!=1&& temp%d==0) {
					pow++;
					temp=temp/d;
				}
				ans*=pow;
			}
			res[i]=ans;
		}
			
		return res;
	}
	public int[] solve1(int[] A) {
		
		int max=1000005;
		int []divCount=new int[max];
		for(int i=1;i<1000000;i++) {
			for(int j=i;j<1000000;j+=i) {
				divCount[j]+=1;
			}
		}
		
		for(int i=0;i<A.length;i++) {
			int temp=A[i];
			A[i]=divCount[temp];
		}
		
		return A;
		
	}
}
