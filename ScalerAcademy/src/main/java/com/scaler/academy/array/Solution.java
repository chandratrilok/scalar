package com.scaler.academy.array;

import java.lang.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    	Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        
        while(T-- > 0){
            int length = s.nextInt();
            int [] myArray = new int[length];
    
            for(int i=0; i<length; i++ ) {
                myArray[i] = s.nextInt();
            }
            
            int shift = s.nextInt();
            shift=shift%length;
            int []res= new int[myArray.length];
            
            for(int i=0;i<length;i++) {
                res[i]=myArray[(i-shift+length)%length];
                
            }
            
            for(int j:res) {
                 System.out.print(j+" ");
            }
             System.out.println("");
        }
    }
}