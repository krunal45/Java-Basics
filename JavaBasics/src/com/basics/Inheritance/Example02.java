package com.basics.Inheritance;

public class Example02 {

    public Example02() {
	// TODO Auto-generated constructor stub
	System.out.println("parent constructor");
    }
    
    public void methodA() {
	System.out.println("This is default method");
    }
    

    public static void main(String args[]) {
	 childClass c1=new childClass();
	 c1.methodA();
    }
    
}

 class childClass extends Example02{
    
     public childClass() {
	// TODO Auto-generated constructor stub
	 System.out.println("child constructor");
    }
     
     public void methodA() {
	 System.out.println("This is modified method");
     }
     
}
