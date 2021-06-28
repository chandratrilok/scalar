package com.scaler.academy.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerfectNumber2 perfectNumber = new PerfectNumber2();
		String solve = perfectNumber.solve(3);
		System.out.println(solve);

	}
	
	public String solve(int A) {
        
		Deque<Long> queue = new LinkedList<>();

		
		queue.add((long)1);
		queue.add((long)2);
		
		long count =2;
		

		while(count<A) {
			Long poll = queue.poll();
			queue.add(poll*10+1);
			queue.add(poll*10+2);
			count+=2;
		}
		
		while(count>A) {
			queue.removeLast();
			count--;
		}
		
		Long num = queue.removeLast();
		Long rev = (long)0;
		Long temp =num;
		
		while(temp>0) {
			
			rev=rev*10+temp%10;
			
			temp=temp/10;
		}
		
		return String.valueOf(num)+String.valueOf(rev);
        
        
    }

	

}
