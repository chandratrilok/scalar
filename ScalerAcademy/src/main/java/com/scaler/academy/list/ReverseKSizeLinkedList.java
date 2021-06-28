package com.scaler.academy.list;

public class ReverseKSizeLinkedList {

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
		
		ReverseKSizeLinkedList list = new ReverseKSizeLinkedList();
		ListNode reorderList = list.reverseList(head,4);
		while(reorderList!=null) {
			System.out.print(reorderList);
			reorderList = reorderList.next;
			
		}

	}
	
	public ListNode reverseList(ListNode A, int B) {
        ListNode current = A;
        ListNode prev = null;
        ListNode next = null;
        int count=0;
        
        while(current!=null && count<B) {
            
        	next = current.next;
        	current.next = prev;
        	prev=current;
        	current=next;
        	count++;
            
        }
        
        if(next!=null) {
        	A.next = reverseList(next, B);
        }
        
        return prev;
    }
	
	

}
