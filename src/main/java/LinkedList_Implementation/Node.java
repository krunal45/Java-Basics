package LinkedList_Implementation;

// In this code will do implementation of Node Logic
public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        //Link nodes together
        node1.next = node2;
        node2.next = node3;

        Node current = node1;
        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
