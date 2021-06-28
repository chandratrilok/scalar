package com.scaler.academy.array.problem;

public class SearchSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]A = {{1, 3, 5, 7},
		          {2, 4, 6, 8}};
		          //{7, 8, 9}};
		int B = 10;
		SearchSortedArray searchSortedArray = new SearchSortedArray();
		int solve = searchSortedArray.solve(A, B);
		System.out.println(solve);

	}
	
	public int solve(int[][] A, int B) {
        int rowSize =A.length;
        int colSize =A[0].length;
        
        int i=0;
        int j=0;
        for(;i<rowSize;i++) {
            int temp=A[i][j];
            if(temp==B) {
                return ((i * 1009) + j);
            } 
            if(temp>B) {
            	break;
            }
        }
        for(;j<colSize;j++) {
            int temp=A[i-1][j];
            if(temp==B) {
                return (i * 1009 + j+1);
            }
        }
        return -1;
	}

}
