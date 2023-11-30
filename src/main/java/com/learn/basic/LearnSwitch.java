package com.learn.basic;

public class LearnSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void switchLearn() {
		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			System.out.print("Number " + number + " is a ");

			switch (number) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			default:
				System.out.println("Not a valid number");
			}
		}
	}
}
