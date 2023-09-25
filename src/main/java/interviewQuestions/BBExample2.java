package interviewQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class BBExample2 {
    public static void main(String[] args) {
        HashMap<String, Integer> itemList = new HashMap<>();
        itemList.put("Burger", 25);
        itemList.put("Pitza", 50);
        itemList.put("Vadapaw", 35);
        itemList.put("Dabeli", 50);
        itemList.put("Burger 12", 25);
        itemList.put("Pitza 12", 50);
        itemList.put("Vadapaw12", 35);
        itemList.put("Dabeli 32", 50);
        itemList.put("Vadapaw 33", 35);
        itemList.put("Dabeli 31", 50);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your order : ");
        String item = scanner.nextLine();
        System.out.println(itemList.get(item));
    }
}
