package main.interviewQuestions;

public class BBExample1 {
    public static void main(String[] args) {
        String name = "My Name is Krunal";
        String[] names = name.split("\\s");

        for (String n : names) {
            for (int i = n.length() - 1; i >= 0; i--) {
                System.out.print(n.charAt(i));
            }
            System.out.println();
        }
    }
}
