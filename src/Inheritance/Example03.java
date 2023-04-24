package Inheritance;


//This is static class belonging to inner class(nested class)
public class Example03 {

    static int a;
    
      static class childClass{
	  int b;
      }
      
      public static void main(String args[]) {
	  Example03.a=5;
	  System.out.println("Parent class variable value :"+Example03.a);
	  Example03.childClass obj=new Example03.childClass();
	  obj.b=10;
	  System.out.println("Child class variable value :"+obj.b);
	  
      }
}
