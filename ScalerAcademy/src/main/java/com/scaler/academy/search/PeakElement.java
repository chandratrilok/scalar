package com.scaler.academy.search;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []A = {5, 17, 100, 11};

		//int []A = {1,2,3,4,5};
		
		//int []A = {5,4,3,2,1};
		int []A = {2,3};
		
		PeakElement peakElement = new PeakElement();
		int solve = peakElement.solve(A);
		
		System.out.println(solve);
	}
	
	 public int solve(int[] A) {
		 
		 int low=0,high=A.length-1;
		 
		 while(low<=high) {
			 int mid = (high-low)/2+low;
			 if(mid==A.length-1) {
				 return A[mid];
			 }
			 
			 if(mid==0 ) {
				 if(A[0]>A[1])
					 return A[0];
				 else {
					 return A[1];
				 }
			 }
			 
			 if(A[mid-1]<A[mid]&&A[mid]>A[mid+1]) {
				 return A[mid];
			 }
			 
			 if(A[mid-1]>A[mid]) {
				 high=mid-1;
			 } else {
				 low=mid+1;	
			 }

		 }
		 
		return 0;
		 
	 }

}
