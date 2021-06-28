package com.scaler.academy.problemsolve4;

public class SumOfSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfSubMatrix ss = new SumOfSubMatrix();
		int [][]A= {{1,1},{1,1}}; 
		int solve = ss.solve(A);
		System.out.println("Solve::"+solve);
	}
	
    public int solve(int[][] A) {
        
        int sum=0;
        int n=A.length;
        int m=A[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
            	int occOfElements = (i+1)*(j+1)*(n-i)*(m-j); 
                sum+=(A[i][j]*occOfElements);
            }
        }
        return sum;
        
    }


}
