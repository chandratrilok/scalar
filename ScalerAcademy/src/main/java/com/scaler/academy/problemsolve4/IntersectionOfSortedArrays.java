package com.scaler.academy.problemsolve4;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer>A =List.of(10000000);
		//List<Integer>B =List.of(10000000);
		
		
		List<Integer>A =List.of(2, 3, 3, 4, 4, 6, 8, 8, 9, 9, 10, 10, 11, 14, 14, 15, 16, 18, 20, 21, 23, 23, 24, 25, 28, 29, 33, 33, 35, 35, 37, 38, 38, 40, 41, 42, 42, 44, 44, 47, 47, 49, 49, 52, 53, 56, 58, 61, 62, 62, 63, 64, 65, 65, 66, 67, 67, 67, 68, 69, 72, 74, 76, 76, 79, 80, 82, 82, 83, 83, 83, 84, 85, 85, 85, 85, 87, 91, 93, 94, 94, 94, 95, 96, 101, 101);
		List<Integer>B =List.of(12, 12, 20, 39, 42, 44, 47, 73, 77);
		IntersectionOfSortedArrays s = new IntersectionOfSortedArrays();
		ArrayList<Integer> intersect = s.intersect(A, B);
		System.out.println(intersect);

	}
	
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        int i=0;
        int j=0;
        while(i<A.size()&&j<B.size()) {
        	System.out.println(i+" "+A.get(i));
        	System.out.println(j+" "+B.get(j));
            if(A.get(i)<B.get(j)) {
                i++;
            }
            else if(A.get(i)>B.get(j)) {
                j++;
            }
            else if(A.get(i).equals( B.get(j))) {
                list.add(A.get(i));
                i++;
                j++;
            }
            
            System.out.println(list);
            
        }
        return list;
    }

}
