/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s01;

/**
 * S01 - Program to insert new element into an existing array.
 *
 * @author Le Khanh Dang - CE180954 07/01/2025
 */
public class S01 {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        IO io = new IO();
        // TODO code application logic here
        // Get the size of the array from the user.
        int arraySize = io.getIntegerSize("Please enter size of array: ");
        
        // Initialize ArrayOperations with the given array size.
        ArrayOperations ArrayOps = new ArrayOperations(arraySize);
        
        // Input elements into the array.
        ArrayOps.inputElements();
        
         // Display the array after sorting.
        System.out.println("The array after sorting:");
        //Print array to screen
        ArrayOps.display();
        
        // Add a new element to the array.
        int newElement = io.getInteger("Please enter new value: ");
        //Add a new element to the array
        ArrayOps.addNewElement(newElement);
        
        // Display the updated array.
        System.out.println("New array:");
        //Print array to screen
        ArrayOps.display();
    }
}
