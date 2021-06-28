package com.scaler.academy.list;

public class LongestPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = { 2, 1, 2 , 1 , 2 , 2 , 1 , 3 , 2 , 2};

		MyLinkedList list= new MyLinkedList();
		ListNode A = list.populateList(arr);
		
		LongestPalindrom l=new LongestPalindrom();
		int solve = l.solve(A);
		
		System.out.println(solve);
		
		
	}

	public int solve(ListNode A) {
		if(A==null) {
			return 0;
		}
		if(A.next==null) {
			return 1;
		}
		
		ListNode next=null;
		ListNode prev=null;
		int ans =1;
		while(A.next!=null) {
			next=A.next;
			A.next=prev;
			ans = Math.max(ans, 2*getCommonElementCount(prev, next)+1);
			ans = Math.max(ans, 2*getCommonElementCount(A, next));
			
			prev=A;
			A=next;
			
			
		}
		return ans;
	}
	
	private int getCommonElementCount(ListNode A,ListNode B) {
		
		int count=0;
		while(A!=null && B!=null) {
			if(A.val==B.val) {
				count++;
			} else {
				break;
			}
			A=A.next;
			B=B.next;
		}
		return count;
		
	}
	
	
}
