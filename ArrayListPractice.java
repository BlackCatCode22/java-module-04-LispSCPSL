// TD 09/24/2024
// ArrayListPractice

import java.awt.image.TileObserver;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        System.out.println("\n\nWelcome to ArrayList Practice!\n\n");


        // Create an ArrayList of Strings
        ArrayList<String> myListOfStrings = new ArrayList<>();


        // Add a few elements to my ArrayList.
        myListOfStrings.add("First");
        myListOfStrings.add("Second");
        myListOfStrings.add("Third");


        // Output our ArrayList
        System.out.println("myListOfStrings is: " + myListOfStrings + "\n");


        // Remove the first element.
        myListOfStrings.remove(0);

        // Output our ArrayList
        System.out.println("\nAfter removing First string...");
        System.out.println("myListOfArray is: " + myListOfStrings);


        // Remove the third element.
        myListOfStrings.remove("Third");

        // Output our ArrayList
        System.out.println("\nAfter removing Third string...");
        System.out.println("myListOfArray is: " + myListOfStrings);


        // Use a "for loop" to add some things to our list
        String toAdd = "";
        for (int i=0; i<20; i++) {
            toAdd = toAdd + "a..." + Integer.toString(i);
            myListOfStrings.add(toAdd);
        }


        // Output our ArrayList
        System.out.println("\nAfter adding a 'for loop' method...");
        System.out.println("myListOfArray is: " + myListOfStrings);


        // Use a "for loop" to output each element of our ArrayList
        for (int i=0; i<myListOfStrings.size(); i++) {
            System.out.println("An element in my list is: " + myListOfStrings.get(i));
        }



    }
}