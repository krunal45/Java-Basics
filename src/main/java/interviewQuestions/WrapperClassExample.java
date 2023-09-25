package interviewQuestions;

public class WrapperClassExample {
    public static void main(String[] args) {
        int num1 = 5;
        Integer num2 = num1;
        System.out.println("num 2 : " + num2);
        num1 = num2;
        System.out.println("num 1 :" + num1);

        char c1 = 'K';
        Character c2 = c1;
        System.out.println("c2 :" + c2);

        String num3 = "12";
        System.out.println(Integer.parseInt(num3) * 2);
    }
}
