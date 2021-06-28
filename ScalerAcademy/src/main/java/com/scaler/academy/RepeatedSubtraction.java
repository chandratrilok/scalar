package com.scaler.academy;

public class RepeatedSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedSubtraction rs = new RepeatedSubtraction();
		int final1 = rs.getFinal(5, 15);
		System.out.println(final1);
	}
	
	public int getFinal(int A, int B) {
        
		int gcd = gcd(A,B);
        if(gcd>0)
            return 2*gcd;
        return (A>B)?A:B;
    }
	
    public int gcd(int A, int B) {
        
        if(B==0)
            return A;
    	return gcd(B, A%B);

    }

}
