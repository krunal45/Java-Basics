package enumBasics;

public class EnumClassDemo {
    enum pens {
        ss(2), rotomac(5), parker(100), addGel(20);

        private int price;

        pens(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        pens pen = pens.ss;
        System.out.println(pen + " : " + pen.getPrice());

        System.out.println("---setting Price---");
        pen.setPrice(3);
        System.out.println(pen + " : " + pen.getPrice());

        for (pens pensPrice : pens.values()) {
            System.out.println(pensPrice + " : " + pensPrice.getPrice());
        }
    }
}