package com.day_15;

import java.util.Scanner;

public class Demo_08_Strings12 {
	
	
	
	public static void main(String[] args) {
	
// take strings input from the users
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values: ");
      
        
        int n=sc.nextInt();
        
        sc.nextLine(); //to consume the first enter, if we not use it the program will be finished hare and line 22 will never get executed

        for(int i=1; i<=n; i++) {
        	// for first enter it will print the vacate spaces
        	
        	String line =sc.nextLine();
        	System.out.println("\t" +line+ "\n");
        	
        }
 
        


		}
	}