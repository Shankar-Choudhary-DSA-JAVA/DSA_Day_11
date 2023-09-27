package com.day_15;

public class Demo_04_Strings5 {

	public static void main(String[] args) {
	
		  String s1 = new String("Hello");
		  // using new keywords , obj will be created in normal heap and not in the string pool 
		  // Each obj will have diff address in the heap, even if the are same
		  String s2 = new String("Hello");
		  String s3 = new String("Hello");

	     	   if(s1==s2) {  // == it compares address not the values
	     		   System.out.println("S1 and S2 are equals");
	     	   }else {
	     		   System.out.println("not equals"); // this will be printed
	     	   }
}
	}