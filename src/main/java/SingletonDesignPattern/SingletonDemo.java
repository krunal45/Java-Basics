package SingletonDesignPattern;

class Singleton {

    private static Singleton instance1;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance1 == null){
            instance1 = new Singleton();
        }
        return instance1;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonDemo{
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();
    }
}