package com.scaler.academy.hashing2;

import java.util.HashMap;
import java.util.Map;

public class CountRectangle {

	class Pair {
				
		int x;
		int y;
		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Pair))
				return false;
			Pair other = (Pair) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []A = {1, 1, 2, 2, 3, 3};
		//int [] B = {1, 2, 1, 2, 1, 2};
		//int []A = {1, 1, 2, 2};
		//int []B = {1, 2, 1, 2};
		
		int []A = { 9, 5, 1, 1, 3, 7, 7, 9, 6, 9, 2, 8 };
		int []B = {8, 1, 5, 3, 8, 5, 4, 5, 2, 2, 7, 9 };

		CountRectangle countRec = new CountRectangle();
		int solve = countRec.solve(A, B);
		System.out.println(solve);

	}

	public int solve(int[] A, int[] B) {
        
        Map<Pair,Integer> map = new HashMap<>();
        int n=A.length;
        for(int i=0;i<n;i++) {
        	Pair pair = new Pair(A[i], B[i]);
        	Integer count = map.getOrDefault(pair, 0);
        	map.put(pair, ++count);
        }
        int count=0;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(A[i]!=A[j] && B[i]!=B[j]) {
        			Pair p1 = new Pair(A[i],B[j]);
        			Pair p2 = new Pair(A[j],B[i]);
        			int p1Count = (map.get(p1)==null)?0:map.get(p1);
        			int p2Count = (map.get(p2)==null)?0:map.get(p2);
        			
        			if(p1Count==1 && p2Count==1) {
        				count++;
        			}
        		}
        	}
        }
        return count/2;
    }
}
