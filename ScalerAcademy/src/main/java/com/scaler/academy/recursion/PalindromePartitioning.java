package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String A = "aab";
			
			PalindromePartitioning palindromePartitioning=new PalindromePartitioning();
			
			ArrayList<ArrayList<String>> partition = palindromePartitioning.partition(A);
			System.out.println(partition);
			
			
			
	}
	
	public ArrayList<ArrayList<String>> partition(String a) {
		
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		Deque<String> current = new LinkedList<String>();		
		partitionHelper(0,current,a,result);
		return result;
	}
	
	
	private void partitionHelper(int i,Deque<String> current,String str,ArrayList<ArrayList<String>> result) {
		if(i==str.length()) {
			result.add(new ArrayList<String>(current));
			return ;
		}
		
		for(int j=i;j<str.length();j++) {
			if(isPalindrom(str,i,j)) {

				current.addLast(str.substring(i,j+1));
				System.out.println(current+" "+i+" "+j);

				partitionHelper(j+1,current,str,result);

				current.removeLast();
				System.out.println(current);

			}
		}
		
	}
	private boolean isPalindrom(String str, int start, int end) {
		
		while(start<end) {
			
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
	}
	
	

}
