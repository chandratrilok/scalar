package com.scaler.academy.dyamin.prog;

public class CoinSumInfinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []A = {1, 2, 3};
		 int B = 4;
		 
		 CoinSumInfinite coinSumInfinite=new CoinSumInfinite();
		 int coinchange2 = coinSumInfinite.coinchange2(A, B);
		 System.out.println(coinchange2);

	}
	
	public int coinchange2(int[] A, int B) {
        int []dp= new int[B];
        dp[0]=1;
        for(int i=0;i<A.length;i++) {
            for(int j=A[i];j<B;j++) {
                dp[j]=(dp[j]+dp[j-A[i]])%1000007;
            }
        }
        return dp[B-1];
    }

}
