package com.coherentsolutions.section2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> sortedScores = new TreeMap<>(Comparator.comparing(String::toString,String::compareToIgnoreCase));
        sortedScores.put("Charlie", 88);
        sortedScores.put("alice", 90);
        sortedScores.put("Bob", 85);
        System.out.println("TreeMap Scores: " + sortedScores);
    }
}
