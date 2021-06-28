package com.scaler.academy.dyamin.prog;

import java.util.ArrayList;

public class NDigit {

	
	int mod=1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NDigit nDigit = new NDigit();
		int solve = nDigit.solve(84, 82);
		
		System.out.println(solve);
		
		

	}
	
	public int solve(int A, int B) {
    
		int ans=0;
		int [][]dp = new int[A][B];
		
		for(int i=0;i<A;i++) {
			for(int j=0;j<B;j++) {
				dp[i][j]=-1;
			}
		}
		
		for(int i=1;i<10;i++) {
			ans+=rec(dp,A-1,B-i);
			ans%=mod;
		}
		return ans;
	}

	private int rec(int [][]dp, int id, int sum) {
		// TODO Auto-generated method stub
		
		if(sum<0) {
			return 0;
		}	
		if(id==0 && sum==0) {
			return 1;
		}
		if(id==0) {
			return 0;
		}
		
		int ans=0;

		if(dp[id][sum]!=-1) {
		
			return dp[id][sum];
		}
		
		
		for(int i=0;i<10;i++) {
			ans+=rec(dp,id-1,sum-i);
			ans%=mod;
		}
		dp[id][sum]=ans;

		return ans;
		
	}
	
	

}
