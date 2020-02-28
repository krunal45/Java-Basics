package com.basics.BuilderDesignPattern;

public class Phone {
    
    private String os;
    private double screenSize;
    private double camera;
    
    
    public Phone(String os, double screensize, double cameraresolution) {
	super();
	this.os = os;
	this.screenSize = screensize;
	this.camera = cameraresolution;
    }


    @Override
    public String toString() {
	return "Phone [os=" + os + ", screenSize=" + screenSize + ", camera=" + camera + "]";
    }
    
    
    
    

}
