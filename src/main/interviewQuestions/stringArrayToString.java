package main.interviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class stringArrayToString {

    public static void main(String[] args) {

//        String[] arr = {"t", "r", "v"};
//        String join = String.join("|", arr);
//        System.out.println(join);

        String join1 = Arrays.asList("t", "r", "y", "i", "n", "g").stream().collect(Collectors.joining("|"));
        System.out.println(join1);
        System.out.println(joinString(";", "k", "r", "u", "n", "a", "l"));
    }

    public static String joinString(String seperator, String... val) {
        StringBuilder stringBuilder = new StringBuilder();
        int end = 0;

        for (String s : val) {
            if (s != null) {
                stringBuilder.append(s);
                end = stringBuilder.length();
                stringBuilder.append(seperator);
            }
        }
        return stringBuilder.substring(0, end);
    }
}
