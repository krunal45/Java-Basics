package main.mutable_and_immutable_example;

public class Mutable_Example {
    String name;
    
    
    public Mutable_Example(String name) {
	// TODO Auto-generated constructor stub
	this.name=name;
    }
    
    public String getname() {
	return name;
    }
    
    //to set name
    public void setName(String name) {
	this.name=name;
    }
    
    public static void main(String args[]) {
	Mutable_Example mutable=new Mutable_Example("Krunal");
	System.out.println(mutable.getname());
	mutable.setName("Bhatt");
	System.out.println(mutable.getname());
    }

}
