package com.scaler.academy.recursion;

import java.util.ArrayList;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Combinations comb = new Combinations();
		ArrayList<ArrayList<Integer>> combinations = comb.combine(4,2);
		System.out.println(combinations);

	}

	public ArrayList<ArrayList<Integer>> combine(int A, int B) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> tempList = new ArrayList<>();
		
		int index =1;
		combinationsHelper(A,B,index,tempList,result);
		return result;
		
    }

	private void combinationsHelper(int A,int B, int index, ArrayList<Integer> tempList, ArrayList<ArrayList<Integer>> result) {
		// TODO Auto-generated method stub
		if(tempList.size()==B) {
			result.add(new ArrayList<Integer>(tempList));
			return ;
		}
		
		for(int i=index;i<=A;i++) {
			tempList.add(i);
			combinationsHelper(A,B,i+1,tempList,result);
			tempList.remove(tempList.size()-1);
		}
		
	}
}
