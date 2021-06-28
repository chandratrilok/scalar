package com.scaler.academy.recursion;

public class VerticalHorizontalSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 3;
		int [][]B = {  
					{1, 1, 1},
					{1, 1, 1},
					{1, 1, 1},
				  };
		int C = 2;
		VerticalHorizontalSums sums = new VerticalHorizontalSums();
		int solve = sums.solve(A, B, C);
		
		System.out.println(solve);

	}
	
	int [][]grid;
	int allowed;
	public int solve(int A, int[][] B, int C) {
		grid=B;
		allowed=C;
		return rec(A);
	}
	private int rec(int ops) {
		// TODO Auto-generated method stub
		
		if(ops==-1) {
			return 0;
		}
		
		int ret=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				int sum=0;
				for(int k=j;k<grid[0].length;k++) {
					sum+=grid[i][k];
					if(sum>allowed) {
						ret=0;
						for(int l=j;l<=k;l++) {
							grid[i][l]=-grid[i][l];
							ret|=rec(ops-1);
							grid[i][l]=-grid[i][l];
						}

					}
				}
			}
		}
		for(int j=0;j<grid[0].length;j++) {
			for(int i=0;i<grid.length;i++) {
				int sum=0;
				for(int k=i;k<grid.length;k++) {
					sum+=grid[k][j];
					if(sum>allowed) {
						ret=0;
						for(int l=i;l<=k;l++) {
							grid[l][j]=-grid[l][j];
							ret|=rec(ops-1);
							grid[l][j]=-grid[l][j];
						}
					}
				}
			}
		}
		
		
		return ret;
	}

}
