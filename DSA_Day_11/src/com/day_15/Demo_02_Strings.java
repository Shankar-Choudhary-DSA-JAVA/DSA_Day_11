package com.day_15;

public class Demo_02_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="Hello";
String b ="Hello";


// now if I willl change a , then b will not change

//String a = "Dog";
a = "Dog";

// in memory that is in the String pool only one Hello got created, and both String will refer the same obj=Hello
// that is why Strings are immutables
//a and b both will be stored in the stack memories areas
//System.out.println(a);
System.out.println(b);

//String consider he latest and updated values=objects
System.out.println(a);
}

}
