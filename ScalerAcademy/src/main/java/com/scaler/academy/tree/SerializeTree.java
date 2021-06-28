package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public ArrayList<Integer> solve(TreeNode A) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		queue.add(A);
		while(!queue.isEmpty()) {
			
			
			TreeNode node = queue.poll();
			if(node.val==-1) {
				list.add(node.val);
				continue;
			} 
			list.add(node.val);
			
			if(node.left==null) {
				queue.add(new TreeNode(-1));
			} else {
				queue.add(node.left);
			}
			
			if(node.right==null) {
				queue.add(new TreeNode(-1));
			} else {
				queue.add(node.right);
			}
		}
		return list;
		
    }

}
