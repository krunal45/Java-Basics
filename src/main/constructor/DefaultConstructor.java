package main.constructor;

public class DefaultConstructor {
    //instance variables //Memory is allocated at the time of object creation
    int a;
    String b;
    
    public static void main(String args[]) {
	DefaultConstructor d=new DefaultConstructor();
	System.out.println("value of a:"+d.a+"& value of b :"+d.b);
    }
    
    /*//static variables //memory is allocated to static variables at the time of variable declaration
     * static int a;
     * static String b;
     * 
     *  public static void main(String args[]) {
	DefaultConstructor d=new DefaultConstructor();
	System.out.println("value of a:"+a+"& value of b :"+b);
    }
     * 
     *///While explicit constructor is not defined compiler creates default constructor
     
     

}
