package com.basics.String.example;

public class String_as_immutable {
    String name="Krunal";
    //StringBuffer sbuffer=new StringBuffer();
    
    public String_as_immutable() {
	// TODO Auto-generated constructor stub
	System.out.println("name is "+name);
	
    }
    
    public void append_name() {
	System.out.println(name.getClass());
    }
    
    public void length_String() {
	System.out.println("Length of String is "+name.length());
    }
    
    public static void main(String args[]) {
	String_as_immutable string=new String_as_immutable();
	string.append_name();
	string.length_String();
	StringBuffer sbuffer=new StringBuffer("krunal");
	System.out.println(sbuffer);
	sbuffer.append("bhatt");
	System.out.println(sbuffer);
	sbuffer.setLength(10);
	System.out.println(sbuffer.length());
	System.out.println(sbuffer.capacity());
    }

}
