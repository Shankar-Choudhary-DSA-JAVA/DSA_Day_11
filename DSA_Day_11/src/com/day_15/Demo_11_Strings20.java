package com.day_15;

import java.util.Scanner;

public class Demo_11_Strings20 {
	


    public static boolean isContainings() {
         String h2 = "Hi everyone Hi all";

		if(h2.contains("everyone")) {
		    	return true;
		    }else {
		    	
		    	return false;
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
        
    
        isContainings();
        	
        
      
	}
}