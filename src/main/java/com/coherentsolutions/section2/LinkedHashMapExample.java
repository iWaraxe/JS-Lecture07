package com.coherentsolutions.section2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> orderedScores = new LinkedHashMap<>();
        orderedScores.put("Bob", 85);
        orderedScores.put("Charlie", 88);
        orderedScores.put("Alice", 90);
        System.out.println("LinkedHashMap Scores: " + orderedScores);
    }
}
