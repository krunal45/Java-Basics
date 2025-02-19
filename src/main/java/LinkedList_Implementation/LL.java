package LinkedList;

//This is implementation of 'Linked List' as per 'Apna College' channel.
public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        Node currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
        }

        currentNode = newNode;
    }

    void printList() {
        if (head == null) {
            System.out.println("List is Empty!");
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(2);
        list.printList();
    }
}