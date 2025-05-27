
//### 🧠 **Problem Statement: Coffee Shop Order System**
//
//You are building a simple coffee shop order system. The shop offers the following drink sizes:
//
//- SMALL
//- MEDIUM
//- LARGE
//
//Each size has a different price:
//
//- SMALL: \$2.50
//- MEDIUM: \$3.50
//- LARGE: \$4.50
//
//Your task is to:
//
//1. Define an `enum` called `DrinkSize` with the values `SMALL`, `MEDIUM`, and `LARGE`.
//2. Write a method `getPrice(DrinkSize size)` that uses a **switch-case** to return the price of the drink based on its size.
//3. In the `main` method, ask the user to input a drink size (as a string), convert it to the corresponding `DrinkSize` enum,
// and print the price.
//
//---
//
//### 💡 Example Output:
//
//```
//Enter drink size (SMALL, MEDIUM, LARGE): MEDIUM
//Price: $3.5

package enumBasics.Questions;

import java.util.Scanner;

enum DrinkSize{
    SMALL,MEDIUM,LARGE;

    public float getPrice(){
        switch (this){
            case SMALL -> {
                return 2.50F;
            }
            case LARGE -> {
                return 4.50F;
            }
            case MEDIUM -> {
                return 3.50F;
            }
            default -> {
                return 0.0F;
            }
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String size;
        System.out.println("Please Enter Drink Size 1.SMALL 2.MEDIUM 3.LARGE");
        size = input.next();
        try{
            DrinkSize drinkSize = DrinkSize.valueOf(size);
            System.out.println(size+" : "+drinkSize.getPrice());
        }catch (Exception e){
            System.out.println("Invalid Drink Entered!");
        }
    }
}