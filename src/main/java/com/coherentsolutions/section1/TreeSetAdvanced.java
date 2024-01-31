package com.coherentsolutions.section1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAdvanced {
    public static void main(String[] args) {
        // Initialize a TreeSet
        Set<Integer> sortedNumbers = new TreeSet<>();

        // Add elements
        sortedNumbers.add(3);
        sortedNumbers.add(1);
        sortedNumbers.add(2);
        sortedNumbers.add(4);
        sortedNumbers.add(9);
        sortedNumbers.add(0);

        // Remove an element
        sortedNumbers.remove(2);

        // Check if an element exists
        boolean sortedExists = sortedNumbers.contains(3);  // should return true

        // Display the TreeSet
        System.out.println("TreeSet: " + sortedNumbers);
        System.out.println("Element 3 exists: " + sortedExists);
    }
}
