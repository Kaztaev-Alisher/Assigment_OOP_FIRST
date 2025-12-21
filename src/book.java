public class book {
    private String title;
    private String author;
    private int year;

    public book(String title , String author , int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public boolean equals(Object obj){
        book other = (book)obj;
        if(this.title != other.title || this.author != other.author) return false;
        return true;
    }

    ;    public String toString() {
        return "book{title='"+title+"', author='"+author+"', year=" + year + "}";
    }
}