package com.scaler.academy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinimizeDifference {

	public static void main(String[] args) {
		//// TODO Auto-generated method stub
		int[] A = {4, 6, 3, 1, 4};
		int B = 5;
		//Integer[] A = {2, 6, 3, 9, 8};
		//int B = 3;
		//Integer[] A = {4, 6, 3, 1, 4};
		//int B = 5;
		//Integer[] A = {1, 1, 7};
		//int B = 7;
		
		//Integer[] A = {2, 6, 7, 5, 2};
		//int B = 6;
		
		//Integer[] A = {5, 1, 7};
		//int B = 7;
		
		
		
		
		
		MinimizeDifference minDiff = new MinimizeDifference();
		int solve = minDiff.solve(A, B);
		
		System.out.println(solve);
	}
	
    public int solve(int[] A, int B) {
        
        int result=0;
		
		Map<Integer, Integer> map = new HashMap<>();
		int min=Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(Integer i:A) {
			max = Math.max(max, i);
			min = Math.min(min, i);
			int freq = map.getOrDefault(i, 0)+1;
			
			map.put(i,freq);
		}
		
		while((min<max) && B!=0){
			int freqMin = map.get(min);
			int freqMax = map.get(max);
			if(freqMin<=freqMax) {
				
				if(B<freqMin) {
					break;
				}
				
				map.remove(min);
				B-=freqMin;

				min++;
				int tempFreq= map.getOrDefault(min, 0)+freqMin;
				map.put(min,tempFreq);

				
			} else {
				
				if(B<freqMax) {
					break;
				}
				
				map.remove(max);
				B-=freqMax;
				max--;
				int tempFreq= map.getOrDefault(max, 0)+freqMax;
				map.put(max,tempFreq);

				
			}
		}
		result= Math.abs(max-min);
		return result;
    }

}
