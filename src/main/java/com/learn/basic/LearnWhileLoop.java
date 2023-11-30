package com.learn.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void simpleWhileLoop() {

		int i = 1;

		// While loop to print numbers from 1 to 5
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
	}

	void whileLoopWithBreak() {

		int i = 1;

		// While loop to print numbers from 1 to 5
		while (i <= 5) {
			System.out.println(i);
			if (i == 3)
				break;
			i++;

		}
	}

	void whileLoopWithContinue() {

		int i = 1;

		// While loop to print numbers from 1 to 5
		while (i <= 5) {
			System.out.println(i);
			if (i == 3)
				continue;
			i++;

		}
	}

	void whileLoopWithList() {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);

		// Using a while loop to iterate through the ArrayList
		int index = 0;
		while (index < intList.size()) {
			System.out.println(intList.get(index));
			index++;
		}
	}

	void whileLoopWithSet() {
		Set<String> stringSet = new HashSet<>();
		stringSet.add("Test");
		stringSet.add("Dev");
		stringSet.add("Devops");
		stringSet.add("Business");

		// Using a while loop to iterate through the Set using an Iterator
		Iterator<String> iterator = stringSet.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
