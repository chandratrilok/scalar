package com.scaler.academy.hashing;

import java.util.HashMap;
import java.util.Map;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateFormat df = new DateFormat();
		String format = df.solve("16th Mar 2068");
		System.out.println(format);

	}
	
	 public String solve(String A) {
		 
		 Map<String, String> monthMap = populateMonthMap();
		 String[] split = A.split(" ");
		 
		 String day=split[0].substring(0,split[0].length()-2);
		 if(day.length()==1) {
			 day="0".concat(day);
		 }
		 
		 String month=monthMap.get(split[1]);
		 String year=split[2];
		 
		 return year+"-"+month+"-"+day;
		 
		 
	 }
	
	public Map<String,String> populateMonthMap() {
		Map<String,String> map = new HashMap<>();
		
		map.put("Jan","01"); 
		map.put("Feb","02");
		map.put("Mar","03");
		map.put("Apr","04");
		map.put("May","05"); 
		map.put("Jun","06");
		map.put("Jul","07");
		map.put("Aug","08");
		map.put("Sep","09");
		map.put("Oct","10");
		map.put("Nov","11");
		map.put("Dec","12");
		return map;
	}

}
