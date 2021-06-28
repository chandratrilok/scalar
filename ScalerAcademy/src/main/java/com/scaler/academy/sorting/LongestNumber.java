package com.scaler.academy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestNumber longestNumber = new LongestNumber();
		
		//int []A= {3, 30, 34, 5, 9};
		//int []A= {472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412};
		
		int []A = { 0, 0, 0, 0, 0 };
		
		List<Integer> list = (ArrayList<Integer>)Arrays.stream(A).boxed().collect(Collectors.toList());
		String largestNumber = longestNumber.largestNumber(list);
		
		
		System.out.println(largestNumber);
		
		

	}
	
	public String largestNumber(final List<Integer> A) {
		
		String returnStr= A.stream().map(Object::toString).sorted((a,b)->{	
			String o1=a+b;
			String o2=b+a;
			return o2.compareTo(o1);
		}).collect(Collectors.joining(""));
		
		if(returnStr.startsWith("0")) {
			return "0";
		}
		
		return returnStr;
		
		
	}
	
	
	
	

}
