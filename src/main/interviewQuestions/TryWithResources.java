package main.interviewQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A4 {
    int num;

    int takeInput() {
        System.out.println("Enter Number:");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Invalid input. Please enter a Number");
        }
        return num;
    }
}

public class TryWithResources {
    public static void main(String[] args)  {
        A4 obj = new A4();
        System.out.println(obj.takeInput());
    }
}