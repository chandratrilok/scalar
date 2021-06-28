package com.scaler.academy.sorting2;

import java.util.Arrays;

public class InversionCount {

	long ans=0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {28, 18, 44, 49, 41, 14 };
		InversionCount count = new InversionCount();
		count.solve(A);
		System.out.println(count.ans);
	}
	
	public int solve(int []A) {
		mergeSort(A,0,A.length-1);
		return (int)ans;
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
				ans+=((n1-i)%1000000009);
				
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
