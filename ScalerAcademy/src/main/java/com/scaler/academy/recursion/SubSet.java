package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>(List.of(1,2,3));
		SubSet permutateArray = new SubSet();
		ArrayList<ArrayList<Integer>> subsets = permutateArray.subsets(A);
		System.out.println(subsets);

	}
	
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> tempList= new ArrayList<>();
		int start=0;
		Collections.sort(A);

		subsetsHelper(A,result,tempList,start);
		return result;
    }

	private void subsetsHelper(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList,
			int start) {
		// TODO Auto-generated method stub
		result.add(new ArrayList<Integer>(tempList));
		
		for(int i=start;i<A.size();i++) {
			tempList.add(A.get(i));
			subsetsHelper(A,result,tempList,i+1);
			tempList.remove(tempList.size()-1);
			
		}
		
	}

}
