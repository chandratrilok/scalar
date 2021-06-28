package com.scaler.academy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSpiralMatrix {
	
	public static void main(String[] args) {
		
		int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		PrintSpiralMatrix printSpiralMatrix = new PrintSpiralMatrix();
		List<Integer> result = printSpiralMatrix.printSpiralMatrix(matrix);
		
		System.out.println(result);
	}
	
	public List<Integer> printSpiralMatrix(int[][] arr) {
		
		List<Integer> result = new ArrayList<Integer>();
		
		int left =0;
		int right=arr[0].length-1;
		int top=0;
		int bottom=arr.length-1;
		
		while(left<=right && top<=bottom) {
			
			for(int i=left;i<=right;i++) {
				result.add(arr[top][i]);
			}
			
			top++;
			
			for(int i=top;i<=bottom;i++) {
				result.add(arr[i][right]);
			}
			right--;
			if(left<=right && top<=bottom) {
				for(int i=right;i>=left;i--) {
					result.add(arr[bottom][i]);
				}
				bottom--;
				
				for(int i=bottom;i>=top;i--) {
					result.add(arr[i][left]);
				}
				left++;
			}
		}
		
		return result;
		
	}

}
