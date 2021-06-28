package com.scaler.academy.bit.manipulation;

public class TotalCountBit {

	public static void main(String[] args) {
		int A =20;
		TotalCountBit tc = new TotalCountBit();
		int solve = tc.solve(A);
		System.out.println(solve);
	}
	
	public int solve(int A) {
		
		if(A==0)return 0;
		long ans=0,p=0;
		
		
		while(Math.pow(2, p)<=A)p++;
		p--;
		
		double val = Math.pow(2, p);
		
		ans+=((p*val/2)+(A-val+1)+solve(A-(int)val));
		ans%=1000000007;
		return (int)ans;
    }
}
