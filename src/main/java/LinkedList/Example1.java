/*
Absolutely! Let's test your understanding of traversing a linked list in Java. Here's the question:

We have a simple SinglyLinkedList class with a Node class representing each element.
Each Node has data and a pointer to the next node. Write a function called `printList` that takes the head of the SinglyLinkedList
 as input and iterates through the entire list, printing the data of each node.

**Hint:** You'll need a loop to keep track of your current position in the list.
Make sure the loop terminates when it reaches the end of the list (i.e., the current node's next pointer is null).

 */
package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Example1 {

    void printList(LinkedList<String> nameList) {
        nameList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Ajay", "Babu", "Carrie", "David"));
        Example1 obj = new Example1();
        obj.printList(names);
    }
}