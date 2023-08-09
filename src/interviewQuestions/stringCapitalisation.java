package interviewQuestions;

public class stringCapitalisation {
    public static void main(String[] args) {
        System.out.println(capitalize("krunal bhatt"));
    }

    public static String capitalize(String str) {
        String[] words = str.split("\\s");//krunal bhatt
        String x1 = "", x2 = "", res = "";

        for (String s : words) {
            x1 = s.substring(0, 1).toUpperCase();
            x2 = s.substring(1);
            res = res + x1 + x2 + " ";
        }

        return (res).trim();
    }
}
