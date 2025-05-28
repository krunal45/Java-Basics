//**Question:**
//
//You are given a class `Student` with the following attributes:
//
//- `String name`
//- `int marks`
//
//Your task is to:
//
//1. Implement the `Comparable<Student>` interface in the `Student` class.
//2. Sort a list of students in **descending order of marks**. If two students have the same marks, sort them in **ascending order of names**.
//
//Write the complete `Student` class and a main method that:
//- Creates a list of at least 5 students with different names and marks.
//- Sorts the list using `Collections.sort()`.
//- Prints the sorted list.

package Comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        if (marks > o.getMarks())
            return -1;
        else if (marks == o.getMarks()) {
            return this.name.compareTo(o.getName());
        } else
            return 1;
    }

}

public class Example1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setName("Alice");
        student1.setMarks(85);

        student2.setName("Bob");
        student2.setMarks(92);

        student3.setName("Charlie");
        student3.setMarks(85);

        student4.setName("Diana");
        student4.setMarks(78);

        student5.setName("Ethan");
        student5.setMarks(92);

        List<Student> students = new LinkedList<>(List.of(student1, student2, student3, student4, student5));
        System.out.println("--Before Sorting--");
        students.forEach(student -> System.out.println(student.getName() + " : " + student.getMarks()));
        System.out.println("--After Sorting--");
        Collections.sort(students);
        students.forEach(student -> System.out.println(student.getName() + " : " + student.getMarks()));
    }
}