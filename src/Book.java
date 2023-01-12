import java.util.Objects;

public class Book {

    String title;
    String author;

    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        Book book = new Book("Some title", "Author", 32);

        book.setPages(320);
        System.out.println("book = " + book.getTitle());
    }
}
