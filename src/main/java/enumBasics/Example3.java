package enumBasics;

enum smartPhones{
    iphone(200),samsungGalaxy(220),motorola(240);

    private int price;

    smartPhones(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Example3 {
    public static void main(String[] args) {
        smartPhones[] smartPhones = enumBasics.smartPhones.values();
        for (smartPhones smartPhone:smartPhones)
            System.out.println(smartPhone+" : "+smartPhone.getPrice());
//        Updating Price
        smartPhones motorola = enumBasics.smartPhones.motorola;
        motorola.setPrice(211);
        System.out.println("--Updated Motorola Price: "+motorola.getPrice());
    }
}
