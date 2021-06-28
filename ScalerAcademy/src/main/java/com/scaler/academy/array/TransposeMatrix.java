package com.scaler.academy.array;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [][]A = {{1,2,3},{4,5,6},{7,8,9}};
		int [][]A = {{1,2},{3,4}};
		TransposeMatrix tm = new TransposeMatrix();
		
		tm.solution(A);
		

	}

	private void solution(int[][] A) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<A.length;i++) {
			for(int j=i;j<A.length;j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}
		
		int left = 0;
		int right	= A.length-1;
		
		while(left<right) {
			for(int k=0;k<A.length;k++) {
				int temp = A[k][left];
				A[k][left] = A[k][right];
				A[k][right]=temp;
			}
			left++;
			right--;
		}
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				System.out.print(A[i][j]+", ");
			}
			System.out.println();
		}	
		
	}
	

}
