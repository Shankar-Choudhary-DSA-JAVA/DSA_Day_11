package com.day_15;

import java.util.Scanner;

public class Demo_08_Strings13 {
	
	
	
	// take n strings input from the users and then print the largest Strings
	public static void readStringUserInputs() {
		
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values: ");
  
    
    int n=sc.nextInt();
    
    sc.nextLine();
    
    int largestLength=0;
    String largestString = "null";
    
    for(int i=1; i<=n; i++) {
    	String line = sc.nextLine();
    	if(line.length() > largestLength) {
    		largestString=line; //updating the largestString
    		largestLength=line.length();//updating the largestLength
    		

    	}

    }
	System.out.println(" the largest of all Strings is : "+largestString);

    
	}
	
	
	
	
	public static void main(String[] args) {
	
readStringUserInputs();
     

		}
	}