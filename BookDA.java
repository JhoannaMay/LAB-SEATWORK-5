import java.util.HashMap;

public class BookDA {
    private HashMap<String, Book> bookMap;

    public BookDA() {
        this.bookMap = new HashMap<>();
        // Initialize bookMap from file or database
    }

    public void addBook(Book book) {
        bookMap.put(book.getIsbn(), book);
    }

    public Book getBookByIsbn(String isbn) {
        return bookMap.get(isbn);
    }

   
}
