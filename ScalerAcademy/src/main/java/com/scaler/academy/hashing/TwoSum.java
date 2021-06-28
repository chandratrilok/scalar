package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ints = { 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };
		
		//int []ints = { 1,1,1};
		
		List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
		TwoSum ts = new TwoSum();
		
		
		
		 ArrayList<Integer> result  = ts.twoSum(list, -3);
		
		System.out.println(result);
	}
	
	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        Map<Integer, Integer> innerMap = new HashMap<>();
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            int rem =(B<0)?B+A.get(i): B-A.get(i);
            
            if(innerMap.containsKey(rem)) {
                result.add(rem);
                result.add(i);
                break;
            }
            
            innerMap.put(A.get(i),i);
        }
        
        return result; 

    }
	
	public int[] twoSum12(final int[] A, int B) {
		int []result = new int[2];
		
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < A.length; i++) {
        	int required = B - A[i];
        	if(map.containsKey(required)) {
        		result[0]=map.get(required);
        		result[1]= i+1;
        		return result;
        	}
        	
        	map.put(A[i],i+1);
        	
        	
        }
        
        
        		
		return result;
    }
	
	public ArrayList<Integer> twoSum1(final List<Integer> A, int B) {
        Map<Integer, Integer> innerMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<A.size();i++) {
            innerMap.put(A.get(i),i+1);
        }
        

        int index1= Integer.MAX_VALUE;
        int index2= Integer.MAX_VALUE;
        Set<Integer> keySet = innerMap.keySet();
        
        for(Integer key:keySet) {
        	
        	
            int temp= B-key;
            if(innerMap.containsKey(temp)) {

            	int mapInd = innerMap.get(temp);
            	int keyInd=innerMap.get(key);
            	if(mapInd<index2&&keyInd<mapInd) {
            		index1=innerMap.get(key);
            		index2=mapInd;
            	}
            }
        }
        
        if(index1!=Integer.MAX_VALUE&&index2!=Integer.MAX_VALUE) {
        	result.add(index1);
        	result.add(index2);
        }
        
        return result; 

    }
        
       
}
