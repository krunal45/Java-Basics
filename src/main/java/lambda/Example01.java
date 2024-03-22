package lambda;

public interface Example01 {

    public void phone();
    
    public static void main(String args[]) {
	
	Example01 e5= ()->{

		System.out.println("I can call,take photos,etc.,");
	    };
	
	e5.phone();
    }
}
