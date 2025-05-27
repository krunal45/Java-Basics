package interfaces;

interface Computer{
    void code();
}

class Desktop implements Computer{

    @Override
    public void code() {
        System.out.println("Code on Desktop");
    }
}

class Laptop implements Computer{

    @Override
    public void code() {
        System.out.println("Code on Laptop");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();
        desktop.code();
        laptop.code();
    }
}
