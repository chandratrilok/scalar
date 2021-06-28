package com.scaler.academy.list;

public class AddList {
	
	
	public static void main(String[] args) {
		int []arrA = { 0};
		int []arrB = { 1,0,1};

		MyLinkedList list= new MyLinkedList();
		ListNode A = list.populateList(arrA);
		ListNode B = list.populateList(arrB);
		
		AddList sum=new AddList();
		ListNode result = sum.addTwoNumbers(A, B);
		
		list.display(result);
	}
	
	public ListNode addTwoNumbers(ListNode A, ListNode B) {
		
		
		
		ListNode carry=new ListNode(0);
		ListNode dummyNode = new ListNode(0);
		ListNode current=dummyNode;
		while(A!=null && B!=null) {
			int ans=A.val+B.val+carry.val;
			
			ListNode temp=new ListNode(ans%10);
			current.next=temp;
			current=current.next;
			A=A.next;
			B=B.next;
			int div=ans/10;
			
			if(div>0) {
				carry=new ListNode(div);
			} else {
				carry=new ListNode(0);
			}
			
		}
		
		while(A!=null) {
			int ans=A.val+carry.val;
			
			ListNode temp=new ListNode(ans%10);
			current.next=temp;
			current=current.next;
			A=A.next;
			int div=ans/10;
			
			if(div>0) {
				carry=new ListNode(div);
			} else {
				carry=new ListNode(0);
			}
			
		}
		
		while(B!=null) {
			int ans=B.val+carry.val;
			
			ListNode temp=new ListNode(ans%10);
			current.next=temp;
			current=current.next;
			B=B.next;
			int div=ans/10;
			
			if(div>0) {
				carry=new ListNode(div);
			} else {
				carry=new ListNode(0);
			}
			
		}
		
		while(carry!=null && carry.val>0) {
			int ans=carry.val;
			
			ListNode temp=new ListNode(ans%10);
			current.next=temp;
			current=current.next;
			int div=ans/10;
			
			if(div>0) {
				carry=new ListNode(div);
			} else {
				carry = null;
			}
				
			
		}
		
		
		return dummyNode.next;
		
    }
	
	

}
