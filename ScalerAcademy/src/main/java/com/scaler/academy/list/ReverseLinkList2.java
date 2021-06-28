package com.scaler.academy.list;

public class ReverseLinkList2 {

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
		
		ReverseLinkList2 list = new ReverseLinkList2();
		ListNode reorderList = list.reverseBetween(head,2,4);
		while(reorderList!=null) {
			System.out.print(reorderList);
			reorderList = reorderList.next;
			
		}

	}
	
	public ListNode reverseBetween(ListNode A, int B,int C) {
        ListNode current = A;
        ListNode prev = null;

        while(B>1) {
        	prev=current;
        	current = current.next;
        	B--;
        	C--;
        }
        
        ListNode start = prev;
        ListNode end = current;
        ListNode third = null;
       
        while(C>0) {
        	
        	third = current.next;
        	current.next=prev;
        	prev = current;
        	current=third;
        	
        	C--;
        	
        }
        if(start!=null) {
        	start.next = prev;
        } else {
        	A = prev;
        }
        end.next = current;
                
        return A;
    }
	
	

}
