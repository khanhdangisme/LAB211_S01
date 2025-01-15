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
public class ArrayOperations {
    IO io = new IO();
    // Declare the array to store elements.
    private int array[];
    // Track the current index for inserting elements.
    private int index = 0;

    /**
     * Constructor to initialize the array with a given size.
     *
     * @param size The initial size of the array.
     */
    public ArrayOperations(int size) {
        // Initialize the array with the specified size.
        array = new int[size];
    }

    /**
     * Adds a new element to the array while maintaining sorted order. Expands
     * the array if it is full.
     *
     * @param data The element to be added.
     */
    public void addNewElement(int data) {
        
        //If the index is equal to or greater than the length of the array, a new array will be created to hold the additional element.
        if (index >= array.length) {
            // Create a new array with one extra slot.
            int[] newArray = new int[array.length + 1];
            
            //The for line copies the old array to the new array.
            for (int i = 0; i < array.length; i++) {
                //get old array and assign to new array
                newArray[i] = array[i];
            }
            // Replace the old array with the new array.
            array = newArray;
        }
        
        // Start from the last occupied position.
        int i = index - 1;
        // Shift larger elements to the right.
        while (i >= 0 && array[i] < data) {
            //Move element at position i to i + 1
            array[i + 1] = array[i];
            //Reduce index
            i--;
        }
        
        //add an element to the end of the array
        array[i + 1] = data;
        // Increment the index for the next insertion.
        index++;
    }

    /**
     * Prompts the user to input elements into the array. Each input is added to
     * the array while maintaining sorted order.
     */
    public void inputElements() {
        // Loop through the array size.
        for (int i = 0; i < array.length; i++) {
            // Prompt for user input and Input data management.
            int element = io.getInteger("Enter element[" + i + "]: ");
            // Add the input element to the array.
            addNewElement(element);
        }
    }

    /**
     * Displays all elements in the array.
     */
    public void display() {
        // Iterate through the array.
        for (int i : array) {
            // Print each element.
            System.out.print(i + " ");
        }
        // Print a new line after displaying all elements.
        System.out.println();
    }
}
