package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> A = List.of(1,2,3);
		PermutateArray permutateArray = new PermutateArray();
		ArrayList<ArrayList<Integer>> permute = permutateArray.permute(A);
		System.out.println(permute);
		

	}
	
	public ArrayList<ArrayList<Integer>> permute(List<Integer> A) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		List<Integer> resultList = new ArrayList<Integer>();
		permuteHelper(result,resultList,A);
		return result;
    }

	 private void permuteHelper(ArrayList<ArrayList<Integer>> list, List<Integer> resultList, List<Integer> A){
		 
		 if(resultList.size()==A.size()) {
			 list.add(new ArrayList<Integer>(resultList));
		 } else {
			 for(int i = 0; i < A.size(); i++){ 
				 if(resultList.contains(A.get(i))) {
					 continue;
				 }
				 resultList.add(A.get(i));
				 permuteHelper(list,resultList,A);
				 resultList.remove(resultList.size() - 1);
				 
			 }
		 }
	 }
}
