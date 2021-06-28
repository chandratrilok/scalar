package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []intsA = {2, 1, 4, 10};
		int []intsB = {3, 6, 2, 10, 10};
		//int []intsA = {1, 2, 2, 1};
		//int []intsB = {2, 3, 1, 2};

		
		ArrayList<Integer> listA = (ArrayList<Integer>)Arrays.stream(intsA).boxed().collect(Collectors.toList());
		ArrayList<Integer> listB = (ArrayList<Integer>)Arrays.stream(intsB).boxed().collect(Collectors.toList());
		CommonElements ts = new CommonElements();
		
		
		
		ArrayList<Integer> returnArray = ts.solve(listA, listB);
		
		System.out.println(returnArray);

	}
	
	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		
		/*
		 * Collections.sort(A); Collections.sort(B);
		 * 
		 * int countA = A.size()-1; int countB = B.size()-1;
		 * 
		 * while(countA>=0 && countB>=0) {
		 * 
		 * Integer valA = A.get(countA); Integer valB = B.get(countB);
		 * 
		 * 
		 * 
		 * }
		 */
        
		
		  Map<Integer,Integer> innerMapA = populate(A); 
		  ArrayList<Integer> result = new ArrayList<>();

		  
		  for(Integer valB: B) {
			  if(innerMapA.containsKey(valB)) {
				  Integer count = innerMapA.get(valB);
				  if(count>0) {
					  result.add(valB);
				  } 
				  innerMapA.put(valB,--count);
			  }
		  }
		  
		  Collections.sort(result);
		  
			/*
			 * Set<Integer>
			 * keys=(innerMapA.size()<innerMapB.size())?innerMapA.keySet():innerMapB.keySet(
			 * );
			 * 
			 * for(Integer key:keys) {
			 * 
			 * if(innerMapA.containsKey(key)&&innerMapB.containsKey(key)) { Integer count =
			 * (innerMapA.get(key)<=innerMapB.get(key))?innerMapA.get(key):innerMapB.get(key
			 * );
			 * 
			 * int tempCount=1;
			 * 
			 * while(tempCount<=count) { result.add(key); tempCount++;
			 * 
			 * }
			 * 
			 * } }
			 */		 
          return result;
        
    }

	public Map<Integer,Integer> populate(ArrayList<Integer> list) { 
		
		 Map<Integer,Integer> map = new HashMap<>();
	     int size = list.size()-1;
		 
	     while(size>=0) {
	    	Integer val = list.get(size);
	    	Integer count = (map.get(val)==null)?0:map.get(val);
	    	map.put(val,++count);
	    	size--;
	     }
	     
	     return map;
		
	}
	
}
