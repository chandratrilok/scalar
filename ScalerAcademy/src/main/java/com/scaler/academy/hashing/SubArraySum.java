package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int []A= {1,2,3,4,5};

		//int []A= {1,2,3,4,5};
		int []A= {1,1000000000};
		
		//int []A= {5,10,20,100,105};
		ArrayList<Integer> arr = (ArrayList)Arrays.stream(A).boxed().collect(Collectors.toList());
		int B=1000000000;
		SubArraySum s=new SubArraySum();
		ArrayList<Integer> solve = s.solve(arr, B);
		System.out.println("Solve::"+solve);
	}

	public ArrayList<Integer> solve(ArrayList<Integer> A,int B) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int l=0;
		int r=0;
		Integer sum = A.get(0);
		
		for(r=1;r<=A.size();r++) {
			
			while(sum>B&&l<=r) {
				sum-=A.get(l);
				l++;
			}
			if(sum==B) {
				while(l<r) {
					arr.add(A.get(l));
					l++;
				}
				break;
			}
			if(r<A.size())
			sum+=A.get(r);
		}
		
		if(arr.size()==0) {
			arr.add(-1);
		}
		return arr;
	}
}
