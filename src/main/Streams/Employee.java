package main.Streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    String department;
    double salary;
    static List<Employee> employeeList = new ArrayList<>();

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    static Employee createEmployee(int id, String name, String department, double salary) {
        return new Employee(id, name, department, salary);
    }

    static List<Employee> getEmployeeList(){
        Employee e1 = createEmployee(1, "Ajay", "HR", 15000);
        Employee e2 = createEmployee(2, "Alice", "HR", 50000);
        Employee e3 = createEmployee(3, "Bob", "IT", 70000);
        Employee e4 = createEmployee(4, "Charlie", "IT", 16000);
        Employee e5 = createEmployee(5, "Diana", "Finance", 55000);
        Employee e6 = createEmployee(6, "Ethan", "Finance", 45000);
        Employee e7 = createEmployee(7, "Fiona", "IT", 50000);
        Employee e8 = createEmployee(8, "George", "HR", 65000);
        Employee e9 = createEmployee(9, "Hannah", "Sales", 75000);
        Employee e10 = createEmployee(10, "Ian", "Sales", 30000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e8);
        employeeList.add(e9);
        employeeList.add(e10);
        return employeeList;
    }
}
