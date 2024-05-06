/*
Imagine you're creating a shopping list application. You want to store a list of items the user adds, but you also want to avoid duplicates.

Which Java Collection class would be most suitable for this scenario, and why?
 */
package experiments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Experiment2 {

    Set<String> addItem(String items) {
        String[] item = items.split(",");
        Arrays.sort(item);
        return new HashSet<>(Set.of(item));
    }

    public static void main(String[] args) {
        String itemList = "Bananas, carrots, eggs, lean chicken breasts, milk, olive oil, potatoes, spinach, whole-wheat bread, brown rice";
        Experiment2 obj = new Experiment2();
        obj.addItem(itemList).forEach((item) -> System.out.println(item.trim()));
    }
}
