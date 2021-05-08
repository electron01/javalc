package by.overone.alexsey.lecture24;

public class Book  {
    private String bookName;
    private String author;
    private Genre genre;

    public Book(String bookName, String author, Genre genre) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{"+
                " bookName - " + this.bookName +
                ", " +
                " author - " + this.author +
                ", " +
                " Genre - " + this.genre +
                " }";
    }

}
