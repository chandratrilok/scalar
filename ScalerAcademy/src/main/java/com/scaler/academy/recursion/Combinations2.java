package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Combinations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Combinations2 comb = new Combinations2();
		int []A = {10, 1, 2, 7, 6, 1, 5};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:A) {
			list.add(i);
		}
		int B=8;
		ArrayList<ArrayList<Integer>> combinations = comb.combinationSum(list,B);
		System.out.println(combinations);

	}

	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer>A, int B) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> tempList = new ArrayList<>();
		
		int index =0;
		int sum =0;
		Collections.sort(A);
		
		combinationsHelper(A,B,index,tempList,result,sum);

		return result;
		
    }

	private void combinationsHelper(ArrayList<Integer>A,int B, int index, ArrayList<Integer> tempList, ArrayList<ArrayList<Integer>> result,int sum) {
		// TODO Auto-generated method stub
		if(sum==B) {
			result.add(new ArrayList<Integer>(tempList));
			return ;
		}
		
		for(int i=index;i<A.size();i++) {
			int val =A.get(i);
			if(i>index && A.get(i)==A.get(i-1)) 
				continue;
			
			if(sum+val>B) {
				break;
			}
			tempList.add(val);
			combinationsHelper(A,B,i+1,tempList,result,sum+val);
			tempList.remove(tempList.size()-1);
				
		}
	}
}
