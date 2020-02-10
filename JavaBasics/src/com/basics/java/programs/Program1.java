/** Write a java program to print Fibonacci series
 * 
 */
package com.basics.java.programs;

import java.util.Scanner;

/**
 * @author krunal
 *
 */
public class Program1 {
    int prev=0,x=1,c,number;//stored in heap memory
    Scanner s=new Scanner(System.in);//stored in heap memory
    
    public void input() {
	System.out.println("Enter range of fibonnaci series");
	number=s.nextInt();
    }
    
    public void findingfibonnaciseries() {
	System.out.print("Fibonnaci series is:"+x);
	for(int i=0;i<number;i++) {
	c=prev+x;
	System.out.print(" "+c);
	prev=x;
	x=c;
    }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Program1 p1=new Program1();
	p1.input();
	p1.findingfibonnaciseries();

    }

}
