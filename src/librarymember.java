public class librarymember {
    private String name;
    private int id;

    public librarymember(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Member: " + name + ", ID " + id;
    }
}

