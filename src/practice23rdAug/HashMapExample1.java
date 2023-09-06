package practice23rdAug;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("The Lord of the Rings", "J.R.R. Tolkien");
        books.put("1984", "George Orwell");
        books.put("To Kill a Mockingbird", "Harper Lee");
        System.out.println("--All Books--");
        System.out.println(books);
        System.out.println("The Lord of the Rings book Exists ? : " + books.containsKey("The Lord of the Rings"));
        System.out.println("Removing The Lord of the Rings book : ");
        books.remove("The Lord of the Rings");
        System.out.println(books);
        System.out.println("The Lord of the Rings book Exists ? : " + books.containsKey("The Lord of the Rings"));
        books.forEach((bookTitle, author) -> System.out.println(bookTitle + " : " + author));
    }
}
