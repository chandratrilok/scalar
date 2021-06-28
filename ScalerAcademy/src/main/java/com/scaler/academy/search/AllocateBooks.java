package com.scaler.academy.search;

public class AllocateBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllocateBooks allocateBooks = new AllocateBooks();
		int []A = {12, 34, 67, 90};
		int B = 2;
		int books = allocateBooks.books(A, B);
		System.out.println(books);

	}
	
	public int books(int[] A, int B) {
        
        if(B>A.length) {
            return -1;
        }
        long sum =0;
        int max=Integer.MIN_VALUE;
        
        for(int val:A) {
            sum+=val;
            max = Math.max(max,val);
        }
        
        long start=max;
        long end=sum;
        
        while(start<=end) {
            long mid = (start+end)/2;
            
           // for()
            
        
        }
        return 0;
        
    }

}
