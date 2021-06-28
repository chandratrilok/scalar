package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {3, 18, 26, 16, 5};//{ 13, 33, 41, 11, 49, 48, 23 };
		int []B = { 16, 5, 18, 3, 26};//{ 41, 33, 11, 13, 48, 49, 23 };
		int []C = {3, 16, 5, 18, 26};//{ 41, 11, 33, 48, 23, 49, 13 };
		/*int []A = { 3, 18, 26, 16, 5 };
		int []B = { 16, 5, 18, 3, 26 };
		int	[]C = { 3, 16, 5, 18, 26 };*/
		
		SameTree sameTree=new SameTree();
		int solve = sameTree.solve(A, B, C);
		System.out.println(solve);
		

	}
	
	int pos=0;

	public int solve(int[] A, int[] B, int[] C) {
		 
	    if(A==null && B==null && C==null) {
			 return 1;
		}
		 
		TreeNode root=buildTree(A,B);
		int index = checkPostOrder(root, C,0);
		if(index==C.length) {
			 return 1;
		} else {
			 return 0;
		}
	}
	
	private int checkPostOrder(TreeNode node, int []postOrder,int index) {
		if(node==null) {
			return index;
		}
		index = checkPostOrder(node.left, postOrder, index);
		index = checkPostOrder(node.right, postOrder, index);
		
		if(node.val==postOrder[index]) {
			index++;
			
		} else {
			return 0;
		}
		return index;
	}
    public TreeNode buildTree(int[] A, int[] B) {
		
		TreeNode root=treeNode(A,B,0,A.length-1);
		return root;		
    }
	
	private TreeNode treeNode(int[] A, int[] B, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start>end) {
			return null;
		} 
		if(pos>=A.length) {
			return null;
		}
		TreeNode root=new TreeNode(A[pos++]);

		if(start==end) {
			return root;
		}
		
		int index = getIndex(root.val,B,start,end);
		root.left=treeNode(A, B, start, index-1);
		root.right=treeNode(A, B, index+1, end);
		return root;
	}
	
	private int getIndex(int val, int[] A, int start, int end) {
		// TODO Auto-generated method stub
		for(int i=start;i<=end;i++) {
			if(A[i]==val) {
				return i;
			}
		}
		return -1;
	}

	

	public void postorderTraversal(ArrayList<Integer> list,TreeNode A) {
		if(A!=null) {
			postorderTraversal(list, A.left);
			postorderTraversal(list, A.right);
			list.add(A.val);
		}
	}
}
