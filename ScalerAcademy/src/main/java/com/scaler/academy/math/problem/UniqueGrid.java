package com.scaler.academy.math.problem;

import java.math.BigInteger;

public class UniqueGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueGrid ug = new UniqueGrid();
		
		int A = 4;
		int B = 3;
		int uniquePaths = ug.uniquePaths(A, B);
		System.out.println(uniquePaths);
		

	}
	
	public int uniquePaths(int A, int B) {
		BigInteger totalSteps = factortial(A+B-2);
		
		BigInteger res = totalSteps.divide(factortial(A-1).multiply(factortial(B-1)));
		return res.intValue();
		
	}
	
	public BigInteger factortial(int m) {
		BigInteger fact = BigInteger.ONE;
		
		for(int i=2;i<=m;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		
		return fact;
		
	}
	
	public int uniquePaths2(int A, int B) {
        
		if(A==1||B==1)
			return 1;
		
		return uniquePaths2(A-1,B)+uniquePaths2(A,B-1);
    }

	public int uniquePaths1(int A, int B) {
        
		int [][]dp = new int[A][B];
		
		for(int i=0;i<dp.length;i++) {
			dp[i][0]=1;
		}
		for(int i=0;i<dp[0].length;i++) {
			dp[0][i]=1;
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[i].length;j++) {
				dp[i][j]= dp[i-1][j]+dp[i][j-1];
			}
		}
		
		
		return dp[A-1][B-1];
    }

}
