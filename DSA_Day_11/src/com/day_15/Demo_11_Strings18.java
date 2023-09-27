package com.day_15;

import java.util.Scanner;

public class Demo_11_Strings18 {
	
	
		
	
	public static void main(String[] args) {
	
// now we will play with String inbuild functions
		// String is a class and it has so many inbuild functions, because oj has their prop and behaviours
		
		char[] arr = {'a','b','c','d','e'}; // char arrays
		String s= new String(arr);
		System.out.println(s);
		
		
		System.out.println("*******************************");
		
		String s2= new String("Hello");
		char[] arr1 = s2.toCharArray();// char arrays
		// here we are copy the exis String obj in to the another obj ref
         arr1[1]='B';
         System.out.println(arr1);
         

	}
}