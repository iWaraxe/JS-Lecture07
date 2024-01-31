package com.coherentsolutions.section3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapModification {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        System.out.println(scores);

        Iterator<Map.Entry<String, Integer>> it = scores.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if ("Alice".equals(entry.getKey())) {
                it.remove();
            }
        }
        System.out.println(scores);
    }
}
