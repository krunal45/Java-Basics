package MapConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Entry_Example {
    public static void main(String[] args) {
        Employee krunal = new Employee("Hex-01", "Krunal", "Bhatt", 33, false, 'M');
//        MapConcept.Employee ajay = new MapConcept.Employee("Hex-02", "Ajay", "Dave", 32, false, 'M');

        Map<String, Object> expectedData = new HashMap<>();
        Object expectedKrunalData = new HashMap<>(Map.of("empoyeeId", "Hex-01", "firstName", "Krunal", "lastName", "Bhatt"
                , "age", 33, "married", false, "gender", 'M'));
        expectedData.put("Krunal", expectedKrunalData);
        Set<Map.Entry<String, Object>> entrySet = expectedData.entrySet();
//        Verifying krunal's data
        for (Map.Entry<String, Object> entry : entrySet) {
            boolean isEqual = entry.getKey().equals("Krunal") && entry.getValue().equals(expectedKrunalData);
            System.out.println("isEqual: " + isEqual);
        }
    }
}

class Employee {
    String empoyeeId;
    String firstName;
    String lastName;
    int age;
    boolean married;
    char gender;

    Employee(String empoyeeId, String firstName, String lastName, int age, boolean married, char gender) {
        this.empoyeeId = empoyeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.married = married;
        this.gender = gender;
    }
}

//Co - pilot code
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class MapConcept.Map_Entry_Example {
//    public static void main(String[] args) {
//        MapConcept.Employee krunal = new MapConcept.Employee("Hex-01", "Krunal", "Bhatt", 33, false, 'M');
//
//        Map<String, Object> expectedData = new HashMap<>();
//        Object expectedKrunalData = new HashMap<>(Map.of("empoyeeId", "Hex-01", "firstName", "Krunal", "lastName", "Bhatt"
//                , "age", 33, "married", false, "gender", 'M'));
//        expectedData.put("Krunal", expectedKrunalData);
//
//        Set<Map.Entry<String, Object>> entrySet = expectedData.entrySet();
//
//        // Verifying krunal's data
//        for (Map.Entry<String, Object> entry : entrySet) {
//            if (entry.getKey().equals("Krunal") && entry.getValue().equals(expectedKrunalData)) {
//                System.out.println("Krunal's data matches the expected data.");
//            } else {
//                System.out.println("Data does not match.");
//            }
//        }
//    }
//}
//
//class MapConcept.Employee {
//    String empoyeeId;
//    String firstName;
//    String lastName;
//    int age;
//    boolean married;
//    char gender;
//
//    MapConcept.Employee(String empoyeeId, String firstName, String lastName, int age, boolean married, char gender) {
//        this.empoyeeId = empoyeeId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.married = married;
//        this.gender = gender;
//    }
//}
