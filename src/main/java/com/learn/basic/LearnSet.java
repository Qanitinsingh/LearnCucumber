package com.learn.basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
	static void hashSet () {

		 Set<String> linkedHashSet = new LinkedHashSet<>();

	        // Adding elements
	        linkedHashSet.add("Apple");
	        linkedHashSet.add("Banana");
	        linkedHashSet.add("Orange");

	        // Printing elements (maintains insertion order)
	        System.out.println("LinkedHashSet Elements: " + linkedHashSet);

	        // Check if an element exists
	        boolean containsApple = linkedHashSet.contains("Apple");
	        System.out.println("Contains 'Apple': " + containsApple);

	        // Removing an element
	        linkedHashSet.remove("Orange");
	        System.out.println("LinkedHashSet Elements after removal: " + linkedHashSet);
	    }
	
	

	static void sortHashSet () {

		 Set<Integer> sortedUniqueSet = new TreeSet<>();

	        // Add elements to the set (may include duplicates)
	        sortedUniqueSet.add(5);
	        sortedUniqueSet.add(2);
	        sortedUniqueSet.add(8);
	        sortedUniqueSet.add(2);
	        sortedUniqueSet.add(5);

	        // Print the initial set (may contain duplicates)
	        System.out.println("Initial Set (may contain duplicates): " + sortedUniqueSet);

	        // Print the sorted unique elements
	        System.out.println("Sorted Unique Elements: " + sortedUniqueSet);
	    }
}
