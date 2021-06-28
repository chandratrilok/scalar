package com.scaler.academy.math.problem;

public class InterestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestingArray interestingArray=new InterestingArray();
		int []A= {9,17};
		String solve = interestingArray.solve(A);
		System.out.println(solve);

	}

	public String solve(int[] A) {
        
        int ans=(A[0]%2==1)?1:0;
        
        for(int i=1;i<A.length;i++) {
            ans^=(A[i]%2==1)?1:0;
        }
        
        if(ans==0){
            return "Yes";
        } 
        
        return "No";
    }
}
