package optional_Class;

class Author {
    private String penName;

    public Author() {}
    public Author(String penName) {
        this.penName = penName;
    }

    public String getPenName() {
        return penName;
    }
}

public class Book {
    private Author author;

    public Book(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}