package com.coherentsolutions.section3;

import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);

        boolean isSubset = set1.containsAll(set2);
        System.out.println("Is set2 a subset of set1? " + isSubset);
    }
}
