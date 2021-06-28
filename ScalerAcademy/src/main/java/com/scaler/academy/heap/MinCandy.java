package com.scaler.academy.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinCandy {
	
	class CustomIntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 > o2 ? 1 : -1;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {1,2,1};//{3, 2, 3};
		int B = 2;
		
		MinCandy minCandy = new MinCandy();
		int solve = minCandy.solve(A, B);
		System.out.println(solve);

	}

    public int solve(int[] A, int B) {
        
        int result=0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new CustomIntegerComparator());
        
        for(int i=0;i<A.length;i++) {
             queue.add(A[i]);
        }
        while(!queue.isEmpty() && queue.peek()<=B) {
        	
        	
            int a=queue.poll();
            int temp = a/2;
            
            result+=temp;
            
            if(!queue.isEmpty()) {
                int b=queue.poll();
                b+=(a-temp);
                queue.add(b);
            } 
        }
        return result;
    }

	
}
