import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book book = new Book();

        // Set the details of the book
        // Implement here
        book.setTitle(title);
        book.setAuthor(author);
        book.setPages(100);

        // Print the details of the book
        // Implement here
        System.out.printf("Title: %s, ", book.getTitle());
        System.out.printf("Author: %s, ", book.getAuthor());
        System.out.printf("Pages: %s", book.getPages());
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    // Getters and setters
    // Implement here

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}