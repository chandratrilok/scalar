package com.scaler.academy.recursion;

public class Sixlets {

	int ans=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sixlets sixlets = new Sixlets();
		
		int []A = {1, 2, 8};
		int B = 2;
		//int []A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int B=5;
		int solve = sixlets.solve(A, B);
		System.out.println(solve);
	}

    public int solve(int[] A, int B) {
    
        int sum=0,count=0,ind=0;
        
         solve(A,B,sum,count,ind);
         return ans;
    }
    
    public void solve(int[] A, int B,int sum,int count,int ind) {
        
        if(sum>1000) {
            return ;
        }
        if(count==B) {
             ans++;
             return;
        }
        if(ind==A.length) {
            return ;
        }    
               
        solve(A,B,sum+A[ind],count+1,ind+1);
        solve(A,B,sum,count,ind+1);
    }
}
