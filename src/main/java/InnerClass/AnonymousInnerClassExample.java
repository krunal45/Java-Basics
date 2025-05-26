package InnerClass;

class A1{
    void show(){
        System.out.println("In A show");
    }
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        A1 obj = new A1(){
            @Override
            void show(){
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}