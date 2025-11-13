package main.practice25Sep;
/*
Problem : 1. Caesar Cipher - It works by shifting the letters in the plaintext message by a certain number of positions, known as the “shift” or “key”.
Ex: Input = HELLO, key = 3.
Output = KHOOR (H becomes K, shifted 3 letters front)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShiftCharacter {
    static List<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    static Scanner scanner = new Scanner(System.in);

    static String shiftCharacter(String input, int shiftBy) {
        String[] output = new String[input.length()];
        output = input.split("");
        for (int i = 0; i < output.length; i++) {
            String oldChar = output[i];
            int index = alphabets.indexOf(oldChar);
            index = (index + shiftBy);
            String newChar = alphabets.get(index);
            output[i] = newChar;
        }
        return Arrays.toString(output);
    }

    static String takeInputFromUser() {
        System.out.println("Enter input");
        return scanner.next().toUpperCase();
    }

    public static void main(String[] args) {
        String input = takeInputFromUser();
        int shiftBy = 3;
        System.out.println("Input from User :" + input);
        System.out.println("After shifting each character by " + shiftBy + " digits output is : " + shiftCharacter(input, shiftBy));
    }
}
