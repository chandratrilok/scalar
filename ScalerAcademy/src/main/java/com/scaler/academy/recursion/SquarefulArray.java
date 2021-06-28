package com.scaler.academy.recursion;

import java.util.HashSet;

public class SquarefulArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquarefulArray squarefulArray= new SquarefulArray();
		int []A= {28059, 841, 315, 85, 84, 37};
		int solve = squarefulArray.solve(A);
		System.out.println(solve);
		
	}
	int count;
	
    public int solve(int[] A) {
        
        if(A.length<2) {
            return 0;
        } 
        int i=0;
       // Arrays.sort(A);
        recurrsion(A,0);
		return count;
    }
    
    private void recurrsion(int [] A,int start) {
	 	
    	if(start>1 && (!isSquareful(A[start-1], A[start-2]))){
            return;
        }

    	if(start==A.length-1 && !isSquareful(A[start], A[start-1])){
            return;
        }
 
        if(start==A.length-1){
            count++;
            return;
        }
		
        HashSet<Integer> set = new HashSet<>();
		for(int k=start;k<A.length;k++) {
			if(set.contains(A[k])){
                continue;
            }
            set.add(A[k]);
			 
			swap(A,k,start);
			recurrsion(A, start+1);
			swap(A, start, k);
		 }
		 
	 }
	 
	
    void swap(int[] A, int i, int j){
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
	
	 boolean isSquareful(int a, int b){
	        double root = Math.sqrt(a+b);
	        return (root-Math.floor(root))==0;
	 }

	
 
	
}
