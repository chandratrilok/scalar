package com.scaler.academy.string;

public class CountOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountOccurrences c = new CountOccurrences();
		int solve = c.solve("bobob");
		System.out.println(solve);

	}

	public int solve(String A) {
        String str = "bob";
        int count=0;
        for(int i=0;i<A.length()-3;i++) {
            if(str.equals(A.substring(i,i+3))) {
                count++;
            }
        }
        
        return count;
    }
}
