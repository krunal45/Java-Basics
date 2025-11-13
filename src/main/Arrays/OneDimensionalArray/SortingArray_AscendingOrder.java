/**
 * 
 */
package main.Arrays.OneDimensionalArray;

/**
 * @author krunal
 *
 */
//Problem Statement : Arrange Array in Ascending Order 
public class SortingArray_AscendingOrder {
    
    static int[] numbers= {67,24,15,45,58,72,03};//Array Declaration
    static int size=numbers.length - 1;
    static int min=numbers[0];
    
public static void main(String args[]) {
	
	//SortingArray_AscendingOrder asc=new SortingArray_AscendingOrder();
	SortingArray_AscendingOrder.toAscending();
	SortingArray_AscendingOrder.displayArray();
    }
    
    public static void toAscending() {
	System.out.println("Size is :"+size);
    
	for(int i=0;i<=size;i++) {
	    
	    for(int j=0;j<=size-1;j++) {
		
		if(numbers[j]<numbers[j+1]) {
		    //System.out.println("Inside if loop");
		    min=numbers[j];
		}
		else {
		    min=numbers[j+1];
		    numbers[j+1]=numbers[j];
		    numbers[j]=min;
		}
	    }
	}
	
    }
 
    
    public static void displayArray() {
	for(int i=0;i<=numbers.length-1;i++) {
	    System.out.println(numbers[i]+"\t");
	}
    }
    
    

}
