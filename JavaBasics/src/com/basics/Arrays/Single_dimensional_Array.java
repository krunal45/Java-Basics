
// This is sample code to make understand single dimensional Array in java

package com.basics.Arrays;

import java.util.Scanner;

public class Single_dimensional_Array {
    
    Scanner scanner=new Scanner(System.in);
    String name[]=new String[4];//initializing string array of size 4.
    
    //Taking input of name from user
    public String[] input() {
	for(int i=0;i<=3;i++) {
	    System.out.print("Please Enter ur name :");
	    System.out.println(" ");
	    name[i]=scanner.next();//Scanning input entered by the user
	}
	return name;
    }
    
    //Displaying input entered by the user.

    public void display() {
	for(int j=0;j<=3;j++) {
	System.out.println("Name is :"+name[j]);
    }
    }
    
    public static void main(String args[]) {
	Single_dimensional_Array s=new Single_dimensional_Array();
	s.input();
	s.display();
    }
}
