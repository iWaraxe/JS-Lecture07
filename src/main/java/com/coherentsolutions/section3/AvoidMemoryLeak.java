package com.coherentsolutions.section3;

import java.util.HashSet;

public class AvoidMemoryLeak {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        Object obj1 = new Object();
        Object obj2 = new Object();

        set.add(obj1);
        set.add(obj2);

        System.out.println(set);
        // Object no longer needed
        set.remove(obj1);
        System.out.println(set);
    }
}

