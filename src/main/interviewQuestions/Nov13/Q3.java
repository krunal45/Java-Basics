package main.interviewQuestions.Nov13;
//PS: Explain briefly 'string' vs 'stringBuffer' vs 'stringBuilder'
public class Q3 {
    public static void main(String[] args) {
//        1. 'strings' are immute + able.
         String s1 = "ab";// This will create an object inside heap memory:string Constant Pool. Inside 'Stack' memory 's1' object reference will be created.
        String s2 = "ab";
        System.out.println(s1 == s2);
//        Below command will create 2 objects in heap Memory. 1. String + Constant + Pool & 2. inside heap
         String obj1 = new String("abc");
         String res = obj1.intern();
//         Check if string already exists in SCP.
        boolean stringExistsInSCP = (res == s1);
        if (stringExistsInSCP){
            System.out.println("String already exists in SCP");
        }else {
            System.out.println("String do not exist in SCP");
        }
        System.out.println(s2 == obj1);
    }
}
