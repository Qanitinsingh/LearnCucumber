package com.learn.basic;

public class LearnJavaOperators {
// operators in Java perform mathematical operations

	public static void main(String[] args) {

	}

	void arithmetic() {
		int a = 10;
		int b = 5;

		int sum = a + b; // Addition
		int difference = a - b; // Subtraction
		int product = a * b; // Multiplication
		int quotient = a / b; // Division
		int remainder = a % b; // Modulus

		System.out.println("Sum: " + sum); // Output: 15
		System.out.println("Difference: " + difference); // Output: 5
		System.out.println("Product: " + product); // Output: 50
		System.out.println("Quotient: " + quotient); // Output: 2
		System.out.println("Remainder: " + remainder); // Output: 0

	}

	void assignment() {

		int num = 10;

		num += 5; // Equivalent to num = num + 5;
		System.out.println("After += operator: " + num); // Output: 15

		num -= 3; // Equivalent to num = num - 3;
		System.out.println("After -= operator: " + num); // Output: 12

		num *= 2; // Equivalent to num = num * 2;
		System.out.println("After *= operator: " + num); // Output: 24

		num /= 4; // Equivalent to num = num / 4;
		System.out.println("After /= operator: " + num); // Output: 6

		num %= 5; // Equivalent to num = num % 5;
		System.out.println("After %= operator: " + num); // Output: 1

		num &= 3; // Equivalent to num = num & 3;
		System.out.println("After &= operator: " + num); // Output: 1

		num |= 8; // Equivalent to num = num | 8;
		System.out.println("After |= operator: " + num); // Output: 9

		num ^= 6; // Equivalent to num = num ^ 6;
		System.out.println("After ^= operator: " + num); // Output: 15

		num <<= 2; // Equivalent to num = num << 2;
		System.out.println("After <<= operator: " + num); // Output: 60

		num >>= 3; // Equivalent to num = num >> 3;
		System.out.println("After >>= operator: " + num); // Output: 7

		num >>>= 1; // Equivalent to num = num >>> 1;
		System.out.println("After >>>= operator: " + num); // Output: 3

	}

	void comparison() {
		int a = 10;
		int b = 5;

		boolean isEqual = a == b; // Equal to
		boolean isNotEqual = a != b; // Not equal to
		boolean greaterThan = a > b; // Greater than
		boolean lessThan = a < b; // Less than
		boolean greaterOrEqual = a >= b; // Greater than or equal to
		boolean lessOrEqual = a <= b; // Less than or equal to

		System.out.println("Is a equal to b? " + isEqual); // Output: false
		System.out.println("Is a not equal to b? " + isNotEqual); // Output: true
		System.out.println("Is a greater than b? " + greaterThan); // Output: true
		System.out.println("Is a less than b? " + lessThan); // Output: false
		System.out.println("Is a greater than or equal to b? " + greaterOrEqual); // Output: true
		System.out.println("Is a less than or equal to b? " + lessOrEqual); // Output: false

	}

	void bitwise() {
		int num1 = 5; // Binary: 101
		int num2 = 3; // Binary: 011

		int bitwiseAnd = num1 & num2; // Bitwise AND
		int bitwiseOr = num1 | num2; // Bitwise OR
		int bitwiseXor = num1 ^ num2; // Bitwise XOR
		int bitwiseComplementNum1 = ~num1; // Bitwise Complement
		int leftShift = num1 << 1; // Left shift by 1
		int rightShift = num1 >> 1; // Right shift by 1

		System.out.println("Bitwise AND: " + bitwiseAnd); // Output: 1 (Binary: 001)
		System.out.println("Bitwise OR: " + bitwiseOr); // Output: 7 (Binary: 111)
		System.out.println("Bitwise XOR: " + bitwiseXor); // Output: 6 (Binary: 110)
		System.out.println("Bitwise Complement of num1: " + bitwiseComplementNum1); // Output: -6
		System.out.println("Left Shift of num1: " + leftShift); // Output: 10 (Binary: 1010)
		System.out.println("Right Shift of num1: " + rightShift); // Output: 2 (Binary: 10)

	}

	void incrementAndDecrement() {
		int counter = 5;

		System.out.println("Initial value of counter: " + counter);

		counter++; // Increment by 1
		System.out.println("After incrementing, counter is now: " + counter);

		counter--; // Decrement by 1
		System.out.println("After decrementing, counter is now: " + counter);

	}

	void ternary() {
		int x = 10;
		int y = 5;

		// Using the ternary operator to assign a value based on a condition
		int result = (x > y) ? x : y;

		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
		System.out.println("Result using the ternary operator: " + result);

	}

	void InstanceofOperator() {
		Object obj = new String("Hello");
		boolean isString = obj instanceof String; // Check if obj is an instance of String

	}

	void ConditionalOperator() {
		int x = 10, y = 5;
		int result = (x > y) ? x : y; // Ternary operator

		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
		System.out.println("Result using the ternary operator: " + result);

	}

	void typecastOperator() {
		double doubleValue = 10.5;
		int intValue = (int) doubleValue; // Type cast double to int

		System.out.println("Double value: " + doubleValue);
		System.out.println("Int value after type casting: " + intValue);

	}
}
