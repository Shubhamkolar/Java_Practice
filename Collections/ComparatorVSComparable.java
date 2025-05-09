package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// public class ComparatorVSComparable {

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Age: " + age;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeDescendingComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.age - s1.age;
    }
}

public class ComparatorVSComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Shubham", 24));
        students.add(new Student(1, "Ravi", 23));
        students.add(new Student(2, "Tejam", 20));

        System.out.println("Sorted by rollNo (NATURAL ORDER- COMPARABLE):");
        Collections.sort(students);
        students.forEach(System.out::println);

        System.out.println("\nSorted by name (CUSTOM ORDER - COMPARATOR):");
        students.forEach(System.out::println);

        System.out.println("\nSorted by age descending (CUSTOM ORDER  - COMPARATOR):");
        Collections.sort(students, new AgeDescendingComparator());
        students.forEach(System.out::println);
    }
}
