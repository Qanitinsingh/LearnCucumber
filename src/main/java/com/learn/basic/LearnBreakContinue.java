package com.learn.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LearnBreakContinue {

	public static void main(String[] args) {

	}

	void learnContinue() {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("Skipping iteration at i = " + i);
				continue; // Skipping the rest of the loop body for i = 3
			}
			System.out.println("Current value of i: " + i);
		}
	}

	void learnBreakUsingArrayList() {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Eva");

		// Using ListIterator and break statement to exit the loop
		ListIterator<String> iterator = names.listIterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("Current name: " + name);

			// Check if the name is "Charlie"; break the loop if found
			if (name.equals("Charlie")) {
				System.out.println("Found Charlie. Exiting the loop.");
				break;
			}
		}
	}
}
