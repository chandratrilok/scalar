package com.scaler.academy.search;

public class HightOfStairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HightOfStairCase h = new HightOfStairCase();
		int A=20;
		int solve = h.solve(A);
		System.out.println(solve);

	}
	
	
	public int solve(int A) {
        int count =0;
        int hight =1;
        while(A>=hight) {
            A-=hight;
            count++;
            hight++;
        }
        
        return count;
    }
	
    public int solve1(int A) {
        int count =0;
        int hight =1;
        while(A>=hight) {
            A-=hight;
            count++;
            hight++;
        }
        
        return count;
    }

}
