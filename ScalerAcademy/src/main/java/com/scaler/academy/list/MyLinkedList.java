package com.scaler.academy.list;

public class MyLinkedList {

	public ListNode populateList(int []list) {
		
		
		ListNode head = null;    
		ListNode tail = null;    
		
		for(int i=0;i<list.length;i++) {
			
			ListNode newNode = new ListNode(list[i]);
			if(head==null) {
				head = newNode;
				tail = newNode;
						
			} else {
				tail.next = newNode;    
				tail=newNode;
			}

		}
		
		return head;
		
	}
	
	public void display(ListNode node) {
		ListNode head = node;
		
		while(head!=null) {
			System.out.print(head);
			head = head.next;
			
		}
		
	}
	
	
}
