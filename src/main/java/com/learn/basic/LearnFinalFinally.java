package com.learn.basic;

public class LearnFinalFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void FinalKeywordExample() {

		final int constantValue = 10; // Using final to declare a constant variable
		// constantValue = 20; // This will cause a compilation error since
		// constantValue is final

		System.out.println("Constant value: " + constantValue);

		final StringBuilder mutableFinal = new StringBuilder("Mutable"); // Using final with an object reference
		mutableFinal.append(" String");
		System.out.println("Mutable final value: " + mutableFinal);
	}

	void FinallyBlockExample() {
		try {
			int result = 10 / 0; // This will cause an ArithmeticException
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		} finally {
			System.out.println("Finally block executed"); // This block executes regardless of exceptions
		}
	}
}
