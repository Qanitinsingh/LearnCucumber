package learn.java;

public class DatatypeExample {

	public static void main(String[] args) {
        // Integer
        int number = 10;
        System.out.println("Integer: " + number);

        // Double
        double pi = 3.14159;
        System.out.println("Double: " + pi);

        // Boolean
        boolean isTrue = true;
        System.out.println("Boolean: " + isTrue);

        // Character
        char grade = 'A';
        System.out.println("Character: " + grade);

        // String
        String name = "John Doe";
        System.out.println("String: " + name);

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Object
        Object obj = new Object();
        System.out.println("Object: " + obj);

        // Float
        float temperature = 25.5f;
        System.out.println("Float: " + temperature);

        // Long
        long population = 1000000L;
        System.out.println("Long: " + population);

        // Byte
        byte data = 127;
        System.out.println("Byte: " + data);

        // Short
        short year = 2023;
        System.out.println("Short: " + year);

        // Enum
        Days today = Days.MONDAY;
        System.out.println("Enum: " + today);
    }

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
