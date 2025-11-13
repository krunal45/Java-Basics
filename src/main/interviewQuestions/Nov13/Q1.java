package main.interviewQuestions.Nov13;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
//        Problem Statement:
//        [1,2] > 12
        char[] name = {'A','J','A','Y'};
        String output = "";
        System.out.println("Input: "+ Arrays.toString(name));
// Logic
        for (int i = 0; i < name.length; i++) {
            output = output + name[i];
        }
//Output or Solution
        System.out.println("Output: "+output);
    }
}
