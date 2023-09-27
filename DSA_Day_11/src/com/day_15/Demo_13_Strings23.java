package com.day_15;

import java.util.Scanner;

public class Demo_13_Strings23 {

	public static void printAllOcuurences() {
		String greet = "Hi I am Java fan, Java Hi All like me and I likes Java Hi Bro";

		System.out.println(greet.indexOf("Hi"));

		System.out.println(greet.indexOf("Hi", 1));

		System.out.println(greet.indexOf("Hi", 24));

		
		System.out.println(greet.indexOf("Hi", 77));
		
		//-1 means no more this particular word is present in the Strings
}

	public static void main(String[] args) {

		// printOcuurences();
		printAllOcuurences();
	}
}