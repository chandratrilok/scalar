package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeafNodeFromPreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeafNodeFromPreOrder order = new LeafNodeFromPreOrder();
		
		ArrayList<Integer> solve = order.solve(List.of(20,15,3,27));
		System.out.println(solve);
		

	}
	
    public ArrayList<Integer> solve(List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n=A.size();
        for(int i=0,j=1;j<n;i++,j++) {
            
            boolean found=false;
            if(A.get(i)>A.get(j)) {
                stack.push(A.get(i));
            } else {
                while(!stack.isEmpty()) {
                    if(A.get(j)>stack.peek()) {
                        stack.pop();
                        found=true;
                    }
                    
                    else
                        break;
                }
            }
            
            if(found)
                result.add(A.get(i));
                
        }
        result.add(A.get(n-1));
        return result;
    }


}
