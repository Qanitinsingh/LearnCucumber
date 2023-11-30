package com.learn.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LearnDoWhile{

    public static void main(String[] args) {
       
    }
    
    
    void firstExample() {
    	
    	 int count = 0;

         // A simple do-while loop
         do {
             System.out.println("Count is: " + count);
             count++;
         } while (count < 5);
         
         System.out.println("Loop finished.");
    }
    void DoWhileStringExample () {
    	
    	 Scanner scanner = new Scanner(System.in);
         String input;

         do {
             System.out.println("Please enter a string (or 'exit' to quit):");
             input = scanner.nextLine();
             
             // Perform actions based on the string input, if needed
             if (!input.equalsIgnoreCase("exit")) {
                 System.out.println("You entered: " + input);
             }
         } while (!input.equalsIgnoreCase("exit"));

         System.out.println("Loop finished.");
         scanner.close();
     }
    
    
    void DoWhileListExample ()
    {
    	
    	  Scanner scanner = new Scanner(System.in);
          List<String> fruits = new ArrayList<>();
          String input;

          // Adding some initial fruits to the list
          fruits.add("Test");
          fruits.add("Dev");
          fruits.add("Devops");

          do {
              // Displaying the list contents
              System.out.println("Current list of dept: " + fruits);
              System.out.println("Enter a dept to add (or 'exit' to quit):");
              input = scanner.nextLine();

              // Check if the input is not 'exit' and add it to the list
              if (!input.equalsIgnoreCase("exit")) {
                  fruits.add(input);
              }
          } while (!input.equalsIgnoreCase("exit"));

          System.out.println("Final list of dept: " + fruits);
          System.out.println("Loop finished.");
          scanner.close();
      }
    }


