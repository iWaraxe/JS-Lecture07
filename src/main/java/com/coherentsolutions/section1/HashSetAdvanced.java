package com.coherentsolutions.section1;

import java.util.HashSet;
import java.util.Set;

public class HashSetAdvanced {
    public static void main(String[] args) {
        // Initialize a HashSet
        Set<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);
        numbers.add(-2);
        numbers.add(10);
        numbers.add(12);
        numbers.add(20);
        numbers.add(34);
        numbers.add(42);

        // Remove an element
        numbers.remove(2);

        // Check if an element exists
        boolean exists = numbers.contains(2);  // should return true

        // Display the HashSet
        System.out.println("HashSet: " + numbers);
        System.out.println("Element 2 exists: " + exists);
    }
}
