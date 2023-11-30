package com.learn.basic;

import java.util.ArrayList;
import java.util.List;

public class LearnIfElse {

	public static void main(String[] args) {
		LearnIfElse obj = new LearnIfElse();
		obj.ifElse();
	}

	void ifElse() {

		int number = -1;

		if (number > 0) {
			System.out.println("Number is positive");
		} else if (number < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}

	}

	void ifElseWithLoop() {
	// CURD - SQL 
		
		int [] num = {10,20,30,40,50}; 
		

		int[] numbers = { 10, 5, -3, 8, -12 };

		// Using a for loop to iterate through the array
		for (int i = 0; i < numbers.length; i++) {
			int currentNumber = numbers[i];

			// Checking conditions with if-else within the loop
			if (currentNumber > 0) {
				System.out.println(currentNumber + " is a positive number.");
			} else if (currentNumber < 0) {
				System.out.println(currentNumber + " is a negative number.");
			} else {
				System.out.println("The number is zero.");
			}
		}
	}

	void ifElseWithList() {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pineapple");

		// Using an if-else statement with List
		if (fruits.contains("Apple")) {
			System.out.println("The list contains Apple.");
		} else {
			System.out.println("The list does not contain Apple.");
		}
	}
	
	
	
}
