package com.wipro;

import java.util.HashMap;

public class UseHashMap {
	String value;
	public UseHashMap(){
	   value = "chanda";
	}
	public void setvalue(String val){
		value = val;
	}
	
	public static void main(String[] args){
		
		HashMap<Object,String> map = new HashMap<Object,String>();
		map.put("first", "first statement");
		map.put("2nd", "Second statement");
		map.put("3rd", "Third statement");
		System.out.println(map.get("first"));
	//	System.out.println(map.get("2nd"));
		
		UseHashMap hashMap = new UseHashMap();
		map.put(hashMap,"hashMap");
		hashMap.setvalue("kumari");
		System.out.println(map.get(hashMap));
		
		
		
	}

}
