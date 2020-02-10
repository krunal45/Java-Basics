package com.basics.String.example;

public class String_Comparison {
    String name="Krunal",entered_name;
    static String name1;
    
    public String_Comparison(String entered_name) {
	// TODO Auto-generated constructor stub
	this.entered_name=entered_name;
    }
    
    public boolean Comparison() {
	if(name.equals(name1))
	    return true;
	else
	    return false;
    }

    public static void main(String args[]) {
	String_Comparison string=new String_Comparison("Krunal");
	name1=new String("Krunal");
	System.out.println(string.Comparison());
    }
}
