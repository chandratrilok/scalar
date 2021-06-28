package com.scaler.academy.array;

import java.util.ArrayList;

public class MultipleLeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleLeftRotate m = new MultipleLeftRotate();
		
		
		
		  ArrayList<Integer> aList = new ArrayList<Integer>(); aList.add(1);
		  aList.add(2); aList.add(3); aList.add(4); aList.add(5);
		  
		  ArrayList<Integer> bList = new ArrayList<Integer>(); bList.add(8);
		  bList.add(9);
		 
		 
		 
		
		/*
		 * int []A = { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31,
		 * 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35,
		 * 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47}; int []B = {88, 85, 98,
		 * 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29,
		 * 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};
		 * 
		 * ArrayList<Integer> aList = new ArrayList<Integer>(); for(int i:A) {
		 * aList.add(i); }
		 * 
		 * ArrayList<Integer> bList = new ArrayList<Integer>(); for(int i:B) {
		 * bList.add(i); }
		 */
		 
		 ArrayList<ArrayList<Integer>> solve = m.solve2(aList, bList);
		 
		 System.out.println(solve);

	}
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        for(Integer i : B) {
            
            ArrayList<Integer> inner = new ArrayList<Integer>();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            
            if(i>A.size()) {
            	i=i%A.size();
            }
           
            
            for(int j=0;j<i;j++) {
                temp.add(A.get(j));
            }
            
            for(int k=temp.size();k<A.size();k++) {
                inner.add(A.get(k));
            }
            
            for(int k:temp) {
                inner.add(k);
            }
            result.add(inner);
        }
        
        return result;
    }
	
	public ArrayList<ArrayList<Integer>> solve2(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList< ArrayList<Integer> > ans = new ArrayList<>();
        int n = a.size();
        for(int x : b) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++) { temp.add(a.get( (i+x) % n )); }
			/*
			 * 
			 */	
            
			/*
			 * for (int i = 0; i < N; ++i){ ans[i] = A[(i-B+N)%N]; }
			 */ ans.add(temp);
        }
        return ans;
    }

}
