package com.day_15;

import java.util.Scanner;

public class Demo_14_StringsBuilder2 {
// String builder
	
	public static void main(String[] args) {

		
		// each StringBuilder has a default capacity of obj value + 16 = hello(5) + 16 =21 inintially this StringBuilder onjects = sb can hold in memory
		//as we know String is a array of characters
		StringBuilder sb = new StringBuilder("Hello");
		
		// we can ensure that StringBuilder should have initially 1000 char storage size, before it again getting doubled o increase by 16 itself
		// so we can do it by like this
		sb.ensureCapacity(1000);
		
		System.out.println(sb.capacity());// it can hold 21 letters but if we add more than 21 it will again increase its size automatically

		System.out.println(sb.capacity());// it can hold 21 letters but if we add more than 21 it will again increase its size automatically
		sb.append("World is mine and its very beautiful");
		
		System.out.println(sb.capacity());// it can hold 21 letters but if we add more than 21 it will again increase its size automatically

		System.out.println(sb.toString());//here we are getting String objects from StringBuilder objects
		
		// StringBuilder has a extra array space in heap , so it can add extraa objects using append and concatenations
		// in StringBuilder we can modify the existing obj without creating new objects
		//StringBuilder automatically increases its size in heap just like arraylists to add new characters
	}
}