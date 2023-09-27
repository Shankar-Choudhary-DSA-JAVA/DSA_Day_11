package com.day_15;

import java.util.Scanner;




public class Demo_15_StringsBuilder5RevAString3 {
// String builder

	// why we need .toString method
	
	
	// because when a method has return type string and we only returnning obj ref then we will not get the real obj so we have to use toString methods
	
	// String  and array has fixed size in memory , but ArrayLists and StringBuilder has unlimited size in Heap ,
	//because it automatically increases its size as per requirements
	public static String myString() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.reverse();
		//System.out.println(sb.toString());

	//	return sb; //compile time errors
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		
System.out.println(myString()); //or

String s = myString();
System.out.println(s);


//StringBuilder sb = new StringBuilder("Hello");
//		sb.reverse();
//		System.out.println(sb.toString());
	}
}