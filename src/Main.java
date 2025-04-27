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
            System.out.println(" 3. Register User");
            System.out.println(" 4. View All Users");
            System.out.println(" 5. Issue Book");
            System.out.println(" 6. Return Book");
            System.out.println(" 7. Search Book by Title");
            System.out.println(" 8. Search Book by Author");
            System.out.println(" 9. Search Book by Category");
            System.out.println(" 10. View Borrowed Books List");
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
                case 3:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter User Name: ");
                    String userName = scanner.nextLine();
                    User newUser = new User(userId, userName);
                    library.registerUsers(newUser);
                    break;
                case 4:
                    library.listUsers();
                    break;
                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.print("Enter User ID issuing the book: ");
                    int issueUserId = scanner.nextInt();
                    library.issueBook(issueBookId, issueUserId);
                    break;
                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    System.out.print("Enter User ID returning the book: ");
                    int returnUserId = scanner.nextInt();
                    library.returnBook(returnBookId, returnUserId);
                    break;
                case 7:
                    System.out.print("Enter title to search: ");
                    scanner.nextLine(); // consume leftover newline
                    String sTitle = scanner.nextLine();
                    library.searchByTitle(sTitle);
                    break;
                case 8:
                    System.out.print("Enter author to search: ");
                    scanner.nextLine();
                    String sAuthor = scanner.nextLine();
                    library.searchByAuthor(sAuthor);
                    break;
                case 9:
                    System.out.print("Enter category to search: ");
                    scanner.nextLine();
                    String sCategory = scanner.nextLine();
                    library.searchByCategory(sCategory);
                    break;
                case 10:
                    library.viewBorrowedBooks();
                    break;
                case 0:
                    System.out.println("Exiting... Sayonara.");
                    break;
                default:
                    System.out.println("Invalid option. Try Again!");
            }
        }while (choice !=0);

        scanner.close();
    }
}

