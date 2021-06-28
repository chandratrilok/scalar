package com.scaler.academy.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CheckExpSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "a-b-(c-d)";
		String	B = "a-b-c-d";
		
	    //String A = "(a+b-c-d+e-f+g+h+i)";
		//String	B = "a+b-c-d+e-f+g+h+i";
		
		//String A = "-(-(-(-a+b)-d+c)-q)";
		//String B = "a-b-d+c+q";
		
		//String A = "-(a+((b-c)-(d+e)))";
		//String B = "-(a+b-c-d-e)";
		
		//String A = "-(a+b+c)";
		//String B = "-a-b-c";
		
	//	String A= "-(a-(-z-(b-(c+t)-x)+l)-q)";
		//String B = "-a+l-b-(z-(c+t)-x-q)";
		CheckExpSame checkExpSame = new CheckExpSame();
		int solve = checkExpSame.solve(A, B);
		System.out.println(solve);
	}

	public int solve(String A, String B) {
		
		List<String> A1= eval(A);
		List<String> B1= eval(B);
		Collections.sort(A1);
		Collections.sort(B1);
		System.out.println(A1+" "+B1);
		if(A1.equals(B1)) {
			return 1;
		}
		
		return 0;
		
    }
	
    static boolean adjSign(String s, int i) {
    	if(i==0) {
    		return true;
    	} 
    	
    	if(s.charAt(i-1)=='-'){
    		return false;
    	}
    	return true;
    }

	public List<String>  eval(String str) {
		Stack<Boolean> stack = new Stack<>();
		stack.push(true);
		
		List<String> list = new ArrayList<String>();
		
		int i=0;
		int n=str.length();
		while(i<n) {
			
			if(str.charAt(i)=='+' || str.charAt(i)=='-') {
				i++;
				continue;
			} 
			
			if(str.charAt(i)=='(') {
				if(adjSign(str, i)) {
					stack.push(stack.peek());
				} else {
					stack.push(!stack.peek());
				}
					
			} else if(str.charAt(i)==')') {
				stack.pop();
			} else {
				if(i>0) {
					if(stack.peek()) {
						if(str.charAt(i-1)=='+' || str.charAt(i-1)=='-') {
							list.add(str.charAt(i-1)+""+str.charAt(i));
						} else {
							list.add("+"+str.charAt(i));

						}
					} else {
						
						if(str.charAt(i-1)=='-') {
							list.add("+"+str.charAt(i));
						} else {
							list.add("-"+str.charAt(i));
						}	
					}
				} else {
					list.add("+"+str.charAt(i));
				}
			}
			
			i++;
		}
		
		return list;
	}
	
}
