package com.scaler.academy.list;

public class SortLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {4, 2, 1, 3}; 
		
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
		SortLinkedList sortLinkedList  = new SortLinkedList();
		ListNode sortList = sortLinkedList.sortList(head);
		while(sortList!=null) {
			System.out.print(sortList);
			sortList = sortList.next;
			
		}
	}

	public ListNode sortList(ListNode head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		
		ListNode fastPtr = head.next;
        ListNode slowPtr = head;
        
        while(fastPtr!=null && fastPtr.next!=null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        ListNode left = head;
        ListNode right = slowPtr.next;
        slowPtr.next= null;
        
        ListNode listNode1 = sortList(left);
        ListNode listNode2 = sortList(right);
        
        return merge(listNode1,listNode2);
		
	}

	private ListNode merge(ListNode listNode1, ListNode listNode2) {
		// TODO Auto-generated method stub
		
		ListNode dummyNode = new ListNode(0);
		ListNode prev = dummyNode;
		
		while(listNode1!=null && listNode2 !=null) {
			if(listNode1.val<listNode2.val) {
				prev.next = listNode1;
				listNode1 = listNode1.next;
			} else {
				prev.next = listNode2;
				listNode2 = listNode2.next;
			}
			prev = prev.next;
		}
		
		if(listNode1!=null)
			prev.next=listNode1;
		if(listNode2!=null)
			prev.next=listNode2;
		
		
		return dummyNode.next;
	}
}
