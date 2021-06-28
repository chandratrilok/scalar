package com.scaler.academy.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonRepeatingChar nonRepeatingChar = new NonRepeatingChar();
		String A="abcabc";
		String solve = nonRepeatingChar.solve(A);
		System.out.println(solve);
	}

	 public String solve(String A) {
	     Map<Character,Integer> map = new HashMap<>();
	     Queue<Character> queue = new LinkedList<Character>();
	     
	     String ans="";
	     for(char c:A.toCharArray()) {
	    	 
	    	 Integer freq = map.getOrDefault(c, 0);
	    	 map.put(c, ++freq);
	    	 queue.add(c);
	    	 
	    	 while(!queue.isEmpty()&&map.get(queue.peek())>1) {
	    		 queue.poll();
	    	 }
	    	 if(!queue.isEmpty()) {
	    		 ans+=queue.peek();
	    	 } else {
	    		 ans+="#";
	    	 }
	     }
	     return ans;
	 }
}
