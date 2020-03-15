package com.basics.Inheritance;



public class Example01 {
    
    private String name="instance variable of class 01";
    int a;
    
    public void method01() {
	System.out.println("This is method 01");
	System.out.println("name is :"+name);
    }
    
    public class nestedClass{
	int b;
	
	public void method02() {
	    System.out.println("This is method 02");
	    System.out.println("name is :"+name);
	}
    }
    
    class subClass extends nestedClass{
	
	public void method03() {
	    System.out.println("This is method 03");
	    System.out.println("name is :"+name);
	}
	
	
    }

    
    public static void main(String args[]) {
	    Example01 e1=new Example01();
	    e1.a=10;
	    System.out.println("value of a :"+e1.a);
	    Example01.nestedClass e2=e1.new nestedClass();//since 'nested class' is part of 'Example01';
	    e2.b=5;
	    System.out.println("value of b :"+e2.b);
	    
	    
	}

}

