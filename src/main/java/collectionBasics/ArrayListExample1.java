package collectionBasics;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
//        Create an arrayList
        ArrayList<Character> characterArrayList = new ArrayList<>();
        System.out.println("Initial Size: " + characterArrayList.size());
        characterArrayList.add('C');
        characterArrayList.add('A');
        characterArrayList.add('E');
        characterArrayList.add('B');
        characterArrayList.add('D');
        characterArrayList.add('F');
        characterArrayList.add(1, 'G');
        System.out.println("Size of " + characterArrayList + " after addition: " + characterArrayList.size());
        System.out.println("Contents of characterArrayList: " + characterArrayList);
        characterArrayList.remove(Character.valueOf('A'));
        characterArrayList.remove(Character.valueOf('G'));
        System.out.println("Size after Deletion: : " + characterArrayList.size());
        System.out.println("Contents of characterArrayList: " + characterArrayList);

//        Making sure arrayList is of certain size.
//        The `ensureCapacity( int minCapacity)`method in `ArrayList`is used to increase the capacity of the `ArrayList`
//        instance to ensure it can hold at least the number of elements specified by the `minCapacity`parameter.This can
//        help improve performance by reducing the number of incremental reallocations needed as elements are added to the `
//        ArrayList`.
//
//        In your code, `characterArrayList.ensureCapacity(10);`ensures that the `ArrayList`can hold at least 10
//        elements without needing to resize.This is useful if you know in advance that the list will grow to a certain
//        size, as it can help avoid multiple resizing operations.
//        characterArrayList.ensureCapacity(10);
        System.out.println("New Capacity: " + characterArrayList.size());
        characterArrayList.add(0, 'A');
        characterArrayList.add(1, 'G');
        characterArrayList.add(2, 'H');
        characterArrayList.add(3, 'I');
        characterArrayList.add(4, 'J');
        characterArrayList.add(5, 'K');
        System.out.println("characterArrayList > " + characterArrayList);
        System.out.println("New Capacity: " + characterArrayList.size());
    }
}