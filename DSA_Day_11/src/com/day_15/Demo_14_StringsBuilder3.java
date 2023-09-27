package com.day_15;

import java.util.Scanner;

public class Demo_14_StringsBuilder3 {
// String builder
	// it supports modifications means it is mutable
	
	public static void main(String[] args) {

		
		// each StringBuilder has a default capacity of obj value + 16 = hello(5) + 16 =21 inintially this StringBuilder onjects = sb can hold in memory
		//as we know String is a array of characters
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.ensureCapacity(1000);

		System.out.println(sb.capacity());// it can hold 21 letters but if we add more than 21 it will again increase its size automatically
		sb.append("World is mine and its very beautiful");
		sb.append("World");
		
		// we can do these all things with char array as well, but why we are using StringBuilder
		// because there is no concepts of automatic grow of size for array , and then we need to do shifting as well
		
	
sb.insert(1, "B");
		System.out.println(sb.capacity());// it can hold 21 letters but if we add more than 21 it will again increase its size automatically

		System.out.println(sb.toString());//here we are getting String objects from StringBuilder objects
		}
}