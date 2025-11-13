package main.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int empID;
    String empName;

    Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                '}';
    }


    public int compareTo(Employee that) {
        if (this.empID > that.empID)
            return 1;
        else
            return -1;
    }
}

public class ComparatorExample2 {
    public static void main(String[] args) {
        Comparator<Employee> empIDcomparator = (employee1, employee2) -> (employee1.empID > employee2.empID) ? 1 : -1;
        Comparator<Employee> empNameComparator = (o1, o2) -> (o1.empName.charAt(0) < o2.empName.charAt(0)) ? 1 : -1;


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(100, "Jay"));
        employees.add(new Employee(23, "Enaa"));
        employees.add(new Employee(8, "Shaama"));
        System.out.println("--before sort--");
        System.out.println("Employees : " + employees);
        employees.sort(empIDcomparator);
        System.out.println("--After sort--");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("--Employee list without Name order--");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.sort(empNameComparator);
        System.out.println("--After Name sort--");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Using Comparable");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
