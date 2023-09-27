package com.day_15;

import java.util.Scanner;

public class Demo_10_Strings17 {
	
	
		
	
	public static void main(String[] args) {
	
// now we will play with String inbuild functions
		// String is a class and it has so many inbuild functions, because oj has their prop and behaviours
		
		
		String  s = " i love Mango Shakes ";
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		

		s=s.replace("Mango", "Banana");
		System.out.println(s);

		System.out.println("#####################");

		s=s.toLowerCase();// reassing the string obj in to the same ref but orig string obj remains as it is
		System.out.println(s);
		

		
		System.out.println("#####################");
		
		String name =" Shankar ";
		System.out.println(name);

		System.out.println(name.length());
		System.out.println(name.strip()); // it removes spaces from start and end of the indexes
		System.out.println(name.strip().length());
		System.out.println(name);
		System.out.println("#####################");
				}
	}