package staticKeyWordExamples;

public class Example1 {
    private static int staticCount = 0;
    private int instanceCount = 0;

    Example1(){
        staticCount ++;
        instanceCount ++;
    }

    static int getStaticCount(){
        return staticCount;
    }

    int getInstanceCount(){
        return instanceCount;
    }

    public static void main(String[] args) {
        Example1 obj1 = new Example1();
        Example1 obj2 = new Example1();
        Example1 obj3 = new Example1();

        System.out.println("Static Count > "+getStaticCount());
        System.out.println("Instance Count > "+obj3.getInstanceCount());
    }
}
