package main.interviewQuestions;

public class ConstructorExample {
    String name;
    int age;

    ConstructorExample() {
        name = "Krunal";
        age = 32;
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
        System.out.println("Name : " + obj.name + " Age: " + obj.age);
    }
}
