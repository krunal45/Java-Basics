package com.basics.loop;

public class ForEachLoopExample1 {
    
    
       public static int findMax(int[] enterNumber) {
	  int maxsofar=enterNumber[0];
	   
	   for(int max:enterNumber) {
	       if(max>maxsofar) {
		   maxsofar=max;
	       }
	   }
	   
	   return maxsofar;
       }
       
       public static void main(String args[]) {
	   int[] num= {10,12,14,200};
	   int maximumNumber;
	   
	   maximumNumber=findMax(num);
	   System.out.println("maximum number is:"+maximumNumber);
       }
       

}
