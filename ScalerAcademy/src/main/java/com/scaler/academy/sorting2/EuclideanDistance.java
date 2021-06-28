package com.scaler.academy.sorting2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class EuclideanDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]A = {
		       {1, -1},
		       {2, -1}
		};
		
		int B = 1;
		
		int [][]X=  
		{
			  {50, 35},
			  {6, 4},
			  {1, 26},
			  {35, 30},
			  {21, 14},
			  {16, 11},
			  {50, 35},
			  {22, 37},
			  {26, 3},
			  {96, 74},
			  {78, 63},
			  {82, 106},
			  {91, 107},
			  {62, 107},
			  {85, 82},
			  {74, 69},
			  {66, 105},
			  {109, 73},
			  {76, 108},
			  {63, 64},
			  {81, 104},
			  {91, 106},
			  {68, 60},
			  {69, 65},
			  {86, 67}
		};
		    
		 int Y=9;
		
		 EuclideanDistance ed = new EuclideanDistance();
		 int[][] solve = ed.solve(X, Y);
		 System.out.println(Arrays.deepToString(solve));
		 
	}
	
	public int[][] solve(int[][] A, int B) {
		
		if(A==null) {
			return null;
		}
		
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] p1, int[] p2) {
				// TODO Auto-generated method stub
				return(p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1]);

			}
		});
		
		for(int i=0;i<A.length;i++) {
			pq.add(A[i]);
			if(pq.size()>B) {
				pq.remove();
			}
		}
		
		int [][]result = new int[B][2];
		int i=0;
		while(!pq.isEmpty()) {
			result[i]=pq.remove();
			i++;
		}
		
		
		return result;
	}
	
	public int[][] solve1(int[][] A, int B) {
        
		int [][]result = new int[B][B];
		
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i=0;i<A.length;i++) {
			if(map.size()>B) {
				break;
			}
			int[] in = A[i];
			int ed = in[0]*in[0]+in[1]*in[1];
			map.put(ed, i);
			
		}
		
		int count =0;
		for(Integer key: map.keySet()) {
			if(count==B) {
				break;
			}
			
			int index = map.get(key);
			result[count]=A[index];
			
			count++;
		}
		return result;
        
        
    }

	 public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
		 ArrayList<ArrayList<Integer>>  result = new ArrayList<>();
		 
		 for(ArrayList<Integer> innerArray:A) {
			 
		 }
		 
		 return result;
		 
	 }
}
