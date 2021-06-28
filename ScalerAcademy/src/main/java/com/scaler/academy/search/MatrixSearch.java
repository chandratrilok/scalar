package com.scaler.academy.search;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]A={
		  {3},
		  {29},
		  {36},
		  {63},
		  {67},
		  {72},
		  {74},
		  {78},
		  {85}
		};
		int B=41;
		MatrixSearch matrixSearch=new MatrixSearch();
		int searchMatrix = matrixSearch.searchMatrix(A, B);
		System.out.println(searchMatrix);

	}
	
	public int searchMatrix(int[][] A, int B) {
        
        int row= A.length;
        int col = A[0].length;
        
        int start=0;
        int end=(row*col)-1;
        
        while(start<=end) {
            
            int mid=(start+end)/2;
            int midElement=A[mid/col][mid%col];
            
            if(B==midElement) {
                return 1;
            } else if(B>midElement) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return 0;
    }

}
