package interfaces;

public class Furniture implements WoodInterface {

    @Override
    public void table() {
	// TODO Auto-generated method stub
	System.out.println("table");
    }

    @Override
    public void chair() {
	// TODO Auto-generated method stub
	System.out.println("Chair");
    }
    
    public static void main(String args[]) {
	WoodInterface wood=new Furniture();
	wood.chair();
	wood.table();
    }

}
