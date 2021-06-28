package com.scaler.academy.list;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []A = {1,1,2,2,3,3,3,4,5,5,5}; 
		
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
		
		RemoveDuplicates list = new RemoveDuplicates();
		ListNode reorderList = list.deleteDuplicates(head);
		while(reorderList!=null) {
			System.out.print(reorderList);
			reorderList = reorderList.next;
			
		}
	}
	
    public ListNode deleteDuplicates(ListNode A) {
        
        if(A==null || A.next==null) {
            return A;
        } 
        
        ListNode head = A;
        ListNode current = A;
        ListNode next = null;
        while(head.next!=null) {
            next=head.next;
            if(head.val!=next.val) {
                 current.next=next;
                 current = current.next;

            } 
            head=next;
        }
        
        current.next=head.next;
        return A;
    }

	
}
