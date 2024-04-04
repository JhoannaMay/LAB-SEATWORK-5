import java.util.HashMap;

public class Book {
    private String isbn;
    private String title;
    private String authorName;

    public Book(String isbn, String title, String authorName) {
        this.isbn = isbn;
        this.title = title;
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }
}