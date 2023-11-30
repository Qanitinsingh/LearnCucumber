package com.learn.basic;

public class LearningMethods {

	public void notreturn() {
		System.out.println("This method will not return anything");
	}

	public int returnSomthing() {

		int number = 10;
		System.out.println("This method will return anything");

		return number;
	}

	public static void callWithClassName() {

		System.out.println("This method will call without class name");
	}

	public static String callWithClassNameWithStringReturn() {

		String name = "nitin";
		System.out.println("This method will call without class name");

		// return name;
		return "nitin";

	}

	public static int[] returnMultipleValues(int rollNumber, int marks, int phone) {

		rollNumber = 101;
		marks = 80;
		phone = 8557039;

		int value[] = { rollNumber, rollNumber, phone };
		return value;

	}

	private void privateMethod() {
		System.out.println("This is a private method Can only be accessed within the class they are defined in.");
	}

	protected void protectedMethod() {
		System.out.println("This is a protected method Accessible within the same package or by subclasses.");
	}

	public final void finalMethod() {
		System.out.println("This is a final method Accessible Cannot be overridden in subclasses");
	}
}
