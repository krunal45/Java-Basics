package main.interviewQuestions;

public class ReverseANumber {
    static StringBuffer reverseNumber(int number){
        String convertedNumber = Integer.toString(number);
        String[] arr1 = convertedNumber.split("");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = (arr1.length - 1); i >= 0; i--) {
            stringBuffer.append(arr1[i]);
        }
        return stringBuffer;
    }

    static StringBuffer reverseString(String string){
        String[] reversedString = string.split("");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=(reversedString.length-1);i>=0;i--){
            stringBuffer.append(reversedString[i]);
        }
        return stringBuffer;
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Reverse of "+number+" is > "+ reverseNumber(number));
        String name = "Krunal";
        System.out.println("Reverse of "+name+" is > "+ reverseString(name));
    }
}
