package com.scaler.academy.pointer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MinimumSwaps2 {
	
	class Pair implements Comparable<Pair> {
		int firstInd;
		int secondInd;
		
		public Pair(int firstInd, int secondInd) {
			super();
			this.firstInd = firstInd;
			this.secondInd = secondInd;
		}

	
		@Override
		public String toString() {
			return "("+firstInd + ", "+secondInd +")";
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return Integer.valueOf(this.firstInd).compareTo(o.firstInd);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumSwaps2 minimumSwaps2 = new MinimumSwaps2();
		
		int []A = {2,0,1,3};

		int solve = minimumSwaps2.solve(A);
		System.out.println(solve);
		
		
	}
	
	public int solve(int[] A) {
		
		ArrayList<Pair> pairs = new ArrayList<>();
		int len = A.length;
		for(int i=0;i<len;i++) {
			Pair pair = new Pair(A[i], i);
			pairs.add(pair);
		}
		
		Collections.sort(pairs);
		int ans=0;
		boolean []visted = new boolean[len];
		
		int j=-100;
		for(int i=0;i<len;i++) {
			j=i;
			if(visted[i]) {
				continue;
			}
			visted[i]=true;
			int cycleSize=0;

			while(true) {
				j=pairs.get(j).secondInd;
				
				cycleSize++;

				if(visted[j] || j==i) {
					break;
				}
				visted[j]=true;
			}
			ans+=(cycleSize-1);
		}
		
		
		return ans;
		
	}

}
