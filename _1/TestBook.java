package _1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("War and peace", 1300);
        Book b2 = new Book("In search of Alaska", 272);
        Book b3 = new Book("Gulliver"); b3.setPages(500);
        System.out.println(b3);
        b1.sizeBook();
        b2.sizeBook();
        b3.sizeBook();
    }
}
