package com.scaler.academy.hashing2;

import java.util.HashMap;
import java.util.Map;

public class PointsOnSameLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointsOnSameLine countRec = new PointsOnSameLine();
		int []A = {-1, 0, 1, 2, 3, 3};
		int []B = {1, 0, 1, 2, 3, 4};
		
		int solve = countRec.solve(A, B);
		System.out.println(solve);

	}

	public int solve(int[] A, int[] B) {
		int n = A.length;
		int ans=0;
		
		for(int i=0;i<n;i++) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			int dup=1;
			
			for(int j=i+1;j<n;j++) {
				if(A[j]==A[i]&&B[i]==B[j]) {
					dup++;
				} else {
					int dx=A[j]-A[i];
					int dy=B[j]-B[i];
					int g = gcd(dx,dy);
					String key = String.valueOf(dx/g)+"-"+String.valueOf(dy/g);
					int value=map.getOrDefault(key, 0)+1;
					map.put(key, value);
					
				}
			}
			
			ans=Math.max(ans, dup);
			
			for(String key:map.keySet()) {
				ans=Math.max(ans, map.get(key)+ dup);
			}
			
		}
		return ans;
				

    }

	 public int gcd(int a,int b) {
	        if(b==0)
	            return a;
	        return gcd(b,a%b);
	  }
}
