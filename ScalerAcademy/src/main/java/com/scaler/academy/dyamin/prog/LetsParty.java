package com.scaler.academy.dyamin.prog;

import java.util.HashMap;
import java.util.Map;

public class LetsParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetsParty party = new LetsParty();
		int aVal = party.solve(17);
		System.out.println(aVal);
	}
	
	Map<Integer,Integer> map = new HashMap<>();
    public int solve(int A) {
        
        if(A<=2) {
            return A;
        }
        if(map.containsKey(A)) {
            return map.get(A);
        }
        int aVal = (((A-1)*solve(A-2))+solve(A-1))%10003;
        map.put(A,aVal);
        return aVal;
    }

}
