package com.scaler.academy.stack2;

import java.util.Stack;

public class DoubleCharacterTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solve(String A) {
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<A.length();i++) {
           char c= A.charAt(i);
           if(stack.isEmpty()){
               stack.push(c);
               continue;
           }
            if(stack.peek()==c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()) {
            str.append(stack.pop());
        }
        
        return str.reverse().toString();
    }

}
