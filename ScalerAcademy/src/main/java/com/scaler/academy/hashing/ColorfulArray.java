package com.scaler.academy.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class ColorfulArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 23;
		
		ColorfulArray colorfulArray = new ColorfulArray();
		int colorful = colorfulArray.colorful(A);
		System.out.println(colorful);

	}
	
	public int colorful(int A) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(A>0) {
			list.add(A%10);
			A=A/10;
		}
		
		Collections.reverse(list);
		System.out.println(list);
		
		Set<Long> set = new HashSet<>();
		
		for(int i=0;i<list.size();i++) {
			long product =1;
			for(int j=i;j<list.size();j++) {
				product*=list.get(j);
				if(set.contains(product)) {
					return 0;
				}
				set.add(product);
			}
		}
		
		
		return 1;
    }

}
