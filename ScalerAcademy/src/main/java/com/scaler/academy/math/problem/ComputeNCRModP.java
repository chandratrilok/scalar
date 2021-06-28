package com.scaler.academy.math.problem;

public class ComputeNCRModP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputeNCRModP computeNCRModP=new ComputeNCRModP();
		int solve = computeNCRModP.solve(26, 18, 367);
		System.out.println(solve);

	}
	
	public int solve(int A, int B, int C) {
		
		if(B==0) {
			return 1;
		}
		
		long[] factorial = new long[A+1];
        factorial[0] = 1;
        for(int i=1;i<=A;i++){
            factorial[i] = (factorial[i-1]* i)%C;
        }
		long powB=modInverse(factorial[B], C);
		long powDiff=modInverse(factorial[A-B], C);
		
		return (int)((factorial[A]%C*powB%C*powDiff%C)%C);
		
		
    }
	
	private long modInverse(long a,long c) {
		return pow(a,c-2,c);
	}
	
	private long pow(long x, long y, long m) {
		// TODO Auto-generated method stub
		
		if(y==0) {
			return 1;
		}
		
		long p=pow(x, y/2, m)%m;
		p=(p*p)%m;
		return (y%2==0)?p:(x*p)%m;
		
	}

	private long fact(int n) {
		if(n<1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
