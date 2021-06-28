package com.scaler.academy.math.problem;

import java.util.Arrays;

public class SortedPermutationRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="AaBbCc";
		SortedPermutationRank sortedPermutationRank=new SortedPermutationRank();
		int findRank = sortedPermutationRank.findRank(A);
		System.out.println(findRank);
		
	}

	
	private final int mod=1000003;
    
    public int findRank(String A) {
       
        char[] ar = A.toCharArray();
        Arrays.sort(ar);
        String sorted = String.valueOf(ar);
        int n=A.length();
        int []fact= new int[n];
        int []check= new int[n];
        
        calculateFact(fact,n);
        int ans=0;
        int ind=0;
        for(int i=0;i<n;i++) {

            
            if(check[i]==-1) {
                continue;
            } else if(A.charAt(ind)!=sorted.charAt(i)) {
                ans+=fact[n-ind-1];
                ans%=mod;
            } else {
                ind++;
                check[i]=-1;
                i=-1;

            }
            
        }    
        
        return (ans+1)%mod;

    }
    
    private void calculateFact(int []fact,int n) {
        
        for(int i=0;i<n;i++) {
            if(i<=1) {
                fact[i]=1;
            } else {
                fact[i]=i*fact[i-1]%mod;
            }
        }
    }
}
