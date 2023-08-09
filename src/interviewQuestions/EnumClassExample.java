package interviewQuestions;

enum Laptops {
    HP(200), MAC(300), Dell(400);
    private int price;

    Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClassExample {
    public static void main(String[] args) {
        Laptops laptop = Laptops.HP;
        System.out.println("Laptop : " + laptop + "  Price :" + laptop.getPrice());
        Laptops.MAC.setPrice(350);
        System.out.println("Laptop :" + Laptops.MAC + " Price :" + Laptops.MAC.getPrice());
    }
}
