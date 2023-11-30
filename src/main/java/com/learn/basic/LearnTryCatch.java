package com.learn.basic;

import java.util.ArrayList;

import com.learn.basic1.FirstDemoClass;

public class LearnTryCatch {

	public static void main(String[] args) {

		LearnTryCatch.sum();
		LearnTryCatch.delete();
	}

	public static void sum() {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (java.lang.ArithmeticException e) {
			System.out.println("Some exception in this method" + e);
		}

	}

	public static void delete() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		int a = 23;
		int b = 33;
		int c = a + b;
		System.out.println(c);

	}

}
