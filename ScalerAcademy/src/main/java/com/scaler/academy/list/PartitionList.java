package com.scaler.academy.list;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {1, 4, 3, 2, 5, 2};
		int B = 3;
		
		MyLinkedList linkedList = new MyLinkedList();
		ListNode listNode = linkedList.populateList(A);
		
		PartitionList partitionList = new PartitionList();
		ListNode partition = partitionList.partition(listNode, B);
		linkedList.display(partition);

	}
	
	 public ListNode partition(ListNode A, int B) {

		 if(A==null ||A.next==null) {
			 return A;
		 }
		 
		 ListNode beforeNode= new ListNode(0);
		 ListNode before=beforeNode;
		 
		 ListNode afterNode= new ListNode(0);
		 ListNode after=afterNode;
		 
		 ListNode head=A;
		 while(head!=null) {
			 
			 if(head.val<B) {
				 before.next=head;
				 before=before.next;
			 } else {
				 after.next=head;
				 after=after.next;
			 }
			 
			 
			 head=head.next;
		 }
		 
		 after.next = null;
		 before.next=afterNode.next;
		 
		 return beforeNode.next;
		 
		 
	 }

}
