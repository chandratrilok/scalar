package com.scaler.academy.array;

public class PascalTringle {
	
	public static void main(String[] args) {
		
		PascalTringle pascalTringle = new PascalTringle();
		int [][]A = pascalTringle.solution(5);
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}

	private int[][] solution(int max) {
		
		int [][] result = new int[max][];
		
		for(int i=0;i<max;i++) {
		    int [] inner = new int[i+1];
			for(int j=0;j<=i;j++) {
				
				if(j==0||i==j) {
					inner[j]=1;
				} else {
					int [] subArray = result[i-1];
					inner[j]=subArray[j]+subArray[j-1];
				}
				
			}
			result[i] = inner;

		}
		return result;
		
	}
}
