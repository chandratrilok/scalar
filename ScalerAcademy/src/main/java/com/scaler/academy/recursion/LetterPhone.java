package com.scaler.academy.recursion;

import java.util.ArrayList;

public class LetterPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LetterPhone letterPhone = new LetterPhone();
		ArrayList<String> letterCombinations = letterPhone.letterCombinations("23");
		System.out.println(letterCombinations);

	}

	public ArrayList<String> letterCombinations(String A) {
		
		ArrayList<String> result = new ArrayList<>();
		
		String []letterMap = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int index =0;
		String currStr="";
		letterCombinationsHelper(A,letterMap,currStr,index,result);
		return result;
		
    }

	private void letterCombinationsHelper(String A, String[] letterMap, String currStr, int index,ArrayList<String> result) {
		// TODO Auto-generated method stub
		if(A.length()==currStr.length()) {
			result.add(currStr);
			return ;
		}
		
		int digit = Character.getNumericValue(A.charAt(index));
		String letter = letterMap[digit];
		
		for(char c:letter.toCharArray()) {
			letterCombinationsHelper(A,letterMap,currStr+c,index+1,result);
		}
		
	}
}
