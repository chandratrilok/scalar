package com.scaler.academy.dyamin.prog;

public class MinPathMatrix {
	
	public static void main(String[] args) {
		
		 int [][]A = {
		       {1, 3, 2},
		       {4, 3, 1},
		       {5, 6, 1}
		 };
		 
		 MinPathMatrix path = new MinPathMatrix();
		 int minPathSum = path.minPathSum(A);
		 System.out.println(minPathSum);
	}

	public int minPathSum(int[][] A) {
        
        int row=A.length;
        int col=A[0].length;
        
        int [][]dp=new int[row][col];
        
        for(int i=row-1;i>=0;i--) {
            for(int j=col-1;j>=0;j--) {
                
                if(i==row-1 && j==col-1) {
                    dp[i][j]=A[i][j];
                } else if(i==row-1) {
                    dp[i][j]=dp[i][j+1]+A[i][j];
                } else if(j==col-1) {
                    dp[i][j]=dp[i+1][j]+A[i][j];
                } else {
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+A[i][j];
                }
            }
        }
        return dp[0][0];
    }
}
