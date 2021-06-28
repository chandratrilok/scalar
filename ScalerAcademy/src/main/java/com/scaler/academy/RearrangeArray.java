package com.scaler.academy;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(4, 0, 2, 1, 3);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(list);
		RearrangeArray ra = new RearrangeArray();
		ra.arrange(arr);
		System.out.println(arr);
	}
	
	public void arrange(ArrayList<Integer> a) {
		int n= a.size();
		
		for(int i=0;i<n;i++) {
	        int temp = a.get(i)+(a.get(a.get(i))%n)*n;
	        a.set(i,temp);
	    }
		
		for(int i=0;i<n;i++) {
	        int temp = a.get(i)/n;
	         a.set(i,temp);
	        
	    }
	}

}
