package com.scaler.academy.array;

import java.util.ArrayList;
import java.util.Arrays;

public class AddToNumberOne {
	
	public static void main(String[] args) {
		AddToNumberOne s = new AddToNumberOne();
		//int[] arr = {9,9,9,9,9};
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		
		//int[] plusOne = s.plusOne(Arrays.asList(arr));
		int[]  arr = {0, 0,0,3, 7, 6, 4, 0, 5, 5, 5};
		//ArrayList<Integer> collect = (ArrayList<Integer>)Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		
		System.out.println(s.plusOne1(A));
	}
	
	public ArrayList<Integer> plusOne1(ArrayList<Integer> A) {
		
		int size;
	    int carry = 1;
	    int num;
	    
	    size = A.size();
	    
	    for(int i=size-1;i>=0;i--) {
	    	num = A.get(i);
	    	num+=carry;
	    	carry=0;
	    	if(num==10) {
	    		num=0;
	    		carry=1;
	    	}
	    	A.set(i, num);
	    	
	    }
	    
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    if(carry==1) {
	    	A.add(0,1);
	    }

	    for(int i:A) {
	    	if(i==0&&res.size()==0) {
	    		continue;
	    	}
	    	res.add(i);
	    }
	    return res;
	}
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		int carry=1;
        int size =A.size()-1;
        
        while(size>=0) {
        	
        	int temp = A.get(size)+carry;
        	A.set(size, temp%10);
        	carry=temp/10;
        	size--;
        }
        if(carry>0) {
        	A.add(0, carry);
        } 
        if(A.get(0)==0) {
        	A.remove(0);
        }
		
		return A;
    }

	public int[] plusOne(int[] A) {
        int carry=1;
        int size =A.length-1;
        //A[size]=A[size]+1;
        
        while(size>=0) {
        	int temp= A[size]+carry;
        	A[size]=temp%10;
        	carry=temp/10;
        	size--;
        }
        if(carry>0) {
        	int[] tmpArr = new int[A.length+1];
        	tmpArr[0]=carry;
        	for(int i = 1; i < tmpArr.length ; i++){
        		tmpArr[i] = A[i-1];
        	}
        	
        	A=tmpArr;
        	
        } 
        int indexOfMD =0;
        for(int i=0;i<A.length;i++) {
        	
        	if(A[i]!=0) {
        		break;
        	}
        	indexOfMD++;
        }
        
        if(indexOfMD>0) {
        	
        	int[] tmpArr = new int[A.length-indexOfMD];
        	for(int i = indexOfMD; i < A.length ; i++){
        		tmpArr[i-indexOfMD] = A[i];
        	}
        	A=tmpArr;
        }
        


        return A;
    }
}
