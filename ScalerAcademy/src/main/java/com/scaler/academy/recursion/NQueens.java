package com.scaler.academy.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueens nQueens = new NQueens();
		ArrayList<ArrayList<String>> solve= nQueens.solveNQueens(4);
		System.out.println(solve);

	}
	
	public ArrayList<ArrayList<String>> solveNQueens(int A) {

		ArrayList<ArrayList<String>> testBoard = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
		
		  for(int i=0;i<A;i++) { 
			  ArrayList<String> list = new ArrayList<String>();
			  for(int j=0;j<A;j++) { 
				  list.add("."); 
			  } 
			  testBoard.add(list); 
		 }
		 
	    
	    findPlace(testBoard,board,0,A);
	    
	    return board;
	    
	}
	
	private Boolean findPlace(ArrayList<ArrayList<String>> testBoard,ArrayList<ArrayList<String>> board,int row,int n) {
	    if(row==n) { 
	    	ArrayList<String> emptyRow= new ArrayList<String>();
	    	board.add(emptyRow);

	    	for (int i = 0; i<n; ++i)
	        {
	            String tempRow = "";
	            for (int j = 0; j<n; ++j)
	            	tempRow += testBoard.get(i).get(j);
	            
	            emptyRow.add(tempRow);
	        }
	        return false;
	    	
	    }

	        
	    for(int col=0;col<n;col++) {

	    	if(isSafePlaceToMove(testBoard,row,col,n)) {
	    		ArrayList<String> list = testBoard.get(row);
	    		list.add(col,"Q");
	    		testBoard.set(row,list);
	    		
		        if(findPlace(testBoard,board,row+1,n))	
		        	return true;
	    		list.remove(col);
	    	} 
	    }
	    
	    return false;
	    
	}

	private boolean isSafePlaceToMove(ArrayList<ArrayList<String>> chess, int row, int col,int n) {
		// TODO Auto-generated method stub
		for(int i=row-1,j=col;i>=0;i--) {
			if(chess.get(i).get(j).equals("Q")) {
				return false;
			}
		}
		
		
		
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
			if(chess.get(i).get(j).equals("Q")) { 
				return false;
			}
		}
		
		for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++) {
			if(chess.get(i).get(j).equals("Q")) {
				return false;
			}
		}
		
		
		
		return true;
	}

}
