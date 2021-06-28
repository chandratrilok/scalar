package com.scaler.academy.list;


class ListNode {
	public int val;
	public ListNode next;
	public ListNode random;
	
	ListNode(int val) {
		this.val=val;
		this.next = null;
		this.random=null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return val+"->";
	}
	
	
	
}
