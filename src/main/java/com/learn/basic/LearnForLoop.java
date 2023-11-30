package com.learn.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void simpleForLoop() {

		String text = "Hello";

		// Iterating through the characters of the String using a for loop
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			System.out.println(character);
		}

	}

	void forLoopWithStringArray() {

		String[] stringArray = { "Automation", "Security", "BDD", "TDD" };

		// Iterating through the String array using a for loop
		for (String str : stringArray) {
			System.out.println(str);
		}
	}

	void forLoopWithArrayList() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		// Iterating through the array list using a for loop
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}

	void forLoopWithMap() {

		Map<String, Integer> sampleMap = new HashMap<>();
		sampleMap.put("One", 1);
		sampleMap.put("Two", 2);
		sampleMap.put("Three", 3);

		// Iterating through the map using a for loop
		for (Map.Entry<String, Integer> entry : sampleMap.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}

	void forLoopwith2DArray() {

		int[][] twoDArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Iterating through the 2D array using nested for loops
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println(); // Move to the next line after each row
		}

	}
}
