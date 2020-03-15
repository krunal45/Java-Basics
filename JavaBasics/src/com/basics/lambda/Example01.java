package com.basics.lambda;

public interface Example01 {

    public void phone();
    
    public static void main(String args[]) {
	
	Example01 e5= ()->{
		// TODO Auto-generated method stub
		System.out.println("I can call,take photos,etc.,");
	    };
	
	e5.phone();
    }
}
