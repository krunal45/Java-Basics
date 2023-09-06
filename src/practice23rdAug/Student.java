package practice23rdAug;

import java.util.*;

public class Student implements Comparable<Student> {
    String name;
    int score;


    @Override
    public int compareTo(Student that) {
        if (this.score > that.score)
            return 1;
        else if (this.score == that.score)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s1.score = 23;
        s2.score = 29;
        s3.score = 18;
        s4.score = 24;
        s5.score = 16;
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println("--Before Sort--");
        for (Student student : students) {
            System.out.println(student.score);
        }

    }
}