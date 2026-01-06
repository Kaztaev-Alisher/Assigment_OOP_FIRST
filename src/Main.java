import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library("AITU Library");

        while (true) {
            System.out.println("\n1. Add book");
            System.out.println("2. Check book");
            System.out.println("3. Show all books");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                System.out.print("Year: ");
                int year = sc.nextInt();
                sc.nextLine();

                lib.addBook(new Book(title, author, year));
                System.out.println("Book added.");

            } else if (choice == 2) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                Book b = lib.findBook(title);
                System.out.println(b == null ? "Book not found" : "Found: " + b);
            } else if (choice == 3) {
                System.out.println("All books in library:");
                lib.show();
            } else if (choice == 0) {
                System.out.println("Program finished.");
                break;
            } else {
                System.out.println("Wrong option.");
            }
        }
    }
}
