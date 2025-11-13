package main.interviewQuestions;

public class swapStrings {
    public static void main(String[] args) {
        String x1 = "Rajkkkot";
        String x2 = "Kjdjjdjdjdj";
        int l1 = x1.length();
        System.out.println(" --- Before Swap --- ");
        System.out.println("x1 : " + x1);
        System.out.println("x2 : " + x2);
        x1 = x1 + x2;//"joytoy"
        x2 = x1 + x2;
        x1 = x1.substring(l1);
        x2 = x2.substring(0, l1);
        System.out.println(" --- After Swap --- ");
        System.out.println("x1 : " + x1);
        System.out.println("x2 : " + x2);
    }
}
