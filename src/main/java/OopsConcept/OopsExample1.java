package OopsConcept;

class Pen{
    String colour,type;

    void printColour(){
        System.out.println("Colour > "+this.colour);
    }

    void printType(){
        System.out.println("Type > "+this.type);
    }

    void write(String name){
        System.out.println("My name is: "+name);
    }
}

class Student{
    String name;
    int age;

    Student(){

    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    void printInfo(String name, int age){
        System.out.println("Name > "+name);
        System.out.println("Age > "+age);
    }

    void printInfo(String name){
        System.out.println("Name > "+name);
    }

    void printInfo(int age){
        System.out.println("age > "+age);
    }
}

public class OopsExample1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Red";
        pen1.type = "GelPen";

        pen1.write("Krunal");
        pen1.printColour();
        pen1.printType();

        Pen pen2 = new Pen();
        pen2.colour = "Blue";
        pen2.type = "BolPoint";

        pen2.write("Jiten");
        pen2.printColour();
        pen2.printType();

        Student student1 = new Student("Ajay",21);
        student1.printInfo(student1.name);

        Student student2 = new Student(student1);
        student2.printInfo(student2.age);
        student2.printInfo(student2.name, student2.age);//This example of method overload is known as 'compile Time' polymorphism.
    }

}
