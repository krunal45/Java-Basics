package main.returnType;

public class ReturningObjectExample01 {
    String colour;
    int size;
    
    public ReturningObjectExample01(String colour,int size) {
	// TODO Auto-generated constructor stub
	this.colour=colour;
	this.size=size;
    }
    
    public ReturningObjectExample01 doubleSize(ReturningObjectExample01 shirt) {
	shirt.size=2*(shirt.size);
	return new ReturningObjectExample01("red", shirt.size);
    }
    
    public void getShirt(ReturningObjectExample01 shirt) {
	System.out.println("Shirt colour is :"+shirt.colour);
	System.out.println("Shirt Size is :"+shirt.size);
    }
    
    public static void main(String args[]) {
	ReturningObjectExample01 shirt=new ReturningObjectExample01("red", 5);
	shirt.getShirt(shirt);
	shirt=shirt.doubleSize(shirt);
	shirt.getShirt(shirt);
    }

}
