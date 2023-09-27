package com.day_15;

public class Demo_03_Strings3 {

	public static void main(String[] args) {

		String a = "Hello";
		String s = new String("Hello");

		if (a == s) { // it compares address of obj not the obj/values
			System.out.println("True");
		}
		System.out.println("False");

	}
}