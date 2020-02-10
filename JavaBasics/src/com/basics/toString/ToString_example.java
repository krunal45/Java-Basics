package com.basics.toString;

public class ToString_example {
    String name;
    int Rno;
    
    ToString_example(String name,int Rno) {
	// TODO Auto-generated constructor stub
	this.name=name;
	this.Rno=Rno;
    }
    
    public static void sum() {
	System.out.println("static method");
	ToString_example to=new ToString_example("kb", 12);
	to.no_static();
    }
    
    public void no_static() {
	ToString_example.sum();
    }
    
     public String toString() {
	return name+" "+Rno;
	
    }
    
    public static void main(String args[]) {
	ToString_example example=new ToString_example("Krunal", 20);
	System.out.println(example);//returns String represenation of an object
    }

}
