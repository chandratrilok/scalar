package com.scaler.academy.problemsolve4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicatesFromSortedArray rem = new RemoveDuplicatesFromSortedArray();
		
		List<Integer> temp = List.of(0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3);
				//List.of(5000, 5000, 5000);
				//
				//List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 );

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(temp);
		int removeDuplicates = rem.removeDuplicates(arr);
		
		System.out.println(removeDuplicates);
		System.out.println(arr);
		

	}
	
	public int removeDuplicates(ArrayList<Integer> a) {
		
		int i=0;
		int j=0;
		for(int k=1;k<a.size();k++) {
			if(!a.get(k).equals(a.get(k-1))) {
				
				j++;

				if(j<=i) {
					a.set(j, a.get(k));
				}
			}
			i++;
			
		}
		
		//a.subList(j+1, a.size()).clear();
		
		return j+1;
	}

}
