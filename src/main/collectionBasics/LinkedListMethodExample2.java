package main.collectionBasics;

import java.util.LinkedList;

class Student {
    String firstName, lastName, gender;
    int age, rollNo;

    Student(String firstName, String lastName, String gender, int age, int rollNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.rollNo = rollNo;
    }
}

public class LinkedListMethodExample2 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("John", "Smith", "Male", 21, 1001));
        students.add(new Student("Emma", "Johnson", "Female", 20, 1002));
        students.add(new Student("Michael", "Brown", "Male", 22, 1003));
        students.add(new Student("Olivia", "Davis", "Female", 23, 1004));
        students.add(new Student("Noah", "Miller", "Male", 19, 1005));

//        Iterating over each student
        for (Student student : students) {
            System.out.println("--"+student.firstName+"--");
            System.out.println("firstName: "+student.firstName);
            System.out.println("lastName: "+student.lastName);
            System.out.println("gender: "+student.gender);
            System.out.println("age: "+student.age);
            System.out.println("rollNo: "+student.rollNo);
        }
    }
}