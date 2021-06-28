package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int []A= {6,1,3,2};
		TreeNode node = TreeNode.populateInOrder(A);
		
		InorderTraversal inorderTraversal=new InorderTraversal();
		int maxHight = inorderTraversal.solve(node);
		System.out.println(maxHight);
		
	}
	
	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		
		if(A==null) {
			return null;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		Stack<TreeNode> stack = new Stack<>();
		while(A!=null||!stack.isEmpty()) {
			if(A!=null) {
				stack.push(A);
				A=A.left;
			} else {
				A=stack.pop();
				list.add(A.val);
				A=A.right;
				
			}
			
		}
		return list;
	}
	
	public ArrayList<Integer> preorderTraversal(TreeNode A) {
		if(A==null) {
			return null;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(A);
		while(!stack.isEmpty()) {
			A=stack.pop();
			list.add(A.val);
			if(A.right!=null) {
				stack.push(A.right);
			}
			if(A.left!=null) {
				stack.push(A.left);
			}
			
		}
		return list;	
	}
	
	public ArrayList<Integer> postorderTraversal(TreeNode A) {
		if(A==null) {
			return null;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		
		stack1.push(A);
		
		while(!stack1.isEmpty()) {

			TreeNode temp = stack1.pop();
			stack2.push(temp);
			
			if(temp.left!=null) {
				stack1.push(temp.left);
			}  
			if(temp.right!=null) {
				stack1.push(temp.right);
			} 
			
		}
		while(!stack2.isEmpty()) {
			TreeNode temp = stack2.pop();
			list.add(temp.val);
		}
		
		return list;	
	}

	public int solve(TreeNode A) {
		if(A==null) {
			return 0;
		}
		int leftHight=solve(A.left);
		int rightHight=solve(A.right);
		
		return Math.max(leftHight, rightHight)+1;
    }
	
	public int isSymmetric(TreeNode A) {
		if(A==null) {
			return 1;
		}
		Boolean val = isSymmetric(A.left,A.right);
		if(val) {
			return 1;
		} else {
			return 0;
		}
	}

	private boolean isSymmetric(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		
		if(left==null || right==null) {
			return left==right;
		}
		if(left.val!=right.val) {
			return false;
		}
		
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		
	}
	
	public int isSameTree(TreeNode A, TreeNode B) {
		Boolean val = chekSameTree(A.left,A.right);
		if(val) {
			return 1;
		} else {
			return 0;
		}
		
    }
	
	public boolean chekSameTree(TreeNode left, TreeNode right) {
		if(left==null || right==null) {
			return left==right;
		}
		if(left.val!=right.val) {
			return false;
		}
		
		return chekSameTree(left.left, right.left) && chekSameTree(left.right, right.right);
	}
	
	

}
