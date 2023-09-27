package com.day_15;

import java.util.Scanner;

public class Demo_15_StringsBuilder5RevAString {
// String builder

	public static void main(String[] args) {
		
		 

	//	String sb = new StringBuilder("Hello").reverse().toString();//toString method converts the StringBuilder obj in to String obj 
		
		//or
		
//		StringBuilder sb = new StringBuilder("Hello").reverse();//toString method converts the StringBuilder obj in to String obj

		String sb = new String(new StringBuilder("Hello").reverse());
		// using new I have created the obj and then we know obj has methods so we used StringBuilder ka reverse method to rev the obj
		
		System.out.println(sb);
		System.out.println(sb.toString());

		
	
	}
}