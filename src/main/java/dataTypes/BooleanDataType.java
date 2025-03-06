package dataTypes;

public class BooleanDataType {
    public static void main(String[] args) {
//        declaring variable.
        boolean a;
//        initializing variable
        a=false;
        System.out.println("a is: "+a);
        a=true;
        System.out.println("a is: "+a);

        if (a)
            System.out.println("This is Executed");

        a=false;
        if (a)
            System.out.println("This is not Executed");

        System.out.println("1>2: "+(1>2));
    }
}
