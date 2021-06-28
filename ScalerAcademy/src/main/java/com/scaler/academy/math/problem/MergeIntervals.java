package com.scaler.academy.math.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
		@Override
		public String toString() {
			return "(" + start + ", " + end + ")";
		}
	      
	      
	  }

public class MergeIntervals {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Interval [] internalArr=  {new Interval(6037774, 6198243), new Interval(6726550, 7004541), new Interval(8842554, 10866536), new Interval(11027721, 11341296), new Interval(11972532, 14746848), new Interval(16374805, 16706396), new Interval(17557262, 20518214), new Interval(22139780, 22379559), new Interval(27212352, 28404611), new Interval(28921768, 29621583), new Interval(29823256, 32060921), new Interval(33950165, 36418956), new Interval(37225039, 37785557), new Interval(40087908, 41184444), new Interval(41922814, 45297414), new Interval(48142402, 48244133), new Interval(48622983, 50443163), new Interval(50898369, 55612831), new Interval(57030757, 58120901), new Interval(59772759, 59943999), new Interval(61141939, 64859907), new Interval(65277782, 65296274), new Interval(67497842, 68386607), new Interval(70414085, 73339545), new Interval(73896106, 75605861), new Interval(79672668, 84539434), new Interval(84821550, 86558001), new Interval(91116470, 92198054), new Interval(96147808, 98979097) };
		
		ArrayList<Interval> list =new ArrayList<Interval>();

		for(Interval interval:internalArr) {
			list.add(interval);
		}
		
		Interval three = new Interval(36210193, 61984219);
		MergeIntervals mergeIntervals= new MergeIntervals();
		ArrayList<Interval> insert = mergeIntervals.insert(list, three);
		
		System.out.println(insert);
		

	}
	
	 private Boolean checkOverLaps(long firstStart,long firstEnd,long secStart,long secEnd) {
	        if(firstStart<=secStart && firstEnd>=secEnd) {
	            return true;
	        }
	        if(secStart<=firstStart && secEnd>=firstEnd) {
	            return true;
	        }
	        
	        if(firstEnd>=secStart && firstEnd<=secEnd) {
	            return true;
	        }
	        if(secEnd>=firstStart && secEnd<=firstEnd) {
	            return true;
	        }
	        return false;
	       
	  }
	 
	 public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	        
	        int minS=newInterval.start;
	        int maxE=newInterval.end;
	        
	        ArrayList<Interval> removeList=new ArrayList<Interval>() ;
	        
	        ArrayList<Interval> resultList=new ArrayList<Interval>() ;

	        for(int i=0;i<intervals.size();i++) {
	        	Interval interval = intervals.get(i);
	        	
	            if(checkOverLaps(interval.start,interval.end,minS,maxE)) {
	                minS=Math.min(interval.start,minS);
	                maxE=Math.max(interval.end,maxE);
	                removeList.add(interval);
	            }  
	        }
	        intervals.removeAll(removeList);
	        Interval tempInterval= new Interval(minS,maxE);
	        System.out.println(tempInterval);

	        if(intervals.size()==0) {
	        	resultList.add(tempInterval);
	        } else {
	        	Boolean isAdded=Boolean.FALSE;
	        	for(int i=0;i<intervals.size();i++) {
	        		
	        		if(tempInterval.end<intervals.get(i).start && !isAdded) {
	        			resultList.add(tempInterval);
	        			resultList.add(intervals.get(i));
	        			isAdded=Boolean.TRUE;
	        		} else {
	        			resultList.add(intervals.get(i));
	        		}
	        	}
	        	if(!isAdded) {
	        		resultList.add(tempInterval);
	        	}
	        }
	        
	       return resultList;
	    }
}
