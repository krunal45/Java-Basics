package main.BuilderDesignPattern;

public class PhoneBuilder {
    
    private String os;
    private double screenSize;
    private double camera;
    
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder setCamera(double camera) {
        this.camera = camera;
        return this;
    }
    
    public Phone getPhone() {
	return new Phone(os, screenSize, camera);
    }
    
    

}
