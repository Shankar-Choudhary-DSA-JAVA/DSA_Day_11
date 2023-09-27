package com.day_15;

public class Demo_03_Strings4 {

	public static void main(String[] args) {
	
		  String a = "Hello";  // String literals, created obj = val in string pool
	        String b = "Hello";
	        String c = b;

	        if(a==b && b==c && a==c){ // they will be equals due to string pool and String literals
	        	//== methods compares address not the values
	        	// here all obj reference var refers the same address
	        	
	            System.out.println("They are equal");
	        }
	        else {
	            System.out.println("Not equal");
	        }
	        System.out.println(a);
	        System.out.println(a.length());

}
	}