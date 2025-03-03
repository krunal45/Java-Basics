package LinkedList;

public class Example2 {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(String data){
        Node node = new Node(data);
        //If linked list is yet not created then head should be null.
        if (head==null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    void addLast(String data){
        Node node = new Node(data);
        //If linked list is yet not created then head should be null.
        if (head==null){
            head = node;
        }

        Node currentNode = node;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    void printList(){

        if (head==null){
            System.out.println("Linked List is Empty!");
        }

        Node currentNode = head;
        while (currentNode.next!=null){
            System.out.print(currentNode.data+" > \t");
            currentNode = currentNode.next;
        }

        System.out.print(currentNode.next+" > ");
        System.out.print("Null");
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.addFirst("I");
        obj.addFirst(" Am");
        obj.addLast(" Boy!");
        obj.printList();
    }
}
