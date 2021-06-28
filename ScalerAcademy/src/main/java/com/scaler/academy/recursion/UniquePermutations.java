package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UniquePermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePermutations uniq = new UniquePermutations();
		List<Integer> A = List.of(1, 1, 2);
		ArrayList<ArrayList<Integer>> result = uniq.permute(A);
		System.out.println(result);
		
	}
	
		public ArrayList<ArrayList<Integer>> permute(List<Integer> A) {
	        
	        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        ArrayList<Integer> resultList = new ArrayList<Integer>();
	        
	        Map<Integer,Integer> map=new TreeMap<>();

	        for(int element:A) {
	        	int fre = map.getOrDefault(element, 0);
	        	map.put(element, ++fre);
	        }
	        
			permuteHelper(result,resultList,A.size(),map);
	
	        return result;
	    }
		
		private void permuteHelper(ArrayList<ArrayList<Integer>> result, List<Integer> resultList,int size,Map<Integer,Integer> map){
			 
			 if(resultList.size()==size) {
				 result.add(new ArrayList<Integer>(resultList));
				 return;
			 } 
			 
			 for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
				 Integer num = entry.getKey();
		         Integer count = entry.getValue();
		         
		         if(count==0) {
		        	continue; 
		         }
		         resultList.add(num);
		         map.put(num, count-1);
		         permuteHelper(result,resultList,size,map);
		         resultList.remove(resultList.size()-1);
		         map.put(num, count);
		         
			 }
		 }

	private void helper(List<Integer> A,List<Integer> permutation,List<Boolean> bool,Map<Integer, Integer> map,List<List<Integer>> result) {
		// TODO Auto-generated method stub
	
		if(permutation.size()==A.size()) {
			result.add(new ArrayList<Integer>(permutation));
			return;
		}
		
		for(int i=0;i<A.size();i++) {
			if(bool.get(i)) {
				continue;
			}
			bool.add(i,true);
			map.get(A.get(i));
		}	
		
		
	}

}
