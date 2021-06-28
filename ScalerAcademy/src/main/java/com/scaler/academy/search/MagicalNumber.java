package com.scaler.academy.search;

public class MagicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MagicalNumber magicalNumber=new MagicalNumber();
		
		int solve = magicalNumber.solve(807414236, 3788, 38141);
		System.out.println(solve);
	}
	
	public int solve(int A, int B, int C) {
		int mod=1000000007;
        long low=1;
        long high=Integer.MAX_VALUE;
        long ans=0;
        long lcm=((long)(B%mod*C%mod))/gcd(B,C);
        
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
