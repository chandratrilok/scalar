package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveInvalidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String A = "))m))w";
		 RemoveInvalidParentheses parentheses = new RemoveInvalidParentheses();
		 ArrayList<String> solve = parentheses.solve(A);
		 System.out.println(solve);

	}
	
	public ArrayList<String> solve(String A) {
		
		int offleft=0,offright=0;
		
		Set<String> result = new HashSet<String>();
		int[] countSetOff = countSetOff(A,offleft,offright);
		rec(0,A,"",countSetOff[0],countSetOff[1],result,0);
		ArrayList<String> list = new ArrayList<>();
		
		list.addAll(result);
		return list;
		
    }
	
	private void rec(int idx, String str, String curr, int offleft, int offright, Set<String> result, int balance) {
		
		if(idx==str.length()) {

			if(offleft==0 && offright==0) {
				result.add(curr);
			}
		} else if(balance>=0) {
			if(str.charAt(idx)=='(' && offleft>0) {
				rec(idx+1, str, curr, offleft-1, offright, result, balance);
			}
			if(str.charAt(idx)==')' && offright>0) {
				rec(idx+1, str, curr, offleft, offright-1, result, balance);
			}
			
			int diff=0;
			if(str.charAt(idx)==')') {
				diff=-1;
			}
			if(str.charAt(idx)=='(') {
				diff=1;
			}
			rec(idx+1, str, curr+str.charAt(idx), offleft, offright, result, balance+diff);
		}
		
	}

	private int[] countSetOff(String str,int offleft,int offright) {
		
		int []countSetoff=new int[2];
		for(char c:str.toCharArray()) {
			if(c=='(') {
				offleft++;
			}
			if(c==')') {
				if(offleft>0) {
					offleft--;
				} else {
					offright++;
				}
			}
		}
		countSetoff[0]=offleft;
		countSetoff[1]=offright;
		return countSetoff;
	}
	

	
	
	

}
