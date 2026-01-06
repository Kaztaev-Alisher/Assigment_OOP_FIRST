import java.util.Objects;

public class LibraryMember {
    private String name;
    private int id;
    public LibraryMember(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString() {
        return "Member: " + name + ", ID: " + id;
    }
}
