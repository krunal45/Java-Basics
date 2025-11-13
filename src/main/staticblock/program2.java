package main.staticblock;

import java.util.Scanner;

public class program2 {
    static String name="default";
    static int rollno=00;
    
    static Scanner s=new Scanner(System.in);
    
    public static String enter_data() {
	name="kb";
	rollno=20;
	return name;
    }

}
