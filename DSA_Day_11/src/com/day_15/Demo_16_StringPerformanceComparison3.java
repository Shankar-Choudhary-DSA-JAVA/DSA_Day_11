package com.day_15;

import java.util.Scanner;
// String vs StringBuilder
// Interesting Experiement for Speed Comparison while we add/append something to String and StringBuilder
public class Demo_16_StringPerformanceComparison3 {

    static void addToStringUsingSB(int n){//i want to add n letters to the StringsBuilder
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            //string are immutable
            sb.append((char)('A' + i));
            // System.out.println(s);
        }
    }

    static void addToString(int n){//i want to add n letters to the Strings
        String s = "";// initially String is empty
        for(int i=0; i<n; i++){
            //string are immutable
            s = s + (char)('A' + i);// used to add A, B C..and so on
            // System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int n = sc.nextInt();

            long start = System.currentTimeMillis();
            addToStringUsingSB(n);
            long end = System.currentTimeMillis();
            System.out.println("String Builder  " + (end - start));

            start = System.currentTimeMillis();
            addToString(n);
            end = System.currentTimeMillis();
            System.out.println("String " + (end - start));
        }
    }
}