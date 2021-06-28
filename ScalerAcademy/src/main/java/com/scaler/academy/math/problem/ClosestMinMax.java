package com.scaler.academy.math.problem;

public class ClosestMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A= {834, 563, 606, 221, 606,165};
				// {814, 761, 697, 483, 981};
		ClosestMinMax minMax = new ClosestMinMax();
		int solve = minMax.solve(A);
		System.out.println(solve);

	}
	
    public int solve(int[] A) {
        
        if(A.length==1) {
            return 1;
        }
        int res =Integer.MAX_VALUE;
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int prevMax=Integer.MIN_VALUE;
        int prevMin=Integer.MAX_VALUE;
        
        for(int i=0;i<A.length;i++) {
        	if(prevMin>=A[i]) {
        		prevMin=A[i];
        		min=i;
        	}
        	else if(prevMax<=A[i]) {
        		prevMax=A[i];
        		max=i;
        	}
        }
        
        
        
        return Math.abs(max-min);
    }

}
