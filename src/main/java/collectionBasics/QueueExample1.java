package collectionBasics;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample1 {
    Queue<String> names;
    String name;

    QueueExample1(Queue<String> names,String name) {
        this.names = names;
        this.name = name;
    }

    static void printQueueElements(Queue<String> queue) {
        queue.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> queue1 = new LinkedList<>(List.of("Ajay", "Charlie"));

        //Add Elements to the queue
        queue.offer("Ajay");
        queue.offer("Bob");
        queue.offer("Charlie");

        //Print Elements
        printQueueElements(queue);

        //Display first Element without removing it
        System.out.println("First Element > " + queue.peek());

        //Remove Element
        System.out.println("Removed > " + queue.poll());

        //Print Elements after removal
        printQueueElements(queue);

        //Addind element using add method
        boolean elementAdded = queue.add("Ajay");
        System.out.println("Added Element > " + elementAdded);

        //Fetching queue Head using element()
        String queueHead = queue.element();
        System.out.println("Queue Head > " + queueHead);

        //Remove queueHead using remove()
        queueHead = queue.remove();
        System.out.println("Removed > " + queueHead);

        //Remove specific element from queue if it exists!
        boolean elementRemoved = queue.remove("Bob");
        System.out.println("Removed > " + elementRemoved);

        //Checking if element is present in queue
        boolean isElementPresent = queue.contains("Ajay");
        System.out.println("Is Element Present > " + isElementPresent);

        //Comparing 2 queues
        boolean areAllElementsPresent = queue.containsAll(queue1);
        System.out.println("areAllElementsPresent > " + areAllElementsPresent);

        QueueExample1 obj1 = new QueueExample1(new LinkedList<>(List.of("Charlie","Ajay")),"Krunal");
        boolean isDataEqual = queue.equals(obj1.names);
        System.out.println(isDataEqual);

        System.out.println(obj1.names);
        System.out.println(obj1.name);
    }
}
