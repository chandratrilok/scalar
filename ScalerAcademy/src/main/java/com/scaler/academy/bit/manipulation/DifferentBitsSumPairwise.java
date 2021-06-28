package com.scaler.academy.bit.manipulation;

public class DifferentBitsSumPairwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []A = {1, 3, 5};
		DifferentBitsSumPairwise dbSP = new DifferentBitsSumPairwise();
		int cntBits = dbSP.cntBits(A);
		System.out.println(cntBits);
	}
	
	public int cntBits(int[] A) {
		long ans =0;
		
		for(int i=0;i<32;i++) {
			int count=0;
			for(int j=0;j<A.length;j++) {
				if((A[j]&(1<<i))>=1) {
					count++;
				}
			}
			ans+= 2*count * (A.length-count);
			ans%=1000000007;
		}
		
		return (int)ans;
	}

}
