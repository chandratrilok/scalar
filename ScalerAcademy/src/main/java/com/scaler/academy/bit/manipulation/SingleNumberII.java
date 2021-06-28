package com.scaler.academy.bit.manipulation;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {2,4,2,2};
		
		SingleNumberII sn = new SingleNumberII();
		int singleNumber = sn.singleNumber(A);
		System.out.println(singleNumber);
	}
	
	public int singleNumber(final int[] A) {
		int ans =0;
		
		for(int i=0;i<32;i++) {
			int sum =0;
			for(int val:A) {
				if(((val>>i)&1)==1) {
					sum++;
				}
			}
			sum%=3;
			if(sum!=0) {
				ans|=sum<<i;
			}
		}
		
		return ans;
	}

}
