package com.scaler.academy.dyamin.prog;

public class RepeatingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "aabb";
		RepeatingSubsequence seq= new RepeatingSubsequence();
		int anytwo = seq.anytwo(A);
		System.out.println(anytwo);

	}
	
	public int anytwo(String A) {
        
        int n=A.length();
        int [][]lcs=new int[n+1][n+1];
        
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=n;j++) {
                if(i==0||j==0) {
                    lcs[i][j]=0;
                } else if(A.charAt(i-1)==A.charAt(j-1) && i!=j) {
                    lcs[i][j]=1+lcs[i-1][j-1];
                } else {
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        
        return lcs[n][n];
    }
}
