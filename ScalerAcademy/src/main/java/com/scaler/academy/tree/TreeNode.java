package com.scaler.academy.tree;

public class TreeNode {

	int val;
	
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		super();
		this.val = val;
		this.left=null;
		this.right=null;
				
	}
	
	
	@Override
	public String toString() {
		return  val +"->";
	}


	public static TreeNode populateInOrder(int []val) {
		TreeNode root = new TreeNode(val[1]);
		root.left=new TreeNode(val[0]);
		root.right=new TreeNode(val[3]);
		root.right.left=new TreeNode(val[2]);
		
		return root;
		
	}
	
	

}
