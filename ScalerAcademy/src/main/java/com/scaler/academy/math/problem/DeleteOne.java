package com.scaler.academy.math.problem;

public class DeleteOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteOne deleteOne=new DeleteOne();
		int []A={7,21};
		int gcd = deleteOne.solve(A);
		System.out.println(gcd);
	}
	
	public int solve(int[] A) {
		
		int n=A.length;
		if(n==1) {
			return A[0];
		} 
		if(n==2) {
			return Math.max(A[0], A[1]);
		}
		int []gcdSuffix=new int[n];
		gcdSuffix[n-1]=A[n-1];
		for(int i=n-2;i>=0;i--) {
			gcdSuffix[i]=gcd(A[i],gcdSuffix[i+1]);
		}
		int []gcdPrefix=new int[n];
		gcdPrefix[0]=A[0];
		for(int i=1;i<n;i++) {
			gcdPrefix[i]=gcd(gcdPrefix[i-1],A[i]);
		}
		
		int maxGcd=gcdSuffix[0];
        
		for(int i=1;i<n;i++) {
        	if(i==n-1) {
				maxGcd=Math.max(maxGcd,gcdPrefix[n-1]);
				continue;
			}
        	int gcd=gcd(gcdPrefix[i-1],gcdSuffix[i+1]);
        	maxGcd=Math.max(maxGcd, gcd);
        }
		
        return maxGcd;
    }
	private int gcd(int a,int b) {
        if(a==0) {
            return b;
        } 
        return gcd(b%a,a);
    }
}
