package _1;

import java.lang.*;
public class Book {
    private String title;
    private int pages;
    public Book(String n, int a){
        title = n;
        pages = a;
    }
    public Book(String n){
        title = n;
        pages = 0;
    }
    public Book(){
        title = "Pup";
        pages = 0;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title){
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String toString(){
        return this.title+", pages "+this.pages;
    }
    public void sizeBook(){
        if (pages >= 500) {
            System.out.println(title+" has "+pages+" > 500 pages, so it's a big book");
        }
        else {
            System.out.println(title+" has "+pages+" < 500 pages, so it's a small book");
        }
    }
}
