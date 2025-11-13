package main.LinkedList_Implementation;

import java.util.LinkedList;

//This is implementation of 'Linked List' as per 'Apna College' channel.
public class LL {
//    Node head;
//    private int nodeSize;
//
//    LL() {
//        this.nodeSize = 0;
//    }
//
//    class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//            nodeSize++;
//        }
//    }
//
//    void addFirst(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            newNode.next = head;
//            head = newNode;
//        }
//    }
//
//    void addLast(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        } else {
//            Node currentNode = head;
//            while (currentNode.next != null) {
//                currentNode = currentNode.next;
//            }
//
//            currentNode.next = newNode;
//        }
//    }
//
//    void printList() {
//        if (head == null) {
//            System.out.println("List is Empty!");
//        }
//
//        Node currentNode = head;
//        while (currentNode != null) {
//            System.out.print(currentNode.data + " -> ");
//            currentNode = currentNode.next;
//        }
//
//        System.out.print("NULL \n");
//    }
//
//    void deleteFirst() {
//        if (head == null) {
//            System.out.println("List is Empty!");
//        } else {
//            nodeSize--;
//            head = head.next;
//        }
//    }
//
//    void deleteLast() {
//        if (head == null) {
//            System.out.println("List is Empty!");
//        } else {
//            nodeSize --;
//            if (head.next == null) {
//                head = null;
//            }
//
//            Node secondLastNode = head;
//            Node lastNode = head.next;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//                secondLastNode = secondLastNode.next;
//            }
//            secondLastNode.next = null;
//        }
//    }
//
//    void printSize(){
//        System.out.println("Node Size > "+nodeSize);
//    }

    public static void main(String[] args) {
//        LL list = new LL();
//        list.addFirst(1);
//        list.addFirst(0);
//        list.addLast(2);
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
//        list.printSize();
//
//        list.addFirst(0);
//        list.printList();
//        list.printSize();

        //Actual Linked List Implementation
        LinkedList<Character> list1 = new LinkedList<>();
        list1.addFirst('C');
        list1.addFirst('B');
        list1.addFirst('A');
        list1.addLast('D');
        char head = list1.remove();
        int size = list1.size();
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" > ");
        }
        System.out.println("Head > "+head);
        System.out.println("Node Size > "+size);
    }
}