package com.scaler.academy.math.problem;

public class VeryLargePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeryLargePower veryLargePower=new VeryLargePower();
		int mod=1000000007;
		 long solve = veryLargePower.solve(2, 4);
		System.out.println(solve);

	}
	
	private long pow(long x,long y, int p) {

		x%=p;
		long res=1;
		
		while(y>0) {
			if(y%2==1) {
				res=(res*x)%p;
			}
			y=y/2;
			x=(x*x)%p;
		}
		return res;
	}
	public int solve(int A, int B) {
        int mod=1000000007;
        long x=fact(B,mod-1);
        x=x%(mod-1);
        return (int)pow(A,x,mod);
       

        
    }
    private long fact(int num,int mod) {
        long fact=1;
    	while(num>1) {
        	fact=(fact*num)%mod;
        	num--;
        }
    	return fact;
    } 

}
