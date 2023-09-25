package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_in_java  {

    public Hashmap_in_java() {
	// TODO Auto-generated constructor stub
	System.out.println("Hashmap Example");
    }
    
    public void telephone_directory() {
	Map<String , String> directory=new HashMap<String, String>();
	directory.put("krunal", "123");
	directory.put("bhatt", "456");
	
	Set<String> keys=directory.keySet();//for getting list of keys
	
	for(String i:keys) {
	    System.out.println("key :"+i+" value :"+directory.get(i));
	}
    }
    
    public static void main(String args[]) {
	Hashmap_in_java hash=new Hashmap_in_java();
	hash.telephone_directory();
    }
}
