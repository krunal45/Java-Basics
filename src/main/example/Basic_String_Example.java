package main.example;

public class Basic_String_Example {
    String name="";
    
    public String input() {
	name="krunal";
	return name;
	}
    
    public void display() {
	System.out.println("name is :"+input());
    }
    
    public static void main(String args[]) {
	Basic_String_Example b=new Basic_String_Example();
	//b.input();
	b.display();
    }

}
