package com.day_15;

import java.util.Scanner;

public class Demo_07_Strings11 {
	
	
	
	public static void main(String[] args) {
	
// take strings input from the users
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values: ");
        String firstName = sc.next();// it reads only one words/tokens at a times grom whole sentences
        String lastName = sc.next();
        System.out.println(firstName);
        System.out.println(lastName);

       // sc.nextLine(); //to consume the first enter, if we not use it the program will be finished hare and line 22 will never get executed
        
        String line = sc.nextLine();// it will read whole sentences at a time
        System.out.println(line);

        System.out.println(line.stripLeading()); //it will remove the spaces from the starting of the sentences 

		 
 
        


		}
	}