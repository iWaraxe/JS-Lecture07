package com.coherentsolutions.section2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 88);
        int aliceScore = scores.get("Alice");
        System.out.println("HashMap Scores: " + scores);
        System.out.println("Alice's Score: " + aliceScore);
    }
}

