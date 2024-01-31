package com.coherentsolutions.section3;

public class CustomHashCode {
    static class Student {
        String id;
        String name;

        // Overriding hashCode
        @Override
        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            return result;
        }

        // Overriding equals
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student other = (Student) obj;
            return id != null ? id.equals(other.id) : other.id == null;
        }
    }

    public static void main(String[] args) {
        // Here you can demonstrate the use of the Student class.
    }
}
