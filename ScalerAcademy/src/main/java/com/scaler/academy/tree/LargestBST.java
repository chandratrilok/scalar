package com.scaler.academy.tree;

import com.scaler.academy.tree.LargestBST.Info;

public class LargestBST {
	
	class Info {
		int size;
		int max;
		int min;
		Boolean isBST;
		public Info(int size, int max, int min, Boolean isBST) {
			super();
			this.size = size;
			this.max = max;
			this.min = min;
			this.isBST = isBST;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 10 / \ 5 15 / \ \ 1 8 7
		 */
	 
		 TreeNode A=new TreeNode(10);
		 TreeNode A1=new TreeNode(5);
		 TreeNode A2=new TreeNode(15);
		 A.left=A1;
		 A.right=A2;
		 TreeNode A11=new TreeNode(1);
		 TreeNode A12=new TreeNode(8);
		 A1.left=A11;
		 A1.right=A12;
		 TreeNode A22=new TreeNode(1);
		 A2.right=A22;
		 
		 LargestBST largestBST = new LargestBST();
		 int solve = largestBST.solve(A);
		 System.out.println(solve);
	 
	 

	}
	
	public int solve(TreeNode A) {
        
		Info maxBST = maxBST(A);
		return maxBST.size;

		
    }
	
	private Info maxBST(TreeNode root) {
		if(root==null) {
			return new Info(0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
		}
		Info left = maxBST(root.left);
		Info right = maxBST(root.right);
		
		if(left.isBST && right.isBST && root.val>left.max&& root.val<right.min) {
			return new Info(1+left.size+right.size, Math.max(root.val,right.max), Math.min(root.val,left.min), true);
		} else {
			return new Info(Math.max(left.size, right.size),-1,-1,false);

		}
	}

}
