package objectBasics;

public class Employee {
    String employeeName,employeeJobDesignation;
    int employeeAge;
    boolean employeeMarried;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeJobDesignation() {
        return employeeJobDesignation;
    }

    public void setEmployeeJobDesignation(String employeeJobDesignation) {
        this.employeeJobDesignation = employeeJobDesignation;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public boolean isEmployeeMarried() {
        return employeeMarried;
    }

    public void setEmployeeMarried(boolean employeeMarried) {
        this.employeeMarried = employeeMarried;
    }
}
