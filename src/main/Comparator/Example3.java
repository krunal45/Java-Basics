// sort 'Student' objects based on age.
package main.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Example3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("Ajay");
        student1.setAge(24);

        student2.setName("Adam");
        student2.setAge(22);

        student3.setName("Bob");
        student3.setAge(26);

        List<Student> students = new ArrayList<>(List.of(student1, student2, student3));
        System.out.println("--Before Sorting--");
        students.forEach(student -> System.out.println(student.getName() + " : " + student.getAge()));

        System.out.println("Sorting based on student's Age");
        Comparator<Student> studentComparator = (o1, o2) -> (o1.getAge() > o2.getAge()) ? 1 : -1;
        students.sort(studentComparator);
        students.forEach(student -> System.out.println(student.getName() + " : " + student.getAge()));
    }
}