package com.scaler.academy.sorting2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber {
	
	public static void main(String[] args) {
		int [] A= {3, 30, 34, 5, 9};
		LargestNumber l = new LargestNumber();
		String largestNumber = l.largestNumber(A);
		System.out.println(largestNumber);
		
	}
	
	public String largestNumber(final int[] A) {
        
		List<Integer> collect = Arrays.stream(A).boxed().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1,Integer i2) {
                String str1=Integer.toString(i1)+Integer.toString(i2);
                String str2=Integer.toString(i2)+Integer.toString(i1);
                return str2.compareTo(str1);
            }  
    }).collect(Collectors.toList());
		
		String str="";
		for(Integer i:collect) {
			str+=i;
		}
		
		return str;
    }

}
