/*
Question:

Create a Java class named Employee that keeps track of the total number of employees created. Implement the following:

A private static variable employeeCount to store the total number of employees.

A constructor that increments employeeCount each time a new Employee object is instantiated.

A public static method getEmployeeCount() that returns the current value of employeeCount.

In the main method, create three instances of the Employee class and print the total number of employees using the
getEmployeeCount() method.
 */
package staticKeyWordExamples;

public class Employee {
    static int employeeCount = 0;
    String name,gender,department;
    int age;

    Employee(String name,int age,String gender,String department){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        employeeCount ++;
    }

    static int getEmployeeCount(){
        return employeeCount;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employee anyaSharma = new Employee("Anya Sharma",32 , "Female", "Marketing");
        Employee kenjiTanaka = new Employee("Kenji Tanaka", 45, "Male", "Engineering");
        Employee priyaPatel = new Employee("Priya Patel", 28, "Female", "Human Resources");

        System.out.println("Employee Count > "+getEmployeeCount());
        //Printing the Employee Details
        System.out.println("Name > "+anyaSharma.getName());
        System.out.println("Age > "+anyaSharma.getAge());
        System.out.println("Gender > "+anyaSharma.getGender());
        System.out.println("Department > "+anyaSharma.getDepartment());
    }
}