package com.scaler.academy.pointer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxContinuousSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []A = { 1, 1, 0};
		
		
		int B = 2;
		
		MaxContinuousSeries maxContinuousSeries=new MaxContinuousSeries();
		ArrayList<Integer> maxone = maxContinuousSeries.maxone(Arrays.asList(A), B);
		
		System.out.println(maxone);

	}
	
	 public ArrayList<Integer> maxone(List<Integer> A, int B) {
		 
		 int p1=0;
		 int p2=0;
		 
		 int count=0;
		 int win=0;
		 int bestL=0;
		 
		 
		 while(p2<A.size()) {
			 
			 if(count<=B) {
				 if(A.get(p2)==0) 
					 count++;
					 p2++;
				 
			 }
			 
			 if(count>B) {
				 if(A.get(p1)==0) 
					 count--;
					 p1++;
				 
			 }
			 
			 if((p2-p1)>win&& count<=B) {
				 win=p2-p1;
				 bestL=p1;
			 }
			 
		 }
		 
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 
		 for(int i=0;i<win;i++) {
			 res.add(bestL+i);
		 }
		 
		 return res;
	  }

}
