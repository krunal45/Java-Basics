/*
Question:
Consider two sets, set1 and set2, both containing integer elements.
Write a Java code snippet to find the intersection of these two sets.
Ensure that the resulting set contains unique elements that are common to both set1 and set2.
 */
package Set;

import java.util.HashSet;
import java.util.Set;

public class Example3 {

    static Set<Integer> getUniqueSetElements(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        System.out.println("Common Elements between set1 and set2 are :" + getUniqueSetElements(set1, set2));
    }
}
