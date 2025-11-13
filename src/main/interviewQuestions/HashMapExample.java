package main.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        System.out.println("--Before Removal--");
        menu.put("Normal Dabeli", 20);
        menu.put("Kachhi Dabeli", 25);
        menu.put("Cheese Dabeli", 30);
        menu.put("Paneer Dabeli", 35);

        for (String key : menu.keySet()) {
            System.out.println(key + " : " + menu.get(key));
        }

        menu.remove("Kachhi Dabeli", 25);
        System.out.println("--After Removal--");
        for (String key : menu.keySet()) {
            System.out.println(key + " : " + menu.get(key));
        }

        System.out.println("Kachhi Dabeli Exists ? " + menu.containsKey("Kachhi Dabeli"));
        System.out.println("Value 35 exists ? " + menu.containsValue(35));

        System.out.println("Before Replace : " + menu.get("Cheese Dabeli"));
        menu.replace("Cheese Dabeli", 40);
        System.out.println("After Replace : " + menu.get("Cheese Dabeli"));
    }
}
