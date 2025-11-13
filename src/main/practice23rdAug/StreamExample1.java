package main.practice23rdAug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        p1.setName("Ajay");
        p1.setGender("Male");
        p1.setAge(35);
        p2.setName("Alka");
        p2.setGender("Female");
        p2.setAge(31);
        p3.setName("Bob");
        p3.setGender("Male");
        p3.setAge(32);
        p4.setName("Faruk");
        p4.setGender("Male");
        p4.setAge(31);
        p5.setName("Arav");
        p5.setGender("Male");
        p5.setAge(40);
        p6.setName("Khyati");
        p6.setGender("Female");
        p6.setAge(32);

        List<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
        System.out.println("--Before Filtering--");
        personList.forEach(person -> System.out.println("Name :" + person.getName() + "\n" + "Gender :" + person.getGender() + "\n" + "Age :" + person.getAge()));
        personList = personList.stream().filter(person -> (person.getGender().equals("Male") && person.getAge() > 30))
                .collect(Collectors.toList());
        System.out.println("--Individuals who are Male and who's age > 30--");
        personList.forEach(person -> System.out.println("Name :" + person.getName() + "\n" + "Gender :" + person.getGender() + "\n" + "Age :" + person.getAge()));

        int avg;
        List<Person> finalPersonList = personList;
        int count = finalPersonList.size();
        System.out.println("Count :"+count);
        avg = (int) personList.stream().mapToInt((Person::getAge)).average().orElse(0);
        System.out.println("--Average Age : " + avg);
    }
}
