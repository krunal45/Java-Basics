package staticblock;

//import com.sun.javafx.scene.EnteredExitedHandler;

public class program1 {
    static int RNo;
    static String Name;
    
    static {
	RNo=10;
	Name="";
    }
    
    public void m1() {
	program2.enter_data();
    }
    
    public void display() {
	System.out.println("Name is :"+program2.name);
    }
    
    public static void main(String args[]) {
	program1 p1=new program1();
	p1.m1();
	p1.display();
    }

}
