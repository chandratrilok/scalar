package com.scaler.academy.dyamin.prog;

public class UniquePathInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniquePathInGrid grid=new UniquePathInGrid();
		int [][]A={{0,1}};
		int uniquePathsWithObstacles = grid.uniquePathsWithObstacles(A);
		System.out.println(uniquePathsWithObstacles);

	}
	
	public int uniquePathsWithObstacles(int[][] A) {
        
        int row=A.length;
        int col=A[0].length;
        int [][]dp=new int[row][col];
                
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(A[i][j]==1) {
                    dp[i][j]=0;
                } else {
                	if(i==0 &&j==0) {
                		dp[i][j]=1;
                	}
                	else if(i==0 && j>0) {
                        dp[i][j]=dp[i][j-1];
                    } else if(i>0 && j==0) {
                    	dp[i][j]=dp[i-1][j];
                    }  else {
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                }
            }
        }
        return dp[row-1][col-1];
    }

}
