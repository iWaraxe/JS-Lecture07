package com.coherentsolutions.section2;

import java.util.HashMap;
import java.util.Map;

class Student {
    String id;
    String name;

    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

public class CustomKeyExample {
    public static void main(String[] args) {
        Map<Student, Integer> grades = new HashMap<>();
        Student alice = new Student("1", "Alice");
        System.out.println(alice);
        Student bob = new Student("2", "Bob");
        System.out.println(bob);
        Student bob2 = new Student("2", "Bobby");
        System.out.println(bob2);

        grades.put(alice, 90);
        grades.put(bob, 85);
        grades.put(bob2, 89);
        System.out.println("Grades: " + grades.size());
        System.out.println(grades);
    }
}
