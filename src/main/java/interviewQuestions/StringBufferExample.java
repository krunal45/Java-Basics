package interviewQuestions;

public class StringBufferExample {
    public static void main(String[] args) {
        String name = "Krunal";
        String surName = " Bhatt";
        String fname = name.concat(surName);
        System.out.println(fname);

        StringBuffer stringBuffer = new StringBuffer(name);
        StringBuffer sb = new StringBuffer("KRunal bhatt");
        stringBuffer.append(surName);
        System.out.println(stringBuffer);
        int cap = stringBuffer.capacity();
        System.out.println(cap);
        char c =stringBuffer.charAt(0);
        System.out.println(c);
        int i = stringBuffer.compareTo(sb);
        System.out.println(i);
        stringBuffer.delete(0, 7);
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();

    }
}
