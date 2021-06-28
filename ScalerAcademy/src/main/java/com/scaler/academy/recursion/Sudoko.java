package com.scaler.academy.recursion;

import java.util.Arrays;

public class Sudoko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][]A = {{'5','3','.','.','7','.','.','.','.'},
		              {'6','.','.','1','9','5','.','.','.'}, 
		              {'.','9','8','.','.','.','.','6','.'},
		              {'8','.','.','.','6','.','.','.','3'},
		              {'4','.','.','8','.','3','.','.','1'},
		              {'7','.','.','.','2','.','.','.','6'}, 
		              {'.','6','.','.','.','.','2','8','.'},
		              {'.','.','.','4','1','9','.','.','5'},
		              {'.','.','.','.','8','.','.','7','9'}};
		
		Sudoko sudoko = new Sudoko();
		sudoko.solveSudoku(A);
		System.out.println(Arrays.deepToString(A));

	}
	
	public void solveSudoku(char[][] A) {
		solveSudokuUtils(A,0,0);
		
	}
	
	private boolean solveSudokuUtils(char[][] A, int r , int c) {
		
		if(c==9) {
			c=0;
			r++;
		} 
		if(r==9) {
			return true;
		}
		if(A[r][c]!='.') 
			return solveSudokuUtils(A,r,c+1);
		
		for(int po=1;po<=9;po++) {
			char char1=String.valueOf(po).charAt(0);
			if(isValid(A,r,c,char1)) {
				A[r][c]=char1;
				if(solveSudokuUtils(A,r,c+1)) {
					return true;
				}
				A[r][c]='.';
			}
		}
		
		
		return false;
	}

	private boolean isValid(char[][] A, int x, int y, char val) {
		// TODO Auto-generated method stub
		
		for(int j=0;j<A[0].length;j++) {
			if(A[x][j]==val) {
				return false;
			}
		}
		
		for(int i=0;i<A.length;i++) {
			if(A[i][y]==val) {
				return false;
			}
		}
		
		int smi=x/3*3;
		int smj=y/3*3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(A[smi+i][smj+j]==val) {
					return false;
				}
			}
		}
		
		
		return true;
	}

}
