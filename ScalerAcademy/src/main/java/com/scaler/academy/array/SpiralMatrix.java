package com.scaler.academy.array;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		SpiralMatrix sm = new SpiralMatrix();
		int [][]A = sm.solution(4);
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}

	private int[][] solution(int max) {
		
		int [][] result = new int[max][max];
		
		int top=0,bottom=max-1, left=0,right=max-1;
		
		int num=1;
		
		while(left<=right&&top<=bottom) {
			
			for(int i=left;i<=right;i++) {
				result[top][i]=num++;
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				result[i][right]=num++;
			}
			right--;
			
			for(int i=right;i>=left;i--) {
				result[bottom][i]=num++;
			}
			bottom--;
			
			for(int i=bottom;i>=top;i--) {
				result[i][left]=num++;
			}
			left++;
		}
		return result;
	}
}
