package com.scaler.academy.list;

public class MergeSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arrA = { 5,8,20,25};
		int []arrB = { 4,11,15};

		MyLinkedList list= new MyLinkedList();
		ListNode A = list.populateList(arrA);
		ListNode B = list.populateList(arrB);
		
		MergeSortList mergeSortList=new MergeSortList();
		ListNode mergeTwoLists = mergeSortList.mergeTwoLists(A, B);
		
		list.display(mergeTwoLists);
		
		

	}
	
	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		
		
		ListNode dummyNode = new ListNode(0);
		ListNode prev=dummyNode;
		
		while(A!=null && B!=null) {
			
			if(A.val<B.val) {
				prev.next=A;
				A=A.next;
			} else {
				prev.next=B;
				B=B.next;
			}
			prev=prev.next;
		}
		
		while(A!=null) {
			prev.next=A;
			prev=prev.next;
			A=A.next;
		}
		while(B!=null) {
			prev.next=B;
			prev=prev.next;
			B=B.next;
		}
		return dummyNode.next;
	
	}

}
