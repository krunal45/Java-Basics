package main.loop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopExample2 {
    
    public static List<String> provideNames() {
	List<String> nameList=new ArrayList<String>();
	nameList.add("Krunal");
	nameList.add("Vaishali");
	nameList.add("Jayesh");
	nameList.add("Varsha");
	nameList.add("Tinu");
	
	return nameList;
    }
    
    public static void main(String args[]) {
	List<String> printNameList=new ArrayList<String>();
	
	for(String name:provideNames()) {
	    printNameList.add(name);
	}
	System.out.println("NameList :"+printNameList);
    }

}
