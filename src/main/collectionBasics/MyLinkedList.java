package main.collectionBasics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

        public static void printLinkedlistData(Node node) {
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Node firstNode = list.new Node(100);
        Node secondNode = list.new Node(200);
        Node thirdNode = list.new Node(300);
        Node fourthNode = list.new Node(400);
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;
        List<Node> nodeList = new LinkedList<>(Arrays.asList(firstNode, secondNode, thirdNode, fourthNode));

        for (Node node : nodeList) {
            Node.printLinkedlistData(node);
        }
    }
}
