package dataTypes;

import java.util.Scanner;

public class ByteDataTypeExample implements Comparable<Byte> {
//    Declaring variable
    byte age;

//    Sets the age.
    void setAge(Byte age) {
        this.age = age;
    }

//    Fetches the age.
    byte getAge() {
        return this.age;
    }

    public static void main(String[] args) {
//        Taking input from user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        //Creating instance of Class.
        ByteDataTypeExample obj1 = new ByteDataTypeExample();
//        Setting Age.
        obj1.setAge(input.nextByte());

//        Printing Age.
        System.out.println("Age: " + obj1.getAge());

        int flag = obj1.compareTo((byte) 1);
        switch (flag){
            case -1:
                System.out.println("Age1 < Age2");
                break;
            case 0:
                System.out.println("Age1 == Age2");
                break;
            case 1:
                System.out.println("Age1 > Age2");
        }

    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */
    @Override
    public int compareTo(Byte o) {
        if (this.age < o)
            return -1;
        else if (this.age == o)
            return 0;
        else
            return 1;
    }
}
