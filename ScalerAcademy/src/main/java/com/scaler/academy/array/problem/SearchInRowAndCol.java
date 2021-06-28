package com.scaler.academy.array.problem;

public class SearchInRowAndCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [][]A = {{1, 3, 5, 7},
			//		{2, 4, 6, 8}};
		
		//int [][]A = {{1,2,3},{4,5,6},{7,8,9}};
		int [][]A = {{ 2,8,8,8},{ 2,8,8,8},{ 2,8,8,8}};
		int B = 8;
		SearchInRowAndCol se = new SearchInRowAndCol();
		int solve = se.solve(A, B);
		System.out.println(solve);

	}
	
    public int solve(int[][] A, int B) {
        int n=A.length;
        int ans=-1;
        int i=0,j=A[0].length-1;
        while(i<n && j>=0) {
            if(A[i][j]==B) {
            	ans = ((i+1)*1009+j+1);
                j--;
                continue;
            }
                
                
            if(A[i][j]>B) {
                j--;
            } else {
                i++;
            }    
        }
        return ans;
    }
	

}
