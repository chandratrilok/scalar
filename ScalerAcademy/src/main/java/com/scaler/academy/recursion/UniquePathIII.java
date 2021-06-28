package com.scaler.academy.recursion;

public class UniquePathIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]A =    {
						{1, 0, 0, 0},
						{0, 0, 0, 0},
						{0, 0, 2, -1}
						};
		
		UniquePathIII paths = new UniquePathIII();
		int solve = paths.solve(A);
		System.out.println(solve);

	}
	
	int ans=0;
	public int solve(int[][] A) {
		
		int n =A.length;
		int m=A[0].length;
		
		int u=-1,v=-1,count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(A[i][j]==1) {
					u=i;
					v=j;
				}
				
				if(A[i][j]==0) {
					count++;
				}
			}
		}
		
		return dfs(A,u,v,count);
		

	}
	
	private int dfs(int[][] A, int u, int v, int count) {
		// TODO Auto-generated method stub
		
		if(u<0||v<0||u>=A.length||v>=A[0].length||A[u][v]==-1) {
			return 0;
		}
		if(A[u][v]==2) {
			return count==-1?1:0;
		}
		A[u][v]=-1;
		count--;
		
		int totalCount=dfs(A,u+1,v,count)+
						dfs(A,u,v+1,count)+
						dfs(A,u-1,v,count)+
						dfs(A,u,v-1,count);
		A[u][v]=0;
		count++;
						
		return totalCount;
		
	}

}
