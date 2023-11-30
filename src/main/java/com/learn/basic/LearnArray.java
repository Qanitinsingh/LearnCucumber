package com.learn.basic;

public class LearnArray {

	public static void main(String[] args) {
		LearnArray.simpleArray();

	}

	static void simpleArray() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("Sum of array elements: " + sum);
	}
	
	static void twoDArray() {

		 int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }

	static void maxValueArray() {

		int[] arr = { 5, 7, 2, 10, 4 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Maximum element in array: " + max);

	}

	static void copyArray() {

		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] targetArray = new int[sourceArray.length];

		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}

		System.out.print("Copied Array: ");
		for (int num : targetArray) {
			System.out.print(num + " ");
		}
	}

	static void reverseArray() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		System.out.print("Reversed Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	static void sum2DArray () {

		  int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	        int sum = 0;

	        for (int[] row : matrix) {
	            for (int num : row) {
	                sum += num;
	            }
	        }

	        System.out.println("Sum of elements: " + sum);
	    }

}
