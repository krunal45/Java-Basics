package objectBasics;

import java.util.Objects;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Student object1 = new Student("Ajay",21);
        System.out.println(object1);

        Student object2 = new Student("Ajay",21);
        System.out.println(object2);

//        Verifying if both objects are equal
        System.out.println("Are both objects same ? "+object1.equals(object2));
    }
}