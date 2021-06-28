package com.scaler.academy.sorting3;

import java.util.Arrays;

public class CountSmallerNumber {
	
	class Pair {
		
		int num;
		int index;
		public Pair(int num, int index) {
			super();
			this.num = num;
			this.index = index;
		}
		@Override
		public String toString() {
			return num+"";
		}
		
	}

	//Count of smaller numbers after self
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A= {1, 5, 4, 2, 1};
		
		CountSmallerNumber csn = new CountSmallerNumber();
		int[] solve = csn.solve(A);
		System.out.println(Arrays.toString(solve));


	}
	
	public int[] solve(int[] A) {
		
		int []result = new int[A.length];
		
		Pair []pairs = new Pair[A.length];
		for(int i=0;i<A.length;i++) {
			pairs[i]=new Pair(A[i], i);
		}
		
		mergeSort(pairs,result,0,A.length-1);
		System.out.println(Arrays.toString(pairs));
		
		return result;
		
    }

	private void mergeSort(Pair[] pairs, int[] result, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start<end) {
			int mid = start+(end-start)/2;

			mergeSort(pairs, result, start, mid);
			mergeSort(pairs, result, mid+1, end);
			merge(pairs,result,start,mid,end);

		}
		
	}

	private void merge(Pair[] pairs, int[] result, int start, int mid, int end) {
		// TODO Auto-generated method stub

		int l = mid-start+1;
		int r = end-mid;
		
		Pair []lParis=new Pair[l];
		Pair []rPairs=new Pair[r];
		
		
		
		for(int i=0;i<l;i++) {
			lParis[i]=pairs[start+i];
		}
		
		for(int i=0;i<r;i++) {
			rPairs[i]=pairs[mid+1+i];
		}		
		int i=0,j=0,k=start;
		int rightPointer=start;
		
		while(i<l && j<r) {
			if(lParis[i].num<=rPairs[j].num) {
				pairs[k++]=lParis[i++];
			} else {
				result[pairs[k].index]++;
				pairs[k++]=rPairs[j++];
			}
		}
		
		while(i<l) {
			pairs[k++]=lParis[i++];
		}
		
		while(j<r) {
			result[pairs[k].index]++;
			pairs[k++]=rPairs[j++];

		}
	}

}
