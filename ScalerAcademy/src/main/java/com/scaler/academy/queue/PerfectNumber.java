package com.scaler.academy.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerfectNumber perfectNumber = new PerfectNumber();
		int[] solve = perfectNumber.solve(7);
		System.out.println(Arrays.toString(solve));

	}
	
	public int[] solve(int A) {
        
		int []result = new int[A];
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		int count =3;
		
		int i=0;
		while(count<A) {
			
			
			Integer poll = queue.poll();
			queue.add(poll*10+1);
			queue.add(poll*10+2);
			queue.add(poll*10+3);
			result[i]=poll;
			i++;
			count+=3;
		}
		
		while(!queue.isEmpty() && i<A) {
			result[i]=queue.poll();
			i++;
		}
		
		return result;
		
        
    }

	

}
