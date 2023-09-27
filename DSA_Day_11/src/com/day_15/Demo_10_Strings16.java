package com.day_15;

import java.util.Scanner;

public class Demo_10_Strings16 {
	
	
		
	
	public static void main(String[] args) {
	
// now we will play with String inbuild functions
		// String is a class and it has so many inbuild functions, because oj has their prop and behaviours
		
		
		String  s = " i love Mango Shakes ";
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println("#####################");

		// the return values from these methods will be stored in String pool see how
		
		String h="hello";//String pool
		
		if(h== h.toLowerCase()) {
			System.out.println("Equal"); // both are same
		}else {
			System.out.println("Not equals");
		}
		
		System.out.println("#####################");
	// the return values from these methods will be stored in String pool see how
		
		String h1="Hello";//String pool
		
		if(h1== h1.toLowerCase()) {
			System.out.println("Equal"); // both are same
		}else {
			System.out.println("Not equals");
		}
		
		
		System.out.println("#####################");
		// the return values from these methods will be stored in heap see how
			
			String h2= new String("hello");//String pool
			
			if(h2 == h2.toLowerCase()) {
				System.out.println("Equal"); // both are same
			}else {
				System.out.println("Not equals");
			}
		
				}
	}