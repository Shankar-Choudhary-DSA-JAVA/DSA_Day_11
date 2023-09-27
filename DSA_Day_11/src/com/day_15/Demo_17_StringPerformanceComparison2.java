package com.day_15;

import java.util.Scanner;
// String vs StringBuilder
// Interesting Experiement for Speed Comparison while we add/append something to String and StringBuilder
public class Demo_17_StringPerformanceComparison2 {

  

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
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        long start= System.currentTimeMillis();
        addToString(n);
        long end = System.currentTimeMillis();
        System.out.println("Time Taken : " + (end - start));
        }
    }
