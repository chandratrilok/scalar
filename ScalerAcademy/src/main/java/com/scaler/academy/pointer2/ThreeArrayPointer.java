package com.scaler.academy.pointer2;

public class ThreeArrayPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] A = {1, 4, 10};
		 int[] B = {2, 15, 20};
		 int[] C = {10, 12};
		 
		 ThreeArrayPointer treeArrayPointer = new ThreeArrayPointer();
		 int minimize = treeArrayPointer.minimize(A, B, C);
		 System.out.println(minimize);
		 

	}
	
    public int minimize(final int[] A, final int[] B, final int[] C) {
        
        int i=0;
        int j=0;
        int k=0;
        int alen=A.length;
        int blen=B.length;
        int clen=C.length;
        int ans = Integer.MAX_VALUE;
        while(i<alen && j<blen && k<clen) {
            int maxDiff1 = Math.max(Math.abs(A[i]-B[j]),Math.abs(B[j]-C[k]));
            int maxDiff = Math.max(maxDiff1,Math.abs(A[i]-C[k]));
            ans = Math.min(ans,maxDiff);

            
            if(A[i]<B[j] && A[i]<C[k] )
                i++;
            
            else if(B[j]<=C[k] && B[j]<=C[k] )
                j++;
                
            else if(C[k]<=A[i] && C[k]<=B[j] )
                k++;    
            
                
        }
        
        return ans;        
    }


}
