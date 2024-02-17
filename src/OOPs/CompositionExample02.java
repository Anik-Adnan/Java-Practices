package OOPs;

import java.util.*;

public class CompositionExample02 {
    public static void main(String[] args) {
        Bookk bookk1 = new Bookk("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Bookk bookk2 = new Bookk("To Kill a Mockingbird", "Harper Lee", 281);
        Bookk bookk3 = new Bookk("1984", "George Orwell", 328);

        Library library = new Library();
        library.addBook(bookk1);
        library.addBook(bookk2);
        library.addBook(bookk3);

        library.printBooks();
    }
}
class Bookk {
    private String title;
    private String author;
    private int pages;

    public Bookk(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

class Library {
    private List<Bookk> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Bookk bookk) {
        books.add(bookk);
    }

    public void printBooks() {
        for (Bookk bookk : books) {
            System.out.println(bookk.getTitle() + " by " + bookk.getAuthor());
        }
    }
}

