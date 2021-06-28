package com.scaler.academy.stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumFreqStack {
	
	public static void main(String[] args) {
		int [][]A = {
	            {1, 5},
	            {1, 7},
	            {1, 5},
	            {1, 7},
	            {1, 4},
	            {1, 5},
	            {2, 0},
	            {2, 0},
	            {2, 0},
	            {2, 0}};
		
		
		MaximumFreqStack stack = new MaximumFreqStack();
		int[] solve = stack.solve(A);
		System.out.println(Arrays.toString(solve));
		
	}
	
	public int[] solve(int[][] A) {
		int []result=new int[A.length];
		Map<Integer,Integer> freMap = new HashMap<>(); 
		Map<Integer,Stack<Integer>> stackMap = new HashMap<>(); 
		
		
		
		for(int i=0;i<A.length;i++) {
			if(A[i][0]==1) {
				int num = A[i][1];

				Integer count = freMap.getOrDefault(num, 0);
				freMap.put(num, ++count);
				
				Stack<Integer> stack =stackMap.getOrDefault(count,new Stack<Integer>());
				
				stack.push(num);
				stackMap.putIfAbsent(count, stack);
				result[i]=-1;
				
			} else {
				
				Integer highestFreq = Collections.max(stackMap.keySet(), new Comparator<Integer>() {
				    @Override
				    public int compare(Integer o1, Integer o2) {
				        return Integer.compare(o1, o2);
				    }
				} );

				Stack<Integer> stack = stackMap.get(highestFreq);
				Integer num = stack.pop();
				result[i]=num;
				Integer freq = freMap.get(num);
				if(stack.isEmpty()) {
					stackMap.remove(freq);
				}
				freMap.put(num,--freq);
				if(freq<=0) {
					freMap.remove(num);
				}
				
			}
			
		}
		
		
		
		return result;
        
    }

}
