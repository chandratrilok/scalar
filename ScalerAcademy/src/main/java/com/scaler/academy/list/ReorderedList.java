package com.scaler.academy.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReorderedList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []A = {1,2,3,4,5}; 
		
		ListNode head = null;    
		ListNode tail = null;    
		
		for(int i=0;i<A.length;i++) {
			
			ListNode newNode = new ListNode(A[i]);
			if(head==null) {
				head = newNode;
				tail = newNode;
						
			} else {
				tail.next = newNode;    
				tail=newNode;
			}

		}
		
		ReorderedList list = new ReorderedList();
		ListNode reorderList = list.reorderList(head);
		while(reorderList!=null) {
			System.out.print(reorderList);
			reorderList = reorderList.next;
			
		}
	}
	
	public ListNode reorderList(ListNode A) {
		
		if(A==null||A.next==null) {
			return A; 
		} 
		ListNode first = A;
		ListNode sec = A;
		
		int midCount =0;

		while(sec!=null && sec.next!=null) {
			sec=sec.next.next;
			first = first.next;
			midCount++;
		}

		first = A;

		Stack<ListNode> stack = new Stack<>();
		List<ListNode> list = new ArrayList<>();

		int tempCount = 0;
		while(first!=null) {
			ListNode newNode = new ListNode(first.val); 
			
			if(tempCount<midCount) {
				list.add(newNode);
			} else {
				stack.push(newNode);
			}
			tempCount++;
			first=first.next;

		}

		int listCount =0;
		
		ListNode head = list.get(listCount);
		ListNode tail = list.get(listCount);
		listCount++;
		
		
		while(!stack.isEmpty()) {
			
			if(!stack.isEmpty()) {
				ListNode pop = stack.pop();
				tail.next = pop;    
				tail= pop;
				
			}
			
			if(listCount<list.size()) {
				tail.next = list.get(listCount);    
				tail=list.get(listCount);
				listCount++;
			} 
		}
		return head;
    }
}
