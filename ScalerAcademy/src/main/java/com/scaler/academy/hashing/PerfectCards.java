package com.scaler.academy.hashing;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PerfectCards {
	public static void main(String[] args) {
		
		PerfectCards pc = new PerfectCards();
		List<Integer> list = List.of(1, 1, 2, 2, 2 );
		
		String solve = pc.solve(list);
		
		System.out.println(solve);
		
	}
	
	public String solve(List<Integer> A) {
		Map<Integer, Long> map = A.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		if(map.size()==2) {
			
			Set<Entry<Integer, Long>> entrySet = map.entrySet();
			
			Iterator<Entry<Integer, Long>> iterator = entrySet.iterator();
			
			Long val1 = iterator.next().getValue();
			Long val2 = iterator.next().getValue();
			
			if(val1==val2) {
				return "WIN";
			}
			
		}
		return "LOSE";

	}
	
}
