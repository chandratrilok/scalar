package com.scaler.academy.search;

public class AthMagicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AthMagicalNumber athMagicalNumber = new AthMagicalNumber();
		int A = 807414236;
		int B = 3788;
		int C = 38141;
		int solve = athMagicalNumber.solve(A, B, C);
		System.out.println(solve);

	}
	
	public int solve(int A, int B, int C) {
		int mod=1000000007;
		long low=1L;
        long high=Long.MAX_VALUE;
        long ans=0L;
        long lcm=(B*C)/gcd(B,C);
        
        while(low<=high) {
            long mid=low+(high-low)/2;
            long count= (mid/B)+(mid/C)-(mid/lcm);
            if(count>=A) {
                ans=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
            
        }
        return (int)(ans%mod);
    } 
	private long gcd(long a,long b) {
        if(a==0) {
            return b;
        }
        return gcd(b%a,a);
    }
    

}
