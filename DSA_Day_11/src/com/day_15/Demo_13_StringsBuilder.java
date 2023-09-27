package com.day_15;

import java.util.Scanner;

public class Demo_13_StringsBuilder {
// String builder
	
	public static void main(String[] args) {

		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());// it can hold 21 letters but if we add more than 21 it will again increase its size automatically
		sb.append("World");
		
		System.out.println(sb.toString());//here we are getting String objects from StringBuilder objects
		
		
		System.out.println(sb);//here we are getting String objects from StringBuilder objects

		// StringBuilder has a extra array space in heap , so it can add extraa objects using append and concatenations
		// in StringBuilder we can modify the existing obj without creating new objects
		//StringBuilder automatically increases its size in heap just like arraylists to add new characters
	}
}