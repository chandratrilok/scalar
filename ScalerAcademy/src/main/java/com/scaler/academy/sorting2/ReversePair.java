package com.scaler.academy.sorting2;

import java.util.Arrays;

public class ReversePair {

	int ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {1,3,2,3,1 };
		ReversePair count = new ReversePair();
		count.solve(A);
		System.out.println(Arrays.toString(A));
		System.out.println(count.ans);
	}
	
	public int solve(int []A) {
		mergeSort(A,0,A.length-1);
		return ans;
	}
	
	public void mergeSort(int []A,int low,int high) {
		
		
		if(low<high) {
			int mid = low+(high-low)/2;
			mergeSort(A, low, mid);
			mergeSort(A,mid+1, high);
			merge(A,low,mid,high);
		}
		
	}

	private void merge(int[] A, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int i1=low;
		int j1=mid+1;
		while(i1<=mid && j1<=high) {
			
			if(A[i1]>2*A[j1]) {
				ans+=(mid+1-i1);
				j1++;
			} else {
				i1++;
			}
			
		}
		int n1=mid-low+1;
		int n2=high-mid;
		
		int []L= new int[n1];
		int []R= new int[n2];
		
	
		
		for(int i=0;i<n1;i++) {
			L[i]=A[low+i];
		}
		
		for(int i=0;i<n2;i++) {
			R[i]=A[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k=low;
		while (i<n1&&j<n2) {
			
			if(L[i]<=R[j]) {
				A[k++]=L[i++];
			} else {
				
				A[k++]=R[j++];
			}
			
		}
		
		while(i<n1) {
			A[k++]=L[i++];
		}
		while(j<n2) {
			A[k++]=R[j++];
		}
		
	}


}
