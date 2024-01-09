package _4;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setAuthor("Stephen King");
        book.setTitle("The Shining");
        book.setYear(1977);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());
    }
}
