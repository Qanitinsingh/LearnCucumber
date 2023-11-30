package com.learn.basic;

import java.util.ArrayList;

public class LearnDataTypes {

	public static void main(String[] args) {

		LearnDataTypes obj = new LearnDataTypes();

		obj.nonPrimitive();
	}

	void primitive() {

		// Integer types
		int integerNumber = 1078687679;
		byte byteNumber = 5;
		short shortNumber = 20;
		long longNumber = 1000006768768668798L;

		// Floating-point types
		float floatNumber = 10.5f;
		double doubleNumber = 2067898787;

		// Character type
		char charLetter = 'A';

		// Boolean type
		boolean isTrue = true;
		boolean isFalse = false;

	}

	void nonPrimitive() {
		String notes = LearnDatatypeNotes.nonPrimitiveDatatypes();
		System.out.println(notes);
		// Strings
		String myString = "Hello, Java!";
		
		char myStringResult = myString.charAt(0);
		System.out.println(myStringResult);
		
		String number = "10121";
		
		if (number.contains("101"))
		System.out.println("True");
		
			

		// Arrays
		int[] integerArray = { 1, 2, 3, 4, 5 };
		// Printing elements of the integer array using a for loop
		

		for (int i = 0; i < integerArray.length; i++) {
			System.out.println("Value of int array " +"\n"+integerArray[i]);
		}
//
	String[] stringArray = { "Selenium", "Appium", "WinAppDriver" };
	System.out.println(stringArray);

		for (String values : stringArray) {
			System.out.println("Output of String is  " + values);

		}

//		for (int j = 0; j <= stringArray.length; j++) {
//			System.out.println("Print string array using for loop " + j);
//
//		}
//
		// Creating a String type of arraylist
		ArrayList<String> stringList = new ArrayList<>();

		// Adding elements to the ArrayList
		stringList.add("Java");
		stringList.add("Python");
		stringList.add("DB");
		stringList.add("API's");

//		// Printing elements of the ArrayList using for loop
//		System.out.println("Elements in the ArrayList:");
//		for (String element : stringList) {
//			System.out.println(element);
//		}
//	}
//
//	void typeCasting() {
//
//		// Implicit type conversion
//		int intValue = 50;
//		double doubleValue = intValue; // Automatic conversion from int to double
//
//		// Explicit type conversion (also known as casting)
//		double myDouble = 10.75;
//		int myInt = (int) myDouble; // Casting a double to an int (truncates the decimal)
//
//		int anotherInt = 65;
//		char myChar = (char) anotherInt; // Casting an int to a char
//
	}
}
