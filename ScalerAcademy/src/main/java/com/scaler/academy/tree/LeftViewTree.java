package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class LeftViewTree {

	class Pair {
		TreeNode node;
		int dist;
		
		public Pair(TreeNode node, int dist) {
			super();
			this.node = node;
			this.dist = dist;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode A = new TreeNode(1);
		TreeNode A1 = new TreeNode(2);
		TreeNode A2 = new TreeNode(3);
		A.left=A1;
		A.right=A2;

		TreeNode A11 = new TreeNode(4);
		TreeNode A12 = new TreeNode(5);
		A1.left=A11;
		A1.right=A12;
		
		TreeNode A21 = new TreeNode(6);
		TreeNode A22 = new TreeNode(7);
		A2.left=A21;
		A2.right=A22;
		
		TreeNode A111 = new TreeNode(8);
		A11.left=A111;
		
		LeftViewTree leftViewTree=new LeftViewTree();
		ArrayList<Integer> solve = leftViewTree.solve(A);
		
		System.out.println(solve);
		
		
	}
	
	private void levelOrder(TreeNode A,int leftLevel,int rightLevel,Map<Integer,Integer>map) {
		    
		    if(A==null) {
		        return;
		    } 
		    
		    if(!map.containsKey(leftLevel)) {
		         map.put(leftLevel, A.val);
		    }
		    
		    if(!map.containsKey(rightLevel)) {
		         map.put(rightLevel, A.val);
		    }
		    
		    
		    levelOrder(A.left,leftLevel+1,rightLevel,map);
		    levelOrder(A.right,leftLevel,rightLevel+1,map);
	}
	
    public ArrayList<Integer> solve(TreeNode A) {
        
    	int level =0;
        Map<Integer,Integer>map= new HashMap<>();
        //levelOrder(A,level,map);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(Integer key:map.keySet()) {
            result.add(map.get(key));
        }
        
        return result;

    }

	
	

}
