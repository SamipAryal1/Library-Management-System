package Models;

public class Book {
    String book_name;
    String author;
    String description;
    Genre genre;

    public Book(String book_name, String author, String description, Genre genre) {
        this.book_name = book_name;
        this.author = author;
        this.description = description;
        this.genre = genre;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}