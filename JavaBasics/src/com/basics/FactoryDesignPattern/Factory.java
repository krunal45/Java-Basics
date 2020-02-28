package com.basics.FactoryDesignPattern;

public class Factory{

    public OS getInstance(String str) {
	if(str.contains("Open")) {
	    return new Android();
	}
	else if(str.contains("closed")) {
	    return new IOS();
	}
	else {
	    return new Windows();
	}
    }
    

}
