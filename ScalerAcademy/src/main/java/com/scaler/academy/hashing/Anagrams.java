package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				 
		List<String> list = new ArrayList<>();		 
		 list.add("cat");
		 list.add("dog");
		 list.add("god");
		 list.add("tca");

		 Anagrams a = new Anagrams();
		 ArrayList<ArrayList<Integer>> anagrams = a.anagrams(list);
		 
		 System.out.println(anagrams);
	}
	
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        Map<String, ArrayList<Integer>> innerMap = new HashMap<>();
        
        for(int i=0;i<A.size();i++) {
            char tempArray[] = A.get(i).toCharArray(); 
              
            // sort tempArray 
            Arrays.sort(tempArray); 
              
            // return new sorted string 
            String sortedStr = new String(tempArray); 
            
            ArrayList<Integer> list = innerMap.get(sortedStr);
            if(list==null) {
                list = new ArrayList<Integer>();
            } 
            list.add(i+1);
            innerMap.put(sortedStr, list);
        }
        
        for(String str: innerMap.keySet()) {
            ArrayList<Integer> list = innerMap.get(str);
            result.add(list);
        }
        return result;
    }

}
