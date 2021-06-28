package com.scaler.academy.list;

public class PalindromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {1, 2, 2, 1};
		int B = 3;
		
		MyLinkedList linkedList = new MyLinkedList();
		ListNode listNode = linkedList.populateList(A);
		
		PalindromLinkedList partitionList = new PalindromLinkedList();
		int solve = partitionList.lPalin(listNode);
		System.out.println(solve);
	}
	
	public int lPalin(ListNode A) {
    
		if(A==null||A.next==null) {
			return 1;
		}
		ListNode head = A;
		

		ListNode fastPtr = head;
		ListNode slowPtr = head;
		ListNode middleNode = null; 
		ListNode prevSlowPtr = null;
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr=fastPtr.next.next;
			prevSlowPtr=slowPtr;
			slowPtr=slowPtr.next;
		
		}
		if(fastPtr!=null) {
			middleNode=slowPtr;
			slowPtr=slowPtr.next;
		}
		
		
		ListNode left = head;
        ListNode right = slowPtr;
        prevSlowPtr.next= null;
        
        ListNode revRight = reverse(right);
        
        while(left!=null && revRight!=null) {
        	if(left.val!=revRight.val) {
        		return 0;
        	}
        	left=left.next;
        	revRight=revRight.next;
        }
        
        
        
        return 1;
	
	}
	
	private ListNode reverse(ListNode right) {
		
		ListNode prev =null;
		ListNode current = right;
		ListNode next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current =next;
		}
		return prev;
	}
	
}
