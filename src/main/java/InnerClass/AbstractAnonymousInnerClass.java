package InnerClass;

abstract class A2{
    abstract void show();
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        A2 obj = new A2() {
            @Override
            void show() {
                System.out.println("In A Show");
            }
        };
        obj.show();
    }
}