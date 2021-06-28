package com.scaler.academy.contest;

import java.util.ArrayList;
import java.util.List;

public class BeggersCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeggersCoin c = new BeggersCoin();
		int A=5;
		
		//Integer [][]B= {{1,2,10},{2,3,20},{2,5,25}};
		
		String str ="qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo";
		String solve = c.solve(str);
		
		System.out.println(solve);
		

	}
	
	public String solve(String A) {
        
        String[]  arr = A.trim().split(" ");
        int n = arr.length;
        
        for(int i=0;i<n/2;i++) {
            String temp = arr[i].trim();
            arr[i] = arr[n-i-1].trim();
            arr[n-i-1] = temp;
        }
        
        String result ="";
        for(int i=0;i<n;i++) {
	            if(arr[i].trim().equals("")) {
	            	continue;
	            }
            if(i!=n-1)
                result+=arr[i].trim()+" ";
            else   
                result+=arr[i].trim();
        }
        
        return result;
    }

	public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(A);
		
		for(ArrayList<Integer> tempList : B) {
			Integer coin = tempList.get(2);
			Integer firstInd = tempList.get(0)-1;
			Integer secInd = tempList.get(0);
			
			for(int i=firstInd;i<secInd;i++) {
				Integer totalCoin = list.get(i)+coin;
				list.add(i,totalCoin);
				
			}
		}
		return list;
	}
}
