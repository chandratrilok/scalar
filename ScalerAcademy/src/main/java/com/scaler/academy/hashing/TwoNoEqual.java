package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoNoEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> A = List.of(3, 4, 7, 1, 2, 9, 8);
		
		//List<Integer> A = List.of(9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5);
		
		TwoNoEqual equal= new TwoNoEqual();
		
		ArrayList<Integer> result = equal.equal(A);
		
		System.out.println(result);

	}
	
	
	public ArrayList<Integer> equal(List<Integer> A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Map<Integer,Pair> map = new HashMap<>();
		
		int n = A.size();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int sum = A.get(i)+A.get(j);
				
				if(!map.containsKey(sum)) {
					Pair pair = new Pair(i, j);
					map.put(sum, pair);
					continue;
				}
				Pair pair = map.get(sum);
				int i1= pair.getFirstInd();
				int j1 = pair.getSecInd();
				ArrayList<Integer> current = new ArrayList<Integer>();

				if(i!=i1 && j!=i1 && i!=j1 && j!=j1) {
					//List<Integer> list = List.of(i1, j1, i, j);
					current.add(i1);
					current.add(j1);
					current.add(i);
					current.add(j);
				}
				
				if(current.size()==0) {
					continue;
				}
				
				System.out.println(result +"|| "+current);
				if(result.size()==0 || lexicoSmaller(result,current)) {
					result=current;
				}
				
			}
		}
		
		return result;

    }
	
	public boolean lexicoSmaller(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
	    int n = list1.size();
	    
	   
	   

	    for(int i = 0; i < n-1; i++)
	    {
	        if(list1.get(i) > list2.get(i)) 
	        {
	            return true;
	        }
	    }

	    return false;
	}
	
	class Pair {
		int firstInd;
		int secInd;
		
		public Pair(int firstInd, int secInd) {
			super();
			this.firstInd = firstInd;
			this.secInd = secInd;
		}

		public int getFirstInd() {
			return firstInd;
		}

		public int getSecInd() {
			return secInd;
		}

		@Override
		public String toString() {
			return "Pair [firstInd=" + firstInd + ", secInd=" + secInd + "]";
		}
		
		
		
		
	}

}
