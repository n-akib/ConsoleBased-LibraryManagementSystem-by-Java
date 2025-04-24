import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library<Book> library = new Library<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--Library Menu--");
            System.out.println(" 1. Add Book");
            System.out.println(" 2. View All Books");
            System.out.println(" 0. Exit");
            System.out.println("Choose an Option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter the Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter the Author Name: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter the Category: ");
                    String category = scanner.nextLine();
                    System.out.println("Enter the Number of Copies: ");
                    int copies = scanner.nextInt();
                    scanner.nextLine();

                    Book newBook = new Book(id, title, author, category, copies);
                    library.addBook(newBook);
                    break;
                case 2:
                    library.listBooks();
                    break;

                default:
                    System.out.println("Invalid option. Try Again!");
            }

        }while (choice != 0);{
            System.out.println("Exiting... Sayonara.");
        };

        scanner.close();
    }
}

