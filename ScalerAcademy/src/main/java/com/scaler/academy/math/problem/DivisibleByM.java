package com.scaler.academy.math.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DivisibleByM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] A = {1,2,3,4,5};
		//int B =2;
		int []A = {5, 17, 100, 11};
		int B = 28;
		
		//int []A = {27, 546, 447, 755, 118, 441, 191, 234, 205, 902, 425, 229, 904, 263, 877, 578, 935, 502, 274, 846, 209, 786, 314, 394, 904, 936, 385, 182, 789, 452, 154, 136, 341, 751, 170, 769, 197, 177, 797, 974, 50, 156, 107, 540, 446, 605, 861, 25, 803, 320, 331, 38, 636, 607, 504, 889, 140, 879, 188, 797, 267, 257, 607, 551, 926, 510, 368, 587, 189, 784, 89, 942, 247, 687, 535, 432, 391, 223, 884, 714, 466, 985, 584, 591, 104, 777, 337, 33, 532, 547, 935, 921, 896, 98, 40, 429, 867, 562, 484, 299, 747, 4, 385, 18, 422, 895, 133, 24, 290, 348, 352, 640, 717, 203, 24, 390, 679, 43, 290, 709, 971, 173, 880, 833, 804, 472, 727, 836, 631, 728, 97, 350, 788, 778, 468, 518, 895, 327, 481, 97, 990, 761, 505, 450, 61, 718, 766, 362, 970, 384, 500, 249, 778, 754, 329, 313, 111, 122, 881, 662, 534, 139, 720, 224, 865, 631, 791, 531, 964, 218, 925, 86, 836, 497, 439, 94, 810, 168, 484, 782, 136, 30, 600, 399, 613, 213, 886, 263, 742, 359, 299, 898, 471, 720, 855, 381, 805, 308, 934, 514, 443, 288, 446, 329, 106, 791, 376, 736, 433, 196, 83, 838, 139, 717, 797, 535, 639, 826, 938, 581, 503, 644, 257, 164, 886, 921, 291, 437, 583, 667, 314, 130, 446, 784, 772, 564, 706, 281, 184, 899, 156, 803, 626, 435, 249, 205, 207, 131, 931, 886, 394, 282, 387, 405, 657, 489, 997, 694, 659, 601, 454, 812, 144, 339, 425, 774, 742, 675, 114, 459, 147, 872, 806, 955, 511, 259, 803, 40, 440, 469, 139, 621};

		//int B = 68;
		DivisibleByM div = new DivisibleByM();
		int solve = div.solve(A,B);
		System.out.println(solve);

	}

	
	/*
	 * public int solve(int[] A,int B) { int count=0; int mod=1000000007;
	 * 
	 * int countArray[] = new int[B];
	 * 
	 * for(int val:A) { int rem = val%B; countArray[rem]=countArray[rem]+1;
	 * 
	 * }
	 * 
	 * count = (countArray[0]*(countArray[0]-1))/2; count%=mod;
	 * 
	 * int i=1,j=B-1;
	 * 
	 * while(i<=j) { if(i==j) { count+=(countArray[i]*(countArray[j]-1))/2; } else {
	 * count+=(countArray[i]*countArray[j]); } count%=mod; i++; j--; }
	 * 
	 * return count;
	 * 
	 * }
	 */
	
    public int solve(int[] A, int B) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int ans=0;


        for(int val:A) {
            int mod = val % B;
            int com = (B-mod==B)?0:B-mod;
            
            if(map.containsKey(com)) {
            	ans+=(map.get(com)%1000000007);
            } 
            
            int count = map.getOrDefault(mod, 0);
            map.put(mod, ++count);
            
        }
        return ans;
        
    }

}
