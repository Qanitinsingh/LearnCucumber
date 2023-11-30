package com.learn.basic;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	void simpleArrayList() {

		  ArrayList<String> fruits = new ArrayList<>();

	        // Adding elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");

	        // Accessing elements using index
	        System.out.println("Fruit at index 1: " + fruits.get(1));

	        // Iterating through the ArrayList
	        System.out.println("All fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
	
	void removeArrayList() {

		   ArrayList<Integer> numbers = new ArrayList<>();

	        // Adding elements to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        System.out.println("Original list: " + numbers);

	        // Removing elements from ArrayList
	        numbers.remove(2); // Remove element at index 2

	        System.out.println("List after removing element at index 2: " + numbers);

	        // Removing specific element by value
	        numbers.remove(Integer.valueOf(20)); // Remove value 20

	        System.out.println("List after removing value 20: " + numbers);
	    }
	
	
	void findElementInArrayList() {

		 ArrayList<String> colors = new ArrayList<>();

	        // Adding elements to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Check if an element exists in the ArrayList
	        String colorToFind = "Green";
	        if (colors.contains(colorToFind)) {
	            System.out.println(colorToFind + " is present in the list.");
	        } else {
	            System.out.println(colorToFind + " is not present in the list.");
	        }

	        // Find the index of an element
	        int index = colors.indexOf("Blue");
	        if (index != -1) {
	            System.out.println("Index of Blue: " + index);
	        } else {
	            System.out.println("Blue is not present in the list.");
	        }
	    }
}
