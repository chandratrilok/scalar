package com.scaler.academy.storage;

import java.util.HashMap;
import java.util.Stack;

public class SimplifyDirectoryPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String A = "/a/./b/../../c/";
		String A = "/../";
		SimplifyDirectoryPath obj = new SimplifyDirectoryPath();
		String simplifyPath = obj.simplifyPath(A);
		System.out.println(simplifyPath);
		
	}
	
	public String simplifyPath(String A) {
        
		String path = "";
		
		Stack<String > stack = new Stack<String>();
		int preIndex = 0;
		if(A.charAt(A.length()-1)!='/') {
			A+='/';
		}
		for(int i=1;i<A.length();i++) {
			
			if(A.charAt(i)=='/') {
				String dirName = A.substring(preIndex+1, i);
				if(dirName.equals("..")) {
					if(!stack.isEmpty())
						stack.pop();
				} else if(!(dirName.equals(".")||dirName.trim().equals(""))) {
					stack.push(dirName);
				}	
				preIndex=i;
			}
		}
		while(!stack.isEmpty()) {
			String dirName = stack.pop();
			path="/"+dirName+path;
		}
		if(path.equals("")) {
			return "/";
		}
		return path;
    }

}
