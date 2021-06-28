package com.scaler.academy.array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MissingNumber miss = new MissingNumber();
		int [] arr = {0, 2, 3, 4};
		int missingNo = miss.getMissingNo(arr);
		System.out.println(missingNo);

	}
	
	public int getMissingNo(int []arr) {
		int total = 0;
        for (int i = 2; i <=(arr.length+1 ); i++)
        {
            total += i;
            total -= arr[i - 2];
        }
        return total;
	}

}
