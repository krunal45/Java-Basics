package main.Arrays.OneDimensionalArray;

public class SortingArray_DescendingOrder {

    /**
     * 
     */
   

    /**
     * @author krunal
     *
     */
    //Problem Statement : Arrange Array in Descending Order 
    
        
        static int[] numbers= {67,24,15,45,58,72,03};//Array Declaration
        static int size=numbers.length - 1;
        static int max=numbers[0];
        
    public static void main(String args[]) {
    	
    	//SortingArray_AscendingOrder asc=new SortingArray_AscendingOrder();
    	SortingArray_DescendingOrder.toDescending();
    	SortingArray_DescendingOrder.displayArray();
        }
        
        public static void toDescending() {
    	System.out.println("Size is :"+size);
        
    	for(int i=0;i<=size;i++) {
    	    
    	    for(int j=0;j<=size-1;j++) {
    		
    		if(numbers[j]>numbers[j+1]) {
    		    //System.out.println("Inside if loop");
    		    max=numbers[j];
    		}
    		else {
    		    max=numbers[j+1];
    		    numbers[j+1]=numbers[j];
    		    numbers[j]=max;
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


