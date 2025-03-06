package dataTypes;

public class CharacterDataType {
    public static void main(String[] args) {
//        Declaring Variables
        char ch1, ch2;

//        Assigning ascci Values
        int asCiiCodeForQ = 'Q';
        int asCiiCodeForA = 'A';
        System.out.println("asCiiCodeForQ: " + asCiiCodeForQ);
        System.out.println("asCiiCodeForA: " + asCiiCodeForA);

        ch1 = (char) asCiiCodeForQ;
        ch2 = (char) asCiiCodeForA;
        System.out.print(ch1+""+ch2+"\n");
        System.out.println(ch1+ch2);
        System.out.println(ch1+" ");
    }
}
