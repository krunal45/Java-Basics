package main.Generics;

import java.util.ArrayList;
import java.util.Arrays;

class Container<T> {
    T value;

    void show() {
        System.out.println(value.getClass().getName());
    }

    void printArray(ArrayList<?> arr) {

        for (Object x : arr) {
            System.out.println(x);
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        Container<String> obj = new Container<>();
        obj.value = "Jay";
        obj.show();
        ArrayList<String> nums = new ArrayList<>(Arrays.asList("Krunal", "Jay", "Khyati", "Bhupendra"));
        obj.printArray(nums);
    }
}
