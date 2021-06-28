package com.scaler.academy.list;

public class CloneLinkedList {
	
	public static void main(String[] args) {
		
		ListNode A1=new ListNode(1);
		ListNode A2=new ListNode(2);
		ListNode A3=new ListNode(3);
		ListNode A4=new ListNode(4);
		ListNode A5=new ListNode(5);
		
		A1.next=A2;
		A2.next=A3;
		A3.next=A4;
		A4.next=A5;
		
		A1.random=A5;
		A2.random=A4;
		A3.random=A3;
		A4.random=A2;
		A5.random=A1;
		
		CloneLinkedList cloneLinkedList = new CloneLinkedList();
		
		ListNode cloneList = cloneLinkedList.cloneList(A1);
		System.out.println(cloneList);
		
	}
	
	ListNode cloneList(ListNode A) {
		
		if(A==null ||A.next==null) {
			return A;
		}
		ListNode current=A;
		ListNode next=null;
		
		while(current!=null) {
			ListNode newNode = new ListNode(current.val);
			next=current.next;
			current.next=newNode;
			newNode.next=next;
			current=next;
		}
		
		current=A;
		
		while(current!=null && current.next!=null) {
			current.next.random=current.random.next;
			current=current.next.next;
		}
		
		//current =A;
		ListNode copy=A.next;
		ListNode tempCopy=copy;
		
		while(copy!=null&&copy.next!=null) {
			copy.next=copy.next.next;
			copy=copy.next;
		}
		
		return tempCopy;
				
		
	}

}
