package main.FactoryDesignPattern;

//import com.sun.java.swing.plaf.windows.resources.windows;

public class ClientApp {
    
    public static void main(String a[]) {
	Factory fac=new Factory();
	OS obj=fac.getInstance("closed");
	obj.spec();
	
	
    }

}
