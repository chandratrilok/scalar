package com.scaler.academy.dyamin.prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class SubTree {
	char c;
	int ind;
	
	public SubTree(char c, int ind) {
		super();
		this.c = c;
		this.ind = ind;
	}

	public char getC() {
		return c;
	}

	public int getInd() {
		return ind;
	}

	@Override
	public String toString() {
		return "SubTree [c=" + c + ", ind=" + ind + "]";
	}
	
	
	
	
}
public class LongestBalancedSubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestBalancedSubTree tree=new LongestBalancedSubTree();
		String A=")[]}(}}}{)[}}[]][]]}}][{)]]}[";
		//String A="[()]";
		int lbSlength = tree.LBSlength(A);
		System.out.println(lbSlength);
		
	}
	
	public int LBSlength(final String A) {
        
        Stack<Integer> stack= new Stack<>();
        stack.push(-1);
        int result=0;
        
        
        for(int i=0;i<A.length();i++) {
        	char ch = A.charAt(i);
        	
            if(ch=='('|| ch=='['||ch=='{') {
                stack.push(i);
            } else {
                
            	
            	if(stack.peek()>-1&&(ch==')' &&  A.charAt(stack.peek())=='('
                						||ch=='}' &&  A.charAt(stack.peek())=='{'
                						||ch==']' &&  A.charAt(stack.peek())=='[')) {
            		stack.pop();
            		result=Math.max(result,i-stack.peek());
                    
                } else {
                    stack.push(i);
                }
            }
        }
        return result;
     
        
    }

}
