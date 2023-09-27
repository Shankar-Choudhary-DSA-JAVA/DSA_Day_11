package com.day_15;

public class Demo_02_Strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="Hello";
String b ="Hello";

// in memory that is in the String pool only one Hello got created, and both String will refer the same obj=Hello
// that is why Strings are immutables
//a and b both will be stored in the stack memories areas
System.out.println(a);
System.out.println(b);
}

}
