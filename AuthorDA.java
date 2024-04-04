import java.util.HashMap;

public class AuthorDA {
    private HashMap<String, Author> authorMap;

    public AuthorDA() {
        this.authorMap = new HashMap<>();
        // Initialize authorMap from file or database
    }

    public void addAuthor(Author author) {
        authorMap.put(author.getName(), author);
    }

    public Author getAuthorByName(String name) {
        return authorMap.get(name);
    }

 
}