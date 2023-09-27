package com.day_15;

import java.util.Scanner;
// String vs StringBuilder
// Interesting Experiement for Speed Comparison while we add/append something to String and StringBuilder
public class Demo_17_StringPerformanceComparison3 {

  // This topic we will learn in details in Space Time complexity chapters
	// that how we get and defined 
// we can see from time we got that StringBuilder is not creating new array , 
	//actually it increases the size of the existing arry on the demands/requirements in heap memory thats why it takes less time to add data
	
	// But String each time create a new array with req size, and then put String obj/data in to it, thats why it takes more time 
	// n - n^2 ; StringBuilder - String ; this is time complexity they took to perform on adding same datas/objects
	
//that is why we use array list because it increases its double on requirements, it does not creates new array in heap to store the new dobjects/datas/records
    static void addToStringUsingStBuilder(int n){//i want to add n letters to the Strings
    	
    	
StringBuilder sb =new StringBuilder();        
        
        for(int i=0; i<n; i++){
sb.append((char) 'A' +i);// used to add A, B C..and so on
            //adding to sb
            
          //   System.out.println(sb);
        }
    }

    
    
    static void addToString(int n){//i want to add n letters to the Strings
        String s = "";// initially String is empty
        for(int i=0; i<n; i++){
            //string are immutable, thats why we are getting new String each time weth characters added in to it
        	//here we are copy the string obj each time as i increases, so that orig String will be same in the memory
            s = s + (char)('A' + i);// used to add A, B C..and so on
            //updating s
            
          //   System.out.println(s);
        }
    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total test you want to see : ");
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            System.out.println("Enter first test values : ");

        int n = sc.nextInt();
        
        
        
        long startSb= System.currentTimeMillis();
        addToStringUsingStBuilder(n); // its more efficients
        long endSb = System.currentTimeMillis();
        System.out.println("Time Taken by  StringBuilder: " + (endSb - startSb));
        
        
        long start= System.currentTimeMillis();
        addToString(n);
        long end = System.currentTimeMillis();
        System.out.println("Time Taken by String : " + (end - start));
        
      
        }
        }
    }
