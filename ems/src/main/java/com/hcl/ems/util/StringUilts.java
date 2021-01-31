package com.hcl.ems.util;

public class StringUilts {
	
	public static Boolean validateStr(String str){
	return null==str || str.length() == 0 || str.chars().allMatch(Character::isWhitespace)||str.equals("string");
	}
	
	public static void main(String args[]) {
		
		System.out.println(validateStr(null));
		
	}
}
