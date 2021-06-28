package com.scaler.academy.problemsolve4;

public class MinimizeAbsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = { 1, 4, 5, 8, 10 };
		int []B = { 6, 9, 15 };
		int []C = { 2, 3, 6, 6 };
		MinimizeAbsoluteDiff mad = new MinimizeAbsoluteDiff();
		int solve = mad.solve(A, B, C);
		
		System.out.println("Solve::"+solve);

	}
	
	public int solve(int[] A, int[] B, int[] C) {
        
		int countA=A.length-1;
	    int countB=B.length-1;
	    int countC=C.length-1;
		
        int a = A[countA];
        int b = B[countB];
        int c = C[countC];
        
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int diff = Math.abs(max-min);
        
        
        while(countA!=-1&&countB!=-1&&countC!=-1) {
        	
        	a = A[countA];
            b = B[countB];
            c = C[countC];
                  
        	max = Math.max(Math.max(a, b), c);
            min = Math.min(Math.min(a, b), c);
            diff = Math.min(Math.abs(max-min),diff);
            
            
	          if(A[countA]==max) {
	              countA--;

	          }
	          if(B[countB]==max) {
	              countB--;

	          }
	          if(C[countC]==max) {
	              countC--;
	          }
                  
                  
        }
        
        return diff;
    }

}
