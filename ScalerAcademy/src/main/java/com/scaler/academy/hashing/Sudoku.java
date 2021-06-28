package com.scaler.academy.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []A = { "....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......" };
		List<String> aList = Arrays.asList(A);

		Sudoku s = new Sudoku();
		int result = s.isValidSudoku(aList);
		System.out.println("Result:"+result);	
	}
	
	public int isValidSudoku(final List<String> A) {
        
		for(int i=0;i<A.size();i++) {
            String str = A.get(i);
            System.out.println(str);

		}
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i<A.size();i++) {
            String str = A.get(i);
            for(int j=0;j<str.length();j++) {
                char current_val=str.charAt(j);
				/*
				 * System.out.println(i); System.out.println(j);
				 * System.out.println(i/3+"-"+j/3);
				 * 
				 * System.out.println(i/3+"-"+j%3);
				 */

                if(current_val!='.') {
                    if(!seen.add(current_val+" found in row "+i)
                        ||!seen.add(current_val+" found in col "+j)
                        ||!seen.add(current_val+" found in cube "+i/3+"-"+j/3)) {
                            return 0;
                        }

                }
            }
            
        }
        return 1;
    }
	
	/*
	 * public int isValidSudoku1(final List<String> A) {
	 * 
	 * //HashSet<String> seen = new HashSet<>(); HashSet<Character> rows = new
	 * HashSet<>(); HashSet<Character> cols = new HashSet<>(); HashSet<Character>
	 * cube = new HashSet<>();
	 * 
	 * for(int i=0;i<A.size();i++) { String str = A.get(i); for(int
	 * j=0;j<str.length();j++) { char current_val=str.charAt(j);
	 * if(current_val!='.') { if(!seen.add(current_val+" found in row "+i)
	 * ||!seen.add(current_val+" found in col "+j)
	 * ||!seen.add(current_val+" found in col "+i/3+"-"+j/3)) { return 0; }
	 * 
	 * } }
	 * 
	 * } return 1; }
	 */
}
