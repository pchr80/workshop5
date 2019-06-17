package pl.coderslab.model;

public class Book {
    private long id;
    private String title;
    private String author;
    private String type;
    private String isbn;
    private String publisher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(long id, String title, String author, String type, String isbn, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book()
    {}

}
