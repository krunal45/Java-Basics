/*
Sure! Here’s an intermediate-level question regarding the Java Stream API:

### Question:

You are given a list of `Employee` objects, where each `Employee` has the following attributes:

- `id` (Integer)
- `name` (String)
- `department` (String)
- `salary` (Double)

Your task is to write a method that processes this list of employees using the Stream API to achieve the following:

1. **Filter** the employees who have a salary greater than a specified amount (e.g., 50,000).
2. **Group** the filtered employees by their department.
3. For each department, calculate the **average salary** of the employees in that department.
4. Finally, collect the results into a `Map<String, Double>` where the key is the department name and the value is the average salary of the employees in that department.

### Explanation:

1. **Filtering**: You'll need to use the `filter` method of the Stream API to select only those employees whose salary exceeds the specified threshold. This requires a lambda expression that checks the salary condition.

2. **Grouping**: After filtering, you'll use the `collect` method along with `Collectors.groupingBy()` to group the remaining employees by their department. This will create a map where each key is a department name, and the value is a list of employees belonging to that department.

3. **Calculating Average Salary**: For each group (department), you'll need to calculate the average salary. You can use `Collectors.averagingDouble()` in conjunction with the grouping operation to achieve this.

4. **Result Collection**: The final result should be collected into a `Map<String, Double>`, which you can achieve by combining the grouping and averaging steps in your collect operation.

### Considerations:

- Ensure that your solution handles potential cases, such as departments with no employees exceeding the salary threshold (e.g., the average salary for that department should not appear in the result).
- Think about how to manage potential null values in the Employee attributes.

This task will help you practice your skills with the Stream API, particularly with filtering, grouping, and collecting results. Good luck!
 */
package Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("--Before Filter--");
        for (Employee employee : Employee.getEmployeeList())
            System.out.println(" id:" + employee.id + "\n Name:" + employee.name + "\n Department:" + employee.department + "\n Salary:" + employee.salary);
        System.out.println("--After Filter--");
        List<Employee> employeeList = Employee.getEmployeeList();
        Map<String, Double> employeesWithAverageSalary = new HashMap<>();

        employeeList = employeeList.stream().filter((employee -> employee.salary > 50000)).toList();

        for (String department : new String[]{"HR", "IT", "FINANCE", "SALES"}) {
            double averageSalary = employeeList.stream().filter(employee -> employee.department.equalsIgnoreCase(department))
                    .mapToDouble(employee -> employee.salary).average().orElse(0.0);

            employeesWithAverageSalary.put(department.toUpperCase(), averageSalary);
        }
        employeesWithAverageSalary.forEach((k, v) -> System.out.println("Department: " + k + " Salary:" + v));
    }
}
