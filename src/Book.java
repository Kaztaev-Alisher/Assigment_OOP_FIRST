import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return title + " - " + author + " (" + year + ")";
    }

    public boolean equals(Object o) {
        Book b = (Book) o;
        return title == b.title;
    }
}
