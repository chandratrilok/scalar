package com.scaler.academy.array;

public class MaxRowOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxRowOne mro = new MaxRowOne();
		int [][]A = {{0,1,1},{0,0,1},{0,1,1}};
		int result = mro.solution(A);
		System.out.println("Result:: "+result);

	}
	
	public int solution(int[][] A) {
		int maxCount=0;
		int ansIndex =0;
		int col = A[0].length-1;
		for(int i=0;i<A.length;i++ ) {
			int innerMaxCount=0;
			for(int j=col;j>=0;j--) {
				if(A[i][j]==1) {
					innerMaxCount++;
				} else {
					break;
				}
			}
			if(innerMaxCount>maxCount) {
				maxCount=innerMaxCount;
				ansIndex=i;
			}
			
		}
		return ansIndex;
	}
	
	/*
	 * int n=A.size(); int ans=0; int row =0,i,j; for (i=0,j=n-1; i<n&&j>0;i++){
	 * while (A[i][j]==1&&j>=0){ row = i; j--; } } return row;
	 */

}
