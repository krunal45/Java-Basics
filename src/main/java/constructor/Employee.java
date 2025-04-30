//Great! Here's a Java interview question focused on **constructor chaining**:
//
//---
//
//**Question:**
//Create a class called `Employee` with the following requirements:
//
//- It should have three instance variables: `name` (String), `id` (int), and `department` (String).
//- Implement **three constructors** using constructor chaining:
//  1. A default constructor that sets `name` to `"Unknown"`, `id` to `0`, and `department` to `"General"`.
//  2. A constructor that takes only `name` and `id`, and sets `department` to `"General"`.
//  3. A constructor that takes all three parameters: `name`, `id`, and `department`.
//
//Use `this()` to chain constructors appropriately.
//Also, create a method `printDetails()` to display all the employee details.
//
//Finally, in the `main` method, create objects using each constructor and print their details.

package constructor;

public class Employee {
    private String name;
    private int id;
    private String department;

    Employee() {
        this("Unknown", 0, "General");
    }

    Employee(String name, int id) {
        this(name,id,"General");
    }

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void printDetails() {
        System.out.println("name: " + this.name + " id: " + this.id + " Department: " + this.department);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Ajay", 1);
        Employee employee3 = new Employee("Bob", 2, "QA");
        employee1.printDetails();
        employee2.printDetails();
        employee3.printDetails();
    }
}