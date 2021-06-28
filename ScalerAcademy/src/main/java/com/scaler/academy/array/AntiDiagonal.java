package com.scaler.academy.array;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonal {
	
	public static void main(String[] args) {
		
		AntiDiagonal antiDiagonal = new AntiDiagonal();
		
		int [][]A = {{1,2,3},{4,5,6},{7,8,9}};
		
		ArrayList<ArrayList<Integer>> array = new ArrayList<>();
		
		ArrayList<Integer> innerArray1 = new ArrayList<Integer>();
		innerArray1.add(1);
		innerArray1.add(2);
		innerArray1.add(3);
		array.add(innerArray1);
		ArrayList<Integer> innerArray2 = new ArrayList<Integer>();
		innerArray2.add(4);
		innerArray2.add(5);
		innerArray2.add(6);
		array.add(innerArray2);
		ArrayList<Integer> innerArray3 = new ArrayList<Integer>();
		innerArray3.add(7);
		innerArray3.add(8);
		innerArray3.add(9);
		array.add(innerArray3);
		
		ArrayList<ArrayList<Integer>> result = antiDiagonal.solution(array);
		
		for(ArrayList<Integer> temp:result) {
			for(Integer i: temp) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	private ArrayList<ArrayList<Integer>> solution(ArrayList<ArrayList<Integer>> A) {
		
		/*
		 * for(int i=0;i<A.length;i++) { for(int j=i;j<A.length;j++) { int temp =
		 * A[i][j]; A[i][j] = A[j][i]; A[j][i] = temp; } }
		 */
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n=A.size();
		for(int i=0;i<n;i++) {
			int col=i,row=0;
			ArrayList<Integer> inner= new ArrayList<>();

			
			while(col>=0) {
				inner.add(A.get(row).get(col));
				row++;
				col--;
			}
			result.add(inner);
		}
		
		
		  for(int i=1;i<n;i++) { 
			  int row=i,col=n-1; 
			  ArrayList<Integer> inner= new ArrayList<>();
			  while(row<n) { 
				  inner.add(A.get(row).get(col));
				  row++; 
				  col--;
	
			  }
			result.add(inner);
		  }
		return result;

	}
		 
		
}	
