package dataTypes;

public class Typecasting {

    boolean areNumbersEqual(int number1,byte number2){
        return (number1 == number2);
    }

    boolean areNumbersEqual(int number1,double number2){
        return (number1 == number2);
    }

    boolean areNumbersEqual(byte number1,double number2){
        return (number1 == number2);
    }

    public static void main(String[] args) {
//        int > byte conversion
        int number1 = 128;
        byte number2;
        number2 = (byte) number1;//typecasting int dataType to byte.
        Typecasting instance1 = new Typecasting();
        System.out.println("Is number1 == number2 ? "+instance1.areNumbersEqual(number1,number2));

//        double > int conversion
        double pi = 3.141414;
        int number3;
        number3 = (int) pi;//typecasting double dataType to int.
        Typecasting instance2 = new Typecasting();
        System.out.println("Is number1 == number2 ? "+instance2.areNumbersEqual(number3,pi));

//        double > byte conversion
        byte number4;
        number4 = (byte) pi;//typecasting double dataType to byte.
        Typecasting instance3 = new Typecasting();
        System.out.println("Is number1 == number2 ? "+instance3.areNumbersEqual(number4,pi));
    }
}
