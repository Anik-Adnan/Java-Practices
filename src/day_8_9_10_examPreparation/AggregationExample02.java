package day_8_9_10_examPreparation;

public class AggregationExample02 {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", 56);
        Book book = new Book("Harry Potter and the Philosopher's Stone", author);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Author's Age: " + book.getAuthor().getAge());

    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}

class Author {
    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}






