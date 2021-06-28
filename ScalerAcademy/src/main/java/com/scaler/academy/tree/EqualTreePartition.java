package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.List;

public class EqualTreePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode A =new TreeNode(5);
		TreeNode A1 =new TreeNode(3);
		TreeNode A2 =new TreeNode(7);
		A.left=A1;
		A.right=A2;
		
		TreeNode A11 =new TreeNode(4);
		TreeNode A12 =new TreeNode(6);
		
		A1.left=A11;
		A1.right=A12;
		
		TreeNode A21 =new TreeNode(5);
		TreeNode A22 =new TreeNode(6);
		
		A2.left=A21;
		A2.right=A22;
		
		EqualTreePartition equalTreePartition=new EqualTreePartition();
		int solve = equalTreePartition.solve(A);
		System.out.println(solve);
		

	}
	
    public int solve(TreeNode A) {
        
        List<Integer> list = new ArrayList<>();
        getSum(A,list);
        int sum = list.get(list.size()-1);
        if(list.contains(sum/2)) {
            return 1;
        }
        return 0;
    }
    private void getSum(TreeNode A,List<Integer> list) {
        
        if(A==null) {
            return ;
        } 
        getSum(A.left,list);
        list.add(A.val);
        getSum(A.right,list);
        int sum=list.get(list.size()-1)+A.val;
        list.add(A.val);
        list.add(sum);
    }


}
