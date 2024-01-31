package com.coherentsolutions.section1;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> myHashSet = new HashSet<>();

        // Add elements
        myHashSet.add("Apple");
        myHashSet.add("Banana");
        myHashSet.add("Cherry");

        // Attempt to add a duplicate
        myHashSet.add("Apple");

        // Display the HashSet
        System.out.println("HashSet: " + myHashSet);
    }
}
