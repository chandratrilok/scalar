package com.scaler.academy.array;

public class DivisorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisorGame dg = new DivisorGame();
		int solve = dg.solve(81991, 2549, 7);
		//int solve = dg.solve(52503, 9013, 2254);
		System.out.println(solve);
		

	}
	
	public int solve(int A, int B, int C) {
        long lcm = (B*C)/gcd(B,C);
        if(lcm>A) {
        	return 0;
        }
        int count=1;
        while(lcm<=A) {
        	
            lcm*=(count++);
        }
        return count;
    }
    
    public int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

}
