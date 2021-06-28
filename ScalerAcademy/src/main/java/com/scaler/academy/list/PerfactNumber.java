package com.scaler.academy.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PerfactNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfactNumber perfactNumber = new PerfactNumber();
		String solve = perfactNumber.solve(9);
		System.out.println(solve);
	}

	public String solve(int A) {
        Queue<String> pq = new LinkedList<>();
        pq.add("1");
        pq.add("2");
        
        List<String> list = new ArrayList<>();
        
        
        int count=0;
        while(count<A-2) {
        	String val = pq.remove();

        	list.add(val+1);
            pq.add(val+"1");
            list.add(val+2);
            
            pq.add(val+"2");
            
            count++;
        }
        String ans = list.get(list.size()-3);
        String rev = ""; 

        for(int i=ans.length()-1;i>=0;i--) {
            rev+=ans.charAt(i);
        }
        return ans+rev;
        
    }
}
