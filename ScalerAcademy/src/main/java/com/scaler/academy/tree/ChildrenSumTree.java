package com.scaler.academy.tree;

public class ChildrenSumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 TreeNode A=new TreeNode(11);
		 TreeNode A1=new TreeNode(151);
		 TreeNode A2=new TreeNode(172);
		 A.left=A1;
		 A.right=A2;
		 
		 TreeNode A11=new TreeNode(88);
		 //TreeNode A12=new TreeNode(5);
		 
		 A1.left=A11;
		// A1.right=A12;
		 
		 TreeNode A21=new TreeNode(148);
		// TreeNode A22=new TreeNode(5);
		 A2.left=A21;
		 //A2.right=A22;
		 TreeNode A111=new TreeNode(86);
		 A11.left=A111;
		 
		 ChildrenSumTree childrenSumTree = new ChildrenSumTree();
		 childrenSumTree.displayPreOrder(A);
		 TreeNode solve = childrenSumTree.solve(A);
		 System.out.println();
		 childrenSumTree.display(solve);

	}
	
	private void displayPreOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+"->");

		display(root.left);
		display(root.right);
	}
	
	private void display(TreeNode root) {
		if(root==null) {
			return;
		}
		display(root.left);
		display(root.right);
		System.out.print(root.val+"->");
	}
	
	int l=0,r=0,diff=0;

    public TreeNode solve(TreeNode A) {
        convertSum(A);
        return A;
        
    }
    
    private void convertSum(TreeNode root) {
        if(root==null ||(root.left==null &&root.right==null)) {
            return;
        }
        convertSum(root.left);
        convertSum(root.right);
        
        if(root.left!=null) {
            l=root.left.val;
        }
        if(root.right!=null) {
            r=root.right.val;
        }
        diff= l+r-root.val;
        if(diff>=0) {
            root.val+=diff;
        } else {
            balanceTree(root,(-1)*diff);
        }
        
    } 
    private void balanceTree(TreeNode root, int diff) {
        
        if(root.left!=null) {
            root.left.val=root.left.val+diff;
            balanceTree(root.left,diff);
            
        }
        else if(root.right!=null) {
            root.right.val=root.right.val+diff;
            balanceTree(root.right,diff);
            
        }
    }

}
