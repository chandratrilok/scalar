package com.scaler.academy.problemsolve4;

import java.util.Arrays;

public class SumMatrixSubQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]A = {{1, 2, 3},
		         {4, 5, 6},
		         {7, 8, 9}};  
		 int[] B = {1, 2};
		 int[] C = {1, 2};
		 int[] D = {2, 3};
		 int[] E = {2, 3};
		 
		 SumMatrixSubQuery sumMatrixSubQuery = new SumMatrixSubQuery();
		 int[] solve = sumMatrixSubQuery.solve(A, B, C, D, E);
		 System.out.println(Arrays.toString(solve));

	}

	public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        
        int []result = new int[B.length];
        int [][] S = new int[A.length][A[0].length];
        int x = 1000000007;
        
        for(int r=0;r<S.length;r++) {
            for(int c=0;c<S[r].length;c++){
                S[r][c]=A[r][c];
                if((c-1)>=0) {
                	S[r][c]=(S[r][c]%x+S[r][c-1]%x)%x;
                }
                if((r-1)>=0) {
               	 	S[r][c]=(S[r][c]%x+S[r-1][c]%x)%x;
                } 
                if((r-1)>=0 && (c-1)>=0) {
                	S[r][c]=(S[r][c]-S[r-1][c-1]+x)%x;
                }	
            }
        }
        
        int i=0;
        
        while(i<result.length) {
        	
        	
        	int r2= D[i]-1;
        	int c2= E[i]-1;
        	int r1=B[i]-1;
        	int c1=C[i]-1;
        			
        	int sum=S[r2][c2];
        	if((c1-1)>=0) {
        		sum=(sum-S[r2][c1-1]+x)%x;
        	}
        	//sum-=(c1-1)<0?0:S[r2][c1-1]%x;
        	if((r1-1)>=0) {
        		sum=(sum-S[r1-1][c2]+x)%x;
        	}
        	//sum-=(r1-1)<0?0:S[r1-1][c2]%x;
        	
        	if((r1-1)>=0 && (c1-1)>=0) {
        		sum=(sum%x+S[r1-1][c1-1]%x)%x;
        	}
        	//sum+=((r1-1)<0||(c1-1)<0)?0:S[r1-1][c1-1];
        	if(sum<0) {
        	    sum+=x;
        	    sum%=x;
        	}
        	result[i]=sum;
        	i++;
        }
        
         return result;
    }
}
