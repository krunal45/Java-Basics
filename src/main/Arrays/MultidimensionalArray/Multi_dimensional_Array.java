package main.Arrays.MultidimensionalArray;

import java.util.Scanner;

public class Multi_dimensional_Array {
    
    //Scanner scanner=new Scanner(System.lineSeparator());
    Scanner input=new Scanner(System.in);
    
    String account_name[][]=new String[2][2];//defining 2 dimensional array in java
    
    //getting user input from the user
    public String[][] input() {
	for(int i=0;i<=1;i++) {
	    System.out.println("We are in row["+i+"]\n");
	    //System.out.println("Enter data :");
	     for(int j=0;j<=1;j++) {
		 
		 System.out.println("We are in column["+j+"]\n");
		 System.out.println("Enter data : \n");
		 account_name[i][j]=input.nextLine();
	     }
	}
	return account_name;
    }
    
    //displaying input entered by the user.
    public void display() {
	for(int k=0;k<=1;k++) {
	    for(int l=0;l<=1;l++) {
		System.out.println("account name :"+account_name[k][l]);
	    }
	}
	
    }
    
    public static void main(String args[]) {
	Multi_dimensional_Array m=new Multi_dimensional_Array();
	m.input();
	m.display();
	
    }

}
