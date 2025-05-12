package Arrays.OneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArrayExample1 {
    public static void main(String[] args) {
//        Method 1
//        String[] days_of_week = new String[7];//Array declaration
//        System.out.println("Default Array Value while Array is declared: " + Arrays.toString(days_of_week));
//        days_of_week[0] = "Sunday";
//        days_of_week[1] = "Monday";
//        days_of_week[2] = "Tuesday";
//        days_of_week[3] = "Wednesday";
//        days_of_week[4] = "Thursday";
//        days_of_week[5] = "Friday";
//        days_of_week[6] = "Saturday";
//        for (String day : days_of_week)
//            System.out.println(day);

        //        Method 2
//        String[] days_of_week2 = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//        for (String day:days_of_week2)
//            System.out.println(day);

//        Finding average of numbers
        byte[] numbers = {1,2,3,4,5};
        double result = 0;
        for (byte number:numbers) {
            result = (result + number);
        }
        System.out.println("Average of "+ Arrays.toString(numbers) +" is: "+result/numbers.length);
    }
}
