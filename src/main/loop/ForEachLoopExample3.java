package main.loop;

class Student {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ForEachLoopExample3 {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ajay");
        s1.setAge(21);

        Student s2 = new Student();
        s2.setName("Adam");
        s2.setAge(23);

        Student s3 = new Student();
        s3.setName("Adam");
        s3.setAge(23);

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for (Student student : students) {
            System.out.println(student.name + ": " + student.age);
        }

    }

}
