package programming.basics;

public class DatatypeTypecasting {

	public static void main(String[] args) {
		// Implicit typecasting (Widening Conversion)
		int myInt = 100;
		long myLong = myInt; // Implicitly cast int to long

		System.out.println("Implicit typecasting:");
		System.out.println("myInt: " + myInt);
		System.out.println("myLong: " + myLong);

		// Explicit typecasting (Narrowing Conversion)
		double myDouble = 3.14;
		int myNewInt = (int) myDouble; // Explicitly cast double to int

		System.out.println("Explicit typecasting:");
		System.out.println("myDouble: " + myDouble);
		System.out.println("myNewInt: " + myNewInt);
	}
}
