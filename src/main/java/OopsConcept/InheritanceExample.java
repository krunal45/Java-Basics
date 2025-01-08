package OopsConcept;
class Shape{
    String colour;
}

class Triangle extends Shape{
    void calculateArea(int l,int h){
        System.out.println("Area > "+(0.5*l*h));
    }

    void printColour(){
        System.out.println("Colour > "+this.colour);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.colour = "Red";
        triangle.calculateArea(2, 3);
        triangle.printColour();
    }
}

class EquilateralTriangle extends Triangle{
    void calculateArea(int l){
        System.out.println("Area > "+(0.5*l*l));
    }

    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.calculateArea(2);
        equilateralTriangle.colour = "Blue";
        equilateralTriangle.printColour();
    }
}

class Circle extends Shape{
    void calculateArea(int r){
        System.out.println("Area > "+3.14*r*r);
    }

    void printColour(){
        System.out.println("Colour > "+this.colour);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(2);
        circle.colour = "Green";
        circle.printColour();
    }
}

public class InheritanceExample {
}
