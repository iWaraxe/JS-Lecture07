package com.coherentsolutions.section2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Algorithm", "A set of rules for solving a problem");
        dictionary.put("Data Structure", "A particular way of organizing data");
        Set<Map.Entry<String, String>> entries = dictionary.entrySet();
        String definition = dictionary.get("Algorithm");
        System.out.println("Dictionary: " + dictionary);
        System.out.println("Definition of Algorithm: " + definition);
    }
}
