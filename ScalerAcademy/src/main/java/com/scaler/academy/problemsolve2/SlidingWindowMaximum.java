package com.scaler.academy.problemsolve2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {

	
//	A : [ ]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = //List.of(648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368 );
				
				List.of(1, 3, -1, -3, 5, 3, 6, 7);
		int B=3;
		
		SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
		
		ArrayList<Integer> slidingMaximum = slidingWindowMaximum.slidingMaximum(list, B);
		
		System.out.println(slidingMaximum);
		
	}
	
	public ArrayList<Integer> slidingMaximum(final List<Integer> list, int B) {
		 
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		//648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368 
		for(int i=0;i<list.size();i++) {
			
			while(!deque.isEmpty()&& list.get(deque.getLast())<=list.get(i)) {
				Integer pollLast = deque.pollLast();
				
				System.out.println("Remove last "+pollLast);
				//result.add(pop);
				
			}
			deque.addLast(i);
			System.out.println("Deque::"+deque);
			if(i>=B-1) {
				result.add(list.get(deque.getFirst()));
				System.out.println("REsult::"+result);
			}
			if(deque.getFirst()==i-B+1) {
				Integer pollFirst = deque.pollFirst();
				
				System.out.println("Remove First "+pollFirst);

				
			}
			
		}
		
		
		return result;
		
    }

}
