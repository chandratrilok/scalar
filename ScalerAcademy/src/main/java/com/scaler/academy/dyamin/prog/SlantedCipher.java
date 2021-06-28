package com.scaler.academy.dyamin.prog;

public class SlantedCipher {
	
	public static void main(String[] args) {
		String decodeString = decodeString(3, "mnes__ya_____mi");
		System.out.println(decodeString);
	}

  public static String decodeString(int numberOfRows, String encodedString) {
    if(encodedString==null || encodedString.isEmpty()){
        return null;
    }
    int length=encodedString.length();
    int arrLength=length/numberOfRows;
    char[] result=new char[length];
    for(int i=0;i<length;i++) {
        result[i]='_';
    }
    int k=-1;
    int newIndex=0;
    for(int i=0;i<arrLength;i++){
        result[++k]=encodedString.charAt(i);
        while(newIndex<=length){
            newIndex=newIndex+arrLength+1;
            if(newIndex<length){
                result[++k]=encodedString.charAt(newIndex);
            }
        }
        newIndex=i+1;
        
    }
    String decodedString=new String(result);
    decodedString=decodedString.replace("_", " ");
    return decodedString.trim();
}
}
