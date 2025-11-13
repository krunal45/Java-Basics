package main.Vectors;

import java.util.Arrays;
import java.util.Vector;

public class MethodsExample {
    public static void main(String[] args) {
        Vector<Character> alphabets = new Vector<>();
        Character[] characterArray = new Character[10];
//        default Capacity
        int capacity = alphabets.capacity();
        System.out.println("Default Capacity :" + capacity);
//        initial Size
        int size = alphabets.size();
        System.out.println("Initial Size: " + size);
        //        ensureCapacity(int size) > sets the minimum capacity of the vector to size.
        alphabets.ensureCapacity(2);
        System.out.println("Minimum capacity > " + alphabets.capacity());
//        Adding Elements > Insertion order is maintained.
        alphabets.addElement('D');
        alphabets.addElement('A');
        alphabets.addElement('B');
        alphabets.addElement('C');
        alphabets.addElement('B');
        System.out.println(alphabets);
//        contains() > Verifies if element is present or not
        boolean flag = alphabets.contains('E');
        String status = (flag) ? "Element Present" : "Element not Present";
        System.out.println(status);
//        copyInto(Object array[]) > copies vector elements into the specified array
        alphabets.copyInto(characterArray);
        System.out.println("characterArray > " + Arrays.toString(characterArray));
//        Object elementAt(int index) > Returns the object specified at the index.
        Character character = alphabets.elementAt(0);
        System.out.println("Character at index 0 > " + character);
//      Object firstElement() > Returns the first Element in the vector.
        Character firstElement = alphabets.firstElement();
        System.out.println("firstElement > "+firstElement);
//        Object lastElement() > Returns the last Element in the vector.
        Character lastElement = alphabets.lastElement();
        System.out.println("lastElement > "+lastElement);
//        int indexOf(Object element) > Returns the index of first Occurence of element. If the object is not in the vector -1 is returned.
        int firstOccurenceOfB = alphabets.indexOf('B');
        System.out.println("firstOccurenceOfB > "+firstOccurenceOfB);
        int firstOccurenceOfE = alphabets.indexOf('E');
        System.out.println("firstOccurenceOfE > "+firstOccurenceOfE);
        int bPresent = alphabets.indexOf('B', 2);
        System.out.println("B present between index 2 - 4 ? "+bPresent);
//        Inserting character 'E' at index 1
        alphabets.insertElementAt('E', 1);
        System.out.println(alphabets);
//        Verifying if vector is empty
        flag = alphabets.isEmpty();
        System.out.println("is Alphabets Empty ? "+flag);
//        last Occurence of character 'B'
        int lastOccurence = alphabets.lastIndexOf('B');
        System.out.println("lastOccurence of B > "+lastOccurence);
        lastOccurence = alphabets.lastIndexOf('B', 3);
        System.out.println("lastOccurence of B > "+lastOccurence);
//        remove character 'B'
        flag = alphabets.removeElement('B');
        System.out.println("Removed character B ? "+flag);
//      remove character 'F'
        flag = alphabets.removeElement('F');
        System.out.println("Removed character F ? "+flag);
//        remove character at index 1
        alphabets.removeElementAt(1);
        System.out.println(alphabets);
//        sets Element at specified index
        alphabets.setElementAt('F', 1);
        System.out.println(alphabets);
        size = alphabets.size();
        System.out.println("Current vector size: "+size);
//        setting vector size:
        alphabets.setSize(6);
        size = alphabets.size();
        System.out.println("Modified vector size: "+size);
        System.out.println(alphabets);
//      trimToSize > Reduce vector size to the number of elements it holds.
        alphabets.trimToSize();
        System.out.println("alphabets size: "+alphabets.size());
    }
}
