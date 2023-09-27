package com.day_15;

import java.util.Scanner;

public class Demo_12_Strings22 {
	
	public static void printAllOcuurences() {

		String doc = "I am Java fan, Java like me and I likes Java ";

		String word = "Java";

		int indexes = doc.indexOf(word);
//		System.out.println(indexes);
		
		
		while(indexes != -1) { // to print all indexes
			// it returns -1 when it not found the particular words
			System.out.println(indexes);
//			indexes = doc.indexOf(word, indexes+1);// **this is the update condition of the while loops
			// but indexes+1 is better , but it counts overlaps words as well 
			
			indexes = doc.indexOf(word, indexes+word.length());// **this is the update condition of the while loops
//indexes+word.length() it will optimize our code because it will check from the next words, not the from the next indexes
		}

	}
	

	public static void printOcuurences() {

		String doc = "I am Java fan, Java like me and I likes Java ";

		String word = "Java";

		int indexes = doc.indexOf(word);
		System.out.println(indexes);

	}
public static void main(String[] args) {

		//printOcuurences();
		printAllOcuurences();
	}
}