package returnType;

public class ReturningObjectExample02 {
    int empID;
    String empName;
    ReturningObjectExample02 temp;
    
    public ReturningObjectExample02(int id,String name) {
	// TODO Auto-generated constructor stub
	empID=id;
	empName=name;
    }
    
    public ReturningObjectExample02 display() {
	temp=new ReturningObjectExample02(01, "emp01");
	return temp;
    }
    
    public static void main(String args[]) {
	ReturningObjectExample02 obj02=new ReturningObjectExample02(02, "emp02");
	System.out.println("Employee Details \n");
	System.out.println("Emp ID :"+obj02.empID+"\n");
	System.out.println("Emp Name :"+obj02.empName+"\n");
	System.out.println();
	
	ReturningObjectExample02 obj03;
	obj03=obj02.display();
	System.out.println("Emp ID :"+obj03.empID+"\n");
	System.out.println("Emp Name :"+obj03.empName+"\n");
	
	
    }

}
