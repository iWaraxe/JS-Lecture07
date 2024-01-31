package com.coherentsolutions.section1;

import java.util.HashSet;
import java.util.Set;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age; // 31 * i == (i << 5) - i
        return result;
    }
}

public class CustomObjectSet {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 40));
        people.add(new Person("Alice", 30));

        System.out.println("Number of unique people: " + people.size());
    }
}
