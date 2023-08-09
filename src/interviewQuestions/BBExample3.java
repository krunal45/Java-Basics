package interviewQuestions;

public class BBExample3 {
    public static void main(String[] args) {
        String s1 = "Krunal";
        String s2 = "Automation Engineer";
        int s2Len = s2.length();
        int s2LenS1LenDiff = s2Len - s1.length();

        for (int i = 0; i < s2LenS1LenDiff; i++) {
            s1 = s1 + " ";
        }
        String str1[] = s1.split("");
        String str2[] = s2.split("");

        for (int i = 0; i < str1.length; i++) {
            String res = str1[i] + str2[i];
            System.out.print(res);
        }
    }
}
