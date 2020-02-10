package com.basics.String.example;

import java.util.Scanner;

public class Palindrome_Check {
    String s1="",s2="";
    int length;
    Scanner s=new Scanner(System.in);
    
    public void input() {
	System.out.println("enter String: ");
	s1=s.next();
	length=s1.length();
	System.out.println(length);
	
	for(int i=length-1;i>=0;i--) {
	    s2=s2+s1.charAt(i);
	}
    }
    
    public void isPalindrome() {
	if(s1.equals(s2)) {
	    System.out.println("String is Palindrome");
	}
	else {
	    System.out.println("String is not palindrome");
	}
    }
    public static void main(String args[]) {
	Palindrome_Check p=new Palindrome_Check();
	p.input();
	p.isPalindrome();
    }

}
