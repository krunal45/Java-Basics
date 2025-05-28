////### 🧠 **Question:**
////Write a Java program that uses a **lambda expression** to sort a list of `Person` objects by their **age** in **ascending order**.
////
////#### 💡 Requirements:
////- Create a `Person` class with `name` and `age` fields.
////- Create a list of at least 5 `Person` objects.
////- Use a lambda expression with `Collections.sort()` or `List.sort()` to sort the list by age.
////- Print the list before and after sorting.
//
//package lambda.Questions;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//class Person  {
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int compare(Person o1, Person o2) {
//        if (o1.getAge() < o1.getAge())
//            return -1;
//        else if (o1.getAge() == o2.getAge()) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }
//}
//
//public class Question1 implements Comparator{
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.setName("Ajay");
//        person1.setAge(12);
//
//        Person person2 = new Person();
//        person2.setName("Adam");
//        person2.setAge(11);
//
//        Person person3 = new Person();
//        person3.setName("Bobby");
//        person3.setAge(13);
//
//        Person person4 = new Person();
//        person4.setName("Bob");
//        person4.setAge(15);
//
//        Person person5 = new Person();
//        person5.setName("Carry");
//        person5.setAge(17);
//
//        List<Person> personList = new ArrayList<>(List.of(person1, person2, person3, person4, person5));
//        System.out.println("--Before sort--");
//        personList.forEach(person -> System.out.println(person.getName() + " : " + person.getAge()));
//    }
//
//
//}
