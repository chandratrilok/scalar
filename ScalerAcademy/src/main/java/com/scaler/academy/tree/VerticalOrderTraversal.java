package com.scaler.academy.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {
	
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
		
		VerticalOrderTraversal verOrdTraves = new VerticalOrderTraversal();
		
		TreeNode A = new TreeNode(6);
		TreeNode A1 = new TreeNode(3);
		TreeNode A2 = new TreeNode(7);
		A.left=A1;
		A.right=A2;

		TreeNode A11 = new TreeNode(2);
		TreeNode A12 = new TreeNode(5);
		A1.left=A11;
		A1.right=A12;
		TreeNode A22 = new TreeNode(9);
		A2.right=A22;
		
		
		ArrayList<ArrayList<Integer>> verticalOrderTraversal = verOrdTraves.verticalOrderTraversal(A);
		
		System.out.println(verticalOrderTraversal);


	}
	
	 public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
		 Queue<Pair> queue = new LinkedList<>();
		 
		 Map<Integer,ArrayList<Integer>>map= new TreeMap<>();
		 queue.add(new Pair(A,0));
		 
		 while(!queue.isEmpty()) {
			 Pair poll = queue.poll();
			 if(poll!=null && poll.node!=null) {
				 
				 if(!map.containsKey(poll.dist)) {
			         map.put(poll.dist, new ArrayList<Integer>());
			    }
			    map.get(poll.dist).add(poll.node.val);
			 }
			 
			 if(poll.node.left!=null) {
				 
				 queue.add(new Pair(poll.node.left,poll.dist-1));
			 }
			 
			 if(poll.node.right!=null) {
				 
				 queue.add(new Pair(poll.node.right,poll.dist+1));
			 }
		 }
		 
		 ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        
	        for(Integer key:map.keySet()) {
	            result.add(map.get(key));
	        }
	        
	        return result;
		 
		 
		 
	 }
    public ArrayList<ArrayList<Integer>> verticalOrderTraversalRec(TreeNode A) {
        int level =0;
        Map<Integer,ArrayList<Integer>>map= new TreeMap<>();
        levelOrder(A,level,map);
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for(Integer key:map.keySet()) {
            result.add(map.get(key));
        }
        
        return result;
        
    }

    private void levelOrder(TreeNode A,int level,Map<Integer,ArrayList<Integer>>map) {
    
	    if(A==null) {
	        return;
	    } 
	    
	    if(!map.containsKey(level)) {
	         map.put(level, new ArrayList<Integer>());
	    }
	    map.get(level).add(A.val);
	    
	    levelOrder(A.left,level-1,map);
	    levelOrder(A.right,level+1,map);
    }


}
