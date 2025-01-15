/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s01;

import java.util.Scanner;

/**
 * S01 - Program to insert new element into an existing array.
 *
 * @author Le Khanh Dang - CE180954 07/01/2025
 */
public class IO {
    Scanner sc = new Scanner(System.in);

    /**
    * Prompts the user to enter a positive integer.
    * Repeats until a valid input is provided.
    *
    * @param msg The message displayed to the user.
    * @return The valid positive integer entered by the user.
    */
    public int getIntegerSize(String msg) {
        int n;
        while (true) {
            // Create a string to notify the user.
            System.out.print(msg);
            //Enter string
            String s = sc.nextLine();
            try {
                //convert string to integer
                n = Integer.parseInt(s);
                if (n <= 0) {
                    // Throw exception if input is non-positive.
                    throw new IllegalArgumentException();
                }
                return n;
            } catch (NumberFormatException e) {
                // Handle invalid number format.
                System.out.println("You must enter an integer!");
            } catch (IllegalArgumentException e) {
                // If a negative number is entered, catch the exception, 
                // print an error message, and prompt the user to try again.
                System.out.println("You must enter a non-negative integer!");
            }
        }
    }
    
    /**
    * Prompts the user to enter an integer.
    * Repeats until a valid integer is provided.
    *
    * @param msg The message displayed to the user.
    * @return The valid integer entered by the user.
    */
    public int getInteger(String msg) {
        int n;
        while (true) {
            // Create a string to notify the user.
            System.out.print(msg);
            //Enter string
            String s = sc.nextLine();
            try {
                //convert string to integer
                n = Integer.parseInt(s);
                return n;
            } catch (NumberFormatException e) {
                // Handle invalid number format.
                System.out.println("You must enter an integer!");
            } 
        }
    }   
}
