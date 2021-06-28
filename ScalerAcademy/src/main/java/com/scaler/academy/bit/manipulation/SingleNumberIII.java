package com.scaler.academy.bit.manipulation;

import java.sql.Array;
import java.util.Arrays;

public class SingleNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {186, 256, 102, 377, 186, 377};
		
		SingleNumberIII sn = new SingleNumberIII();
		int []singleNumber = sn.solve(A);
		System.out.println(Arrays.toString(singleNumber));
	}
	
	public int[] solve(int[] A) {
        int xr=0;
        for(int val:A) {
            xr^=val;
        }
        
        int mask=(xr&(xr-1))^xr;
        
        int xra=0;
        int xrb=0;
        for(int val:A) {
            if((val&mask)==0) {
                xra^=val;
            } else {
                xrb^=val;
            }
        }
        return new int[]{Math.min(xra,xrb),Math.max(xra,xrb)};
    }

}
