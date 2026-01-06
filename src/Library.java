import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void addMember(LibraryMember m) {
        members.add(m);
    }
    public Book findBook(String title) {
        for (Book b : books)
            if (b.getTitle().equals(title))
                return b;
        return null;
    }

    public void show() {
        System.out.println("Library: " + name);
        books.forEach(System.out::println);
    }
}
