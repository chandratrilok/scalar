package com.scaler.academy.dyamin.prog;

public class WayToDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  A = "12";
		WayToDecode way= new WayToDecode();
		int numDecodings = way.numDecodings(A);
		System.out.println(numDecodings);

	}

	public int numDecodings(String A) {
		
		int mod=1000000007;
		
		if(A.isEmpty()) {
			return 0;
		}
		if(A.charAt(0)=='0') {
			return 0;
		}
		
		int n=A.length();
		int []dp= new int[n+1];
		
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			if(A.charAt(i-1)>'0') {
				dp[i]=dp[i-1]%mod;
			}
			
			if(A.charAt(i-2)=='1'||(A.charAt(i-2)=='2' && A.charAt(i-1)<'7')) {
				dp[i]+=dp[i-2]%mod;
			} 
		}
		
		return dp[n];
    
	}
}
