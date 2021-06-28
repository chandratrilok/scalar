package com.scaler.academy.dyamin.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinSumPathInTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [][]A = { 
	         {2},
	         {3, 4},
	         {6, 5, 7},
	         {4, 1, 8, 3}
	         };
		
		
		List<List<Integer>> list = Arrays.stream(A)
                .map(Arrays::asList)
                .collect(Collectors.toList());
		
		MinSumPathInTringle triangle = new MinSumPathInTringle();
		
		int minimumTotal = triangle.minimumTotal(list);
		System.out.println(minimumTotal);

	}
	
	public int minimumTotal(List<List<Integer>> a) {
	    
	    
	    int n=a.size();

	    for(int i=n-2;i>=0;i--) {
	        int m=a.get(i).size();
	        for(int j=0;j<m;j++) {
	            int sum=Math.min(a.get(i+1).get(j),a.get(i+1).get(j+1))+a.get(i).get(j);
	            a.get(i).set(j,sum);
	        }
	    }
	    
	    return a.get(0).get(0);    
	}

}
