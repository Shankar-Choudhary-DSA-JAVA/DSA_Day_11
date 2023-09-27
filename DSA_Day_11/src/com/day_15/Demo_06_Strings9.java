package com.day_15;

public class Demo_06_Strings9 {

	public static void main(String[] args) {
	
		  String s1 = new String("Hello");
		  // using new keywords , obj will be created in normal heap and not in the string pool 
		  // Each obj will have diff address in the heap, even if the are same
		  String s2 = new String("Hello");
	        String s3 = "Hello";
	        String s4 = "Bollo";


	     	   if(s1==s2) {  // == it compares address not the values
	     		   System.out.println("S1 and S2 are equals");
	     	   }else {
	     		   System.out.println("not equals"); // this will be printed
	     	   }
	     	   
	     	   System.out.println("#####################");
	     	   if(s1.equals(s2)) { // .equals() methods compares values ot the address
	     		   System.out.println("S1 and S2 are equals");//it will compare values=objects so they are equals

	     	   }else {
	     		   System.out.println("not equals"); // this will not be printed
	     	   }
	           System.out.println("#####################");

	     	   
	     	   if(s1==s3) {  // == it compares address not the values
	     		   System.out.println("S1 and S2 are equals");
	     	   }else {
	     		   System.out.println("not equals"); // this will be printed
	     	   }
	           System.out.println("#####################");

	     	   
	     	   
//	     	        // compare two string values
	           System.out.println(s1.equals(s2)); // true, it compares values
	           System.out.println(s1.equals("Hello")); // true
	           System.out.println(s1.equals("Password"));//false

	           System.out.println("#####################");
	           
	           System.out.println(s1==s2); // false   // it compares address

	           System.out.println(s1== "Hello"); // false

	           System.out.println(s1== "Password"); // false
	           System.out.println("#####################");


System.out.println(s1.compareTo(s2));// it compares values
System.out.println(s1.compareTo(s4));// it compares values
System.out.println(s1.compareToIgnoreCase(s4));// it compares values

System.out.println("#####################");

// immutable, means string can't be modified
// but we can create the array of characters out of String

 System.out.println(s1.charAt(0));//H
	  
//char array
 ////we got copy of string inside array but actual string remains same
 char arr[] = s1.toCharArray(); //copy of string inside array but actual string remains same
 // String is array of char, and now we can modify this array char
 
 System.out.println(arr.length);
//here we copy the orig String in an array of char and then we are modifying the String values,
 //but inside memory orinial obj will be as it is, we are only changing array of char string values
 arr[0] = 'B'; //Storing B in place of H in Hello
 
 //s1[0]="y";// we cant modify string
 System.out.println(arr);//Bello
 System.out.println(s1);//Hello
 
 // we are copying String obj in to arr of char, because we can change arr of char datas/values
 
 // here we are assigning new obj to s1, this does not mean we are changing prev s1 values , because String are immutables
 
 // we are not changing String obj we are just assigning diff obj to same obj ref s1, original string obj will be as it is
 // means prev s1=Hello be Hello but now s1 will refer  Bello
 
 // we cant modify original string, we can only change the ref of original string to another Strings
 // here s1 is pointing to new obj , it does not modified the existing Strings
 s1 = new String(arr);// here we arre creating new objects out of arr=Bello and storing it in to the s1 ref var,
 // but still we will be having Hello in the memory which is ref s1, if no one refers Hello it will be finally collected by GC
 System.out.println(s1);//Bello

 System.out.println(arr.length);
 System.out.println(s1.length());
 
 // Ref var s1 will be updated with new String value, but prev string value will be as it is
 // means we cant change we only asign new obj
 
}
	}