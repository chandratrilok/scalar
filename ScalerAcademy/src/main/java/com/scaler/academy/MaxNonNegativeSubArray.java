package com.scaler.academy;

import java.util.ArrayList;
import java.util.List;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(0, 0, -1, 0 );
		
		MaxNonNegativeSubArray mns = new MaxNonNegativeSubArray();

		ArrayList<Integer> maxset = mns.maxset(list);
		System.out.println(maxset);
	}
	
    public ArrayList<Integer> maxset(List<Integer> list2) {
        
        ArrayList<Integer> maxSet = new ArrayList<Integer>();
         ArrayList<Integer> list = new ArrayList<Integer>();
        
        long maxSum=0;
        long sum =0;
        for(int i=0;i<list2.size();i++) {
            
            if(list2.get(i)<0 ) {
                
               if(maxSum<=sum) {
                   maxSum=sum;
                   maxSet=list;
                   
               }    
                
                list = new ArrayList<Integer>();
                sum=0;
            } else {
               sum+=list2.get(i);
               list.add(list2.get(i));
            }    
        }
        if(maxSum<sum) {
            maxSum=sum;
            maxSet=list;
            
        }  
       return maxSet;
   }

}
