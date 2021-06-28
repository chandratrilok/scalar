package com.scaler.academy.math.problem;

public class StrangeEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrangeEquality strangeEquality = new StrangeEquality();
		int result = strangeEquality.solve(2);
		System.out.println(result);

	}
	
	public int solve(int A) {
        int count =1+(int)(Math.log(A)/Math.log(2));
        int x=1<<count;
        int i =0;
        while(i<count) {
        	A=A^(1<<i);
        	i++;
        }
        
        return x^A;
        
    }

}
