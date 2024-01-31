package com.coherentsolutions.section1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        Set<String> myTreeSet = new TreeSet<>();

        // Add elements
        myTreeSet.add("Apple");
        myTreeSet.add("Apple");
        myTreeSet.add("Cherry");
        myTreeSet.add("Banana");

        // Display the TreeSet
        System.out.println("TreeSet: " + myTreeSet);
    }
}
