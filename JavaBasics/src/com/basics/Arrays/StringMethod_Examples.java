package com.basics.Arrays;

public class StringMethod_Examples {
    
    String name="krunal",surname="BHATT";
    
      public void string_Methods() {
	  int asciiValue=name.codePointAt(3);
	  System.out.println("Ascii value of 'k' is :"+asciiValue);
	  
	  asciiValue=name.codePointBefore(5);
	  System.out.println("Ascii value of 'A' is :"+asciiValue);
	  
	  int codePointCount=name.codePointCount(0, 3);
	  System.out.println("CodePoint Count is :"+codePointCount);
	  
	  boolean isTrue=name.startsWith("K");
	  System.out.println("Name starts with k : "+isTrue);
	  
	  isTrue=name.endsWith("l");
	  System.out.println("Name ends with L :"+isTrue);
	  
	  String upperCase=name.toUpperCase();
	  System.out.println("name in uppercase is : "+upperCase);
	  
	  String lowercase=surname.toLowerCase();
	  System.out.println("surname in lowercase is : "+lowercase);
	  
	  char[] nickname= {'l','a','l','o'};
	  System.out.println(String.valueOf(nickname));
	  
	  int num=10;
	  System.out.println(String.valueOf(num));
	  
	  char searchedChar=name.charAt(0);
	  System.out.println("Searched character is : "+searchedChar);
	  
	  StringBuilder sb=new StringBuilder("Noise is great");
	  sb.deleteCharAt(4);
	  System.out.println("New String is : "+sb);
	  
	  sb=new StringBuilder("NOISE");
	  char[] array=new char[5];
	  sb.getChars(0, 5, array, 0);
	  for(int i=0;i<=4;i++) {
	  System.out.println("copied array is : "+array[i]);
	  }
	  
	  int lengthOfString=sb.length();
	  System.out.println("Length of String is :"+lengthOfString);
	  
	  sb.replace(0, 5, "KRUNAL");
	  System.out.println("String is :"+sb);
	  
	  sb.setCharAt(0, 'J');
	  System.out.println("Modified String is :"+sb);
	  
	  sb.setLength(7);
	  System.out.println(sb);
	  sb.setLength(3);
	  System.out.println(sb);
	  
	  sb=new StringBuilder("KRUP");
	  sb.appendCodePoint(65);
	  System.out.println("New String is :"+sb);
	  
	  sb=new StringBuilder();
	  int defaultCapacity=sb.capacity();//default capacity
	  System.out.println("Default Capacity : "+defaultCapacity);
	  
	  sb=new StringBuilder("KRUNAL");
	  int newCapacity=sb.capacity();//new capacity
	  System.out.println("New Capacity of Object is :"+newCapacity);
	  
	  sb=new StringBuilder("Noise is great");
	  String newString=sb.substring(6);
	  System.out.println(newString);
	  
	  newString=sb.substring(0, 5);
	  System.out.println(newString);
	}
      
      public static void main(String args[]) {
	  StringMethod_Examples example=new StringMethod_Examples();
	  example.string_Methods();
      }

}
