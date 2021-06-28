package com.scaler.academy.stack2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {
	
	/*
	^ has highest precedence.
	/ and * have equal precedence but greater than + and -.
	+ and - have equal precedence and lowest precedence among given operators.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "a+b*(c^d-e)^(f+g*h)-i";//"x^y/(a*z)+b";
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		String solve = infixToPostfix.solve(A);
		System.out.println(solve);
		
	}
	
	public String solve(String A) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		map.put('^', 3);
		map.put('/', 2);
		map.put('*', 2);
		map.put('+', 1);
		map.put('-', 1);
		
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<A.length();i++) {
			char c= A.charAt(i);
			if(c=='(') {
				stack.push(c);
				continue;
			}
			if(c==')') {
				while(!stack.isEmpty()) {
					if(stack.peek()=='(') {
						stack.pop();
						break;
					} else {
						sb.append(stack.pop());
					}
				}
			} else if(map.containsKey(c)) {
				while(!stack.isEmpty() && stack.peek()!='(') {
					if(map.get(stack.peek())>=map.get(c)) {
						sb.append(stack.pop());
					} else {
						break;
					}
				}
				stack.push(c);

			} else {
				sb.append(c);
			}
			
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		
		return sb.toString();
	}
	
	

}
