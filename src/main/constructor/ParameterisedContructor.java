package main.constructor;

public class ParameterisedContructor {
    //instance variables means they are the instance of the class
    int Roll_no,rank_student;
    String Name;
    
    public ParameterisedContructor(int rno,String name) {
	// TODO Auto-generated constructor stub
	Roll_no=rno;
	Name=name;
	
    }
    
    public ParameterisedContructor(int rno,String name,int Rank) {
	Roll_no=rno;
	Name=name;
	rank_student=Rank;
    }
    
    
    public void display() {
	System.out.println("Rollno of student1 is "+Roll_no+" & Name is: "+Name+" &  Rank is :"+rank_student);
    }
    
    public static void main(String args[]) {
	ParameterisedContructor student1=new ParameterisedContructor(10, "Krunal");
	ParameterisedContructor student2=new ParameterisedContructor(11, "deeos",13);
	student1.display();
	student2.display();
    }

}
