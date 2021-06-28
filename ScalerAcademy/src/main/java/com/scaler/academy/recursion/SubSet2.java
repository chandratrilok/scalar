package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SubSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>(List.of(5,4));
		SubSet2 permutateArray = new SubSet2();
		ArrayList<ArrayList<Integer>> subsets = permutateArray.subsetsWithDup(A);
		System.out.println(subsets);

	}
	
	public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> tempList= new ArrayList<>();
		
		Map<Integer,Integer> map=new TreeMap<>();
		Set<Integer>uniq = new TreeSet<>();

        for(int element:A) {
        	int fre = map.getOrDefault(element, 0);
        	uniq.add(element);
        	map.put(element, ++fre);
        }
        

		subsetsHelper(uniq,result,tempList,map);
		//Collections.sort(result);
		return result;
    }

	private void subsetsHelper(Set<Integer> uniq, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList,
			Map<Integer,Integer> map) {
		// TODO Auto-generated method stub
		Boolean isListSorted = true;
		if(tempList.size()>1) {
			for(int i =1;i<tempList.size();i++) {
				if(tempList.get(i-1)>tempList.get(i)) {
					isListSorted=false;
				}
			}
		}
		if(!isListSorted) {
			return;
		}
		result.add(new ArrayList<Integer>(tempList));
		
		for(int num:uniq) {
	         Integer count = map.get(num);
	        
	         
	         if(count==0) {
	        	continue; 
	         }
	         
	         
	         tempList.add(num);
	         map.put(num, count-1);
	         subsetsHelper(uniq,result,tempList,map);
	         tempList.remove(tempList.size()-1);
	         map.put(num, count);
	         
		 }
		
	}

}
