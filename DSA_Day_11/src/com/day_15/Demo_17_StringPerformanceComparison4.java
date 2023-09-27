package com.day_15;

import java.util.Scanner;
// String vs StringBuilder
// Interesting Experiement for Speed Comparison while we add/append something to String and StringBuilder
public class Demo_17_StringPerformanceComparison4 {

  

    static void addToStringUsingStBuilder(int n){//i want to add n letters to the Strings
    	
    	
StringBuilder sb =new StringBuilder();        
        
        for(int i=0; i<n; i++){
            sb.append((char) 'A' +i);// used to add A, B C..and so on
            //adding to sb
            
          //   System.out.println(sb);
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
        
                }
        }
    }
