import arrayBasics.OneDimensionalArray;
import arrayBasics.ThreeDimensionalArray;
import arrayBasics.TwoDimensionalArray;
import objectBasics.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();
//        employee1.setEmployeeName("Krunal");
//        employee1.setEmployeeJobDesignation("QA");
//        employee1.setEmployeeAge(31);
//        employee1.setEmployeeMarried(false);
//        System.out.println("-----------");
//        System.out.println("Employee Name :" + employee1.getEmployeeName());
//        System.out.println("Employee Designation :" + employee1.getEmployeeJobDesignation());
//        System.out.println("Employee Age :" + employee1.getEmployeeAge());
//        System.out.println("Employee married :" + employee1.isEmployeeMarried());
//        System.out.println("-----------");
//
//        System.out.println("-----Employee 2------");
//        System.out.println("Employee2 Name :" + employee2.getEmployeeName());
//        System.out.println("-----------");

//        Array -- 2 Dimensional Array

//        TwoDimensionalArray employeeList = new TwoDimensionalArray();
//        employeeList.employeeList[0][0] = "Designation";
//        employeeList.employeeList[0][1] = "Name";
//        employeeList.employeeList[1][0] = "QA";
//        employeeList.employeeList[1][1] = "KB";
//        employeeList.employeeList[2][0] = "DEV";
//        employeeList.employeeList[2][1] = "KA";
//        employeeList.setEmpoyeeList(employeeList.employeeList);
//        System.out.println("------");
//        System.out.println(Arrays.deepToString(employeeList.getEmployeeList()));


//    Array -- 1 Dimensional Array
//        OneDimensionalArray employeesObj = new OneDimensionalArray();
//        employeesObj.employees[0] = "Krunal";
//        employeesObj.employees[1] = "Jitu";
//        employeesObj.employees[2] = "Deepa";
//        employeesObj.setEmployees(employeesObj.employees);
//        System.out.println(Arrays.toString(employeesObj.getEmployees()));


//    Array -- 3 Dimensional Array
        ThreeDimensionalArray coordi = new ThreeDimensionalArray();
        coordi.coordinates[0][0][0] = 5;
        coordi.coordinates[0][0][1] = 7;
        coordi.coordinates[0][0][2] = 9;
        coordi.coordinates[0][1][0] = 15;
        coordi.coordinates[0][1][1] = 17;
        coordi.coordinates[0][1][2] = 19;
        coordi.coordinates[0][2][0] = 25;
        coordi.coordinates[0][2][1] = 27;
        coordi.coordinates[0][2][2] = 29;
//        coordi.coordinates[1][0][0] = 1;
//        coordi.coordinates[1][0][1] = 2;
//        coordi.coordinates[1][0][2] = 3;
//        coordi.coordinates[1][1][0] = 11;
//        coordi.coordinates[1][1][1] = 22;
//        coordi.coordinates[1][1][2] = 23;
//        coordi.coordinates[1][2][0] = 1;
//        coordi.coordinates[1][2][1] = 2;
//        coordi.coordinates[1][2][2] = 3;
//        coordi.coordinates[2][0][0] = 4;
//        coordi.coordinates[2][0][1] = 5;
//        coordi.coordinates[2][0][2] = 6;
//        coordi.coordinates[2][1][0] = 4;
//        coordi.coordinates[2][1][1] = 5;
//        coordi.coordinates[2][1][2] = 6;
//        coordi.coordinates[2][2][0] = 4;
//        coordi.coordinates[2][2][1] = 5;
//        coordi.coordinates[2][2][2] = 6;
        coordi.setCoordinates(coordi.coordinates);
        System.out.println(Arrays.deepToString(coordi.getCoordinates()));
    }
}