package com.basics.returnType;

//This is example 2 of returning object
public class Furniture {
    
    int size;
    String colour;
    
    public Furniture(int size,String colour) {
	// TODO Auto-generated constructor stub
	this.size=size;
	this.colour=colour;
    }
    
    public Furniture table() {
	return new Furniture(10, "black");
    }
    
    public Furniture chair() {
	return new Furniture(10, "white");
    }
    
    public Furniture dining() {
	return new Furniture(10, "brown");
    }
    
    public static void main(String args[]) {
	Furniture obj=new Furniture(0, "white");
	System.out.println("Default values :"+obj.size+" and "+obj.colour);
	
	//table --- instance of furniture
	obj=obj.table();
	System.out.println("table values :"+obj.size+" and "+obj.colour);
	
	//chair --- instance of furniture
	obj=obj.chair();
	System.out.println("chair values :"+obj.size+" and "+obj.colour);
	
	//dining --- instance of furniture
	obj=obj.dining();
	System.out.println("dining values :"+obj.size+" and "+obj.colour);
    }
    


}
