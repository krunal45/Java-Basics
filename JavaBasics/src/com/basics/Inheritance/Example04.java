package com.basics.Inheritance;

//This is anonymous class belonging to inner class(nested class)
public class Example04 {

    public void phone() {
	System.out.println("i can call");
    }
    
    public static void main(String args[]) {
	
	Example04 e4=new Example04() {
	    
	    public void phone() {
		System.out.println("i can call,take photos ettc...,");
	    }
	};
	e4.phone();
    }
}


