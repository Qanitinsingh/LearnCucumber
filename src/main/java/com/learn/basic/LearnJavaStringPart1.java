package com.learn.basic;

public class LearnJavaStringPart1 {

	public static void main(String[] args) {
		// Creating a String
		String greeting = "Hello, World!";

		// Concatenating Strings
		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + " " + lastName;
		System.out.println("Full Name: " + fullName);

		// Finding the Length of a String

		String message = "Java is fun!";
		int length = message.length();
		System.out.println("Length of the string: " + length);

		// Accessing Characters in a String
		String text = "Example";
		char firstChar = text.charAt(0);
		char lastChar = text.charAt(text.length() - 1);
		System.out.println("First Character: " + firstChar);
		System.out.println("Last Character: " + lastChar);

		// Checking for Substring Presence

		String sentence = "Java programming is fun";
		String word = "programming";
		boolean containsWord = sentence.contains(word);
		System.out.println("Does the sentence contain 'programming'? " + containsWord);

	}

}
