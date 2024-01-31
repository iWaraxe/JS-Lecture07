package com.coherentsolutions.section2;

import java.util.HashMap;
import java.util.Map;

public class OverwriteValue {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Alice", 95);
        System.out.println("Grades: " + grades);
    }
}
