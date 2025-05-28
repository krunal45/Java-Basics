//**Question:**
//
//You are designing a system to manage a library. Each `Book` has the following attributes:
//
//- `String title`
//- `String author`
//- `int yearPublished`
//
//Your task is to:
//
//1. Implement the `Comparable<Book>` interface in the `Book` class.
//2. Sort the books in **ascending order of yearPublished**.
//3. If two books have the same year, sort them by **author name in ascending order**.
//4. If both year and author are the same, sort by **title in ascending order**.
//
//Write the `Book` class and a main method that:
//- Creates a list of at least 5 books with varying years, authors, and titles.
//- Sorts the list using `Collections.sort()`.
//- Prints the sorted list.

package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    String title;
    String author;
    int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        if (this.yearPublished > o.yearPublished) {
            return 1;
        } else if (this.yearPublished == o.yearPublished) {
            if (this.author.equals(o.author)) {
                return this.title.compareTo(o.title);
            }
            return this.author.compareTo(o.author);
        } else {
            return -1;
        }
    }

//    We can also use below code >> comparable
//@Override
//public int compareTo(Book o) {
//    return Comparator.comparingInt(Book::getYearPublished)
//            .thenComparing(Book::getAuthor)
//            .thenComparing(Book::getTitle)
//            .compare(this, o);
//}


    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho",1988);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee",1960);
        Book book3 = new Book("1984", "George Orwell",1949);
        Book book4 = new Book("Animal Farm", "Aldous Huxley",1945);
        Book book5 = new Book("Brave New World", "Aldous Huxley",1945);


        List<Book> books = new ArrayList<>(List.of(book1,book2,book3,book4,book5));
        System.out.println("--Before Sort--");
        books.forEach(System.out::println);
        System.out.println("--After Sort--");
        Collections.sort(books);
        books.forEach(System.out::println);
    }
}