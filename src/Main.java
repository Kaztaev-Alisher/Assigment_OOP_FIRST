public class Main {
    public static void main() {
        book bok1 = new book("Clean code", "Robert Kan", 2008);
        book bok2 = new book("Clean code", "Robert Kan", 2008);
        librarymember member = new librarymember("Alisher", 101);
        library library = new library("AITU Library", bok1, member);
        library.displayInfo();
        System.out.println("Are books equal ? " + bok1.equals(bok2));
    }
}
