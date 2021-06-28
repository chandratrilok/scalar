package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.Stack;

public class BTInOrderAndPostOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {1,2,3};// {6, 1, 3, 2};
		int []B = {2,1,3};//{6, 3, 2, 1};
		BTInOrderAndPostOrder travesal = new BTInOrderAndPostOrder();
		TreeNode buildTree = travesal.buildTree(A, B);
		
		while(buildTree!=null) {
			System.out.print(buildTree.val);
			if(buildTree.left!=null) {
				buildTree=buildTree.left;
			}
			if(buildTree.right!=null) {
				buildTree=buildTree.right;
			}
		}
		
	}
	
	int pos;
	
	public TreeNode buildTree(int[] A, int[] B) {
		
		TreeNode root= null;
		root=treeNode(root,A,B,0,A.length-1);
		return root;		
    }
	
	private TreeNode treeNode(TreeNode root,int[] A, int[] B, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start>end) {
			return null;
		} 
		
		root=new TreeNode(A[pos++]);
		if(start==end) {
			return root;
		}
		
		int index = getIndex(root.val,B,start,end);
		root.left=treeNode(root, A, B, start, index-1);
		root.right=treeNode(root, A, B, index+1, end);
		return root;
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
	

	/*
	 * private TreeNode treeNode(TreeNode root,int[] A, int[] B, int start, int end,
	 * int pos) { // TODO Auto-generated method stub
	 * 
	 * if(start>end) { return null; }
	 * 
	 * root=new TreeNode(B[pos]);
	 * 
	 * int index = getIndex(root.val,A,start,end); root.right=treeNode(root, A, B,
	 * index+1, end, pos-1); root.left=treeNode(root, A, B, start, index-1,
	 * pos-(end-index)-1); return root; }
	 */

	private int getIndex(int val, int[] A, int start, int end) {
		// TODO Auto-generated method stub
		int i=start;
		for(;i<=end;i++) {
			if(A[i]==val) {
				return i;
			}
		}
		return 0;
	}

}
