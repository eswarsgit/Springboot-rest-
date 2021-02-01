package com.hcl.orders.hclOrdersnew.util;

import com.hcl.orders.hclOrdersnew.dto.PlaceOrderDetail;

public class StringUilts {
	
	public static Boolean validateStr(String str){
	return null==str || str.length() == 0 || str.chars().allMatch(Character::isWhitespace)||str.equals("string");
	}
	
	public static Boolean validateStr(Long str){
		return null==str ||str.equals("string");
		}
	
	
	public static void main(String args[]) {
		
		//System.out.println(validateStr(null));
		
	}

	public static boolean validateStr(PlaceOrderDetail plcdtls) {
		return null==plcdtls;
	}
}
