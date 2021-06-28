package com.scaler.academy.math.problem;

import java.util.Arrays;

public class PainterReq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PainterReq painterReq= new PainterReq();
		int A = 1;
		int B = 1000000;
		int []C = {1000000, 1000000};
		int paint = painterReq.paint(A, B, C);
		System.out.println(paint);

	}
	
	public int paint(int A, int B, int[] C) {
		int mod=10000003;
		//Arrays.sort(C);
		long sum=0;
		long max=0;
		for(int val:C) {
			max=Math.max(max, ((long)val*B%mod)%mod);
			sum+=((long)val%mod*B%mod)%mod;
		}
		
		long start=max;
		long end=sum;
		//int ans=0;
		while(start<=end) {
			long mid=start+(end-start)/2;
			int req=1;
            long s=0;
            for(int val:C) {
                s+=(((long)val%mod*B%mod)%mod);
                if(s>mid) {
                    req++;
                    s=((long)(val%mod)*(B%mod))%mod;
                }
            }
            if(req<=A) {
                end=mid-1;
            } else {
                start=mid+1;
            }
			
		}
		return (int)start%mod;
    
	}

}
