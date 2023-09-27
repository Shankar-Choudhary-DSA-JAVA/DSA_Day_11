package com.day_15;

import java.util.Scanner;

public class Demo_12_Strings21 {
	public static void filterFiles() {
		
		String[] fileNames = {"image1.png","image2.png","image3.jpg","image4.jpg","d1.pdf","d2.pdf"};
		
		for(String f:fileNames) {
			if(f.endsWith(".pdf")) {
				System.out.println(f);
				
			}
		}
	}

      
	public static void main(String[] args) {
	
// now we will play with String inbuild functions
		// String is a class and it has so many inbuild functions, because oj has their prop and behaviours
	
	
	
	
	// String Concatenations means we are adding the Strings values
		

        // String concatenation
        String h1 = "Hello" + "World";
        System.out.println(h1);
        System.out.println("Hello " + 7);

        String greet = "Hi everyone Hi all";
        System.out.println(greet.indexOf("Hi")); //Hi =0
        System.out.println(greet.indexOf("Hi",1)); //Hi = 2
        System.out.println(greet.indexOf("Hi",2)); //Hi = 2

        System.out.println(greet.indexOf("Hi",22));
        
        filterFiles();
        	
        
      
	}
}