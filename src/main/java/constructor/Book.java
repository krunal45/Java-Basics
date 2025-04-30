//Sure! Here's a Java interview coding question focused on constructors:
//
//**Question:**
//Create a Java class called `Book` with the following specifications:
//- It should have two instance variables: `title` (String) and `price` (double).
//- Provide **two constructors**:
//  1. A **default constructor** that sets `title` to `"Unknown"` and `price` to `0.0`.
//  2. A **parameterized constructor** that takes values for both `title` and `price`.
//- Add a method `display()` that prints the book's title and price.
//
//**Write the class and demonstrate both constructors in a `main` method.**

package constructor;

public class Book {
    private String title;
    private double price;

    Book() {
        this.title = "Unknown";
        this.price = 0.0;
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(this.title + " : " + this.price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();//calls default constructor
        Book book2 = new Book("ABC",2.3);
        book1.display();
        book2.display();
    }
}