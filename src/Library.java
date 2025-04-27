import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Library<T extends Book> {
    public Map<Integer, T> books = new HashMap<>();
    public Map<Integer, User> users = new HashMap<>();
    private Map<Integer, Integer> issuedBooks;
    //private Map<Integer, User> users;


    public Library(){
        this.issuedBooks = new HashMap<>();
    }


    //Methods for Book
    public void addBook(T book){
        books.put(book.getId(), book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void listBooks(){
        if (books.isEmpty()){
            System.out.println("No Books available.");
        }else {
            for(T book : books.values()){
                System.out.println(book);
            }
        }
    }


    //Methods for User
//    public void registerUsers(User user){
//        users.put(user.getId(), user);
//        System.out.println("User Registered: " + user.getName());
//    }
    public void listUsers(){
        if(users.isEmpty()){
            System.out.println("No user Registered.");
        }else {
            for (User user : users.values()){
                System.out.println(user);
            }
        }
    }
    public void registerUser(int id, String name, String email) {
        if (users.containsKey(id)) {
            System.out.println("User with this ID already exists!");
            return;
        }
        User user = new User(id, name, email);
        users.put(id, user);
        System.out.println("User registered successfully!");
    }


    //Method for issuing the book
    public void issueBook(int bookId, int userId) {
        T book = books.get(bookId);
        User user = users.get(userId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }
        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        if (book.getCopies() <= 0) {
            System.out.println("No copies available for this book!");
            return;
        }

        book.setCopies(book.getCopies() - 1);
        System.out.println("Book '" + book.getTitle() + "' issued to " + user.getName());
        issuedBooks.put(bookId, userId);
    }

    //Method for returning the book
    public void returnBook(int bookId, int userId) {
        T book = books.get(bookId);
        User user = users.get(userId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        book.setCopies(book.getCopies() + 1);
        System.out.println("Book '" + book.getTitle() + "' returned by " + user.getName());
        issuedBooks.remove(bookId);

    }

    //Methods for search by Title, Author, Category
    public void searchByTitle(String title) {
        List<T> result = books.values().stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .toList(); // collect to a list

        if (result.isEmpty()) {
            System.out.println("No books found with title containing: " + title);
        } else {
            result.forEach(System.out::println);
        }
    }
    public void searchByAuthor(String author) {
        List<T> result = books.values().stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .toList();

        if (result.isEmpty()) {
            System.out.println("No books found by author: " + author);
        } else {
            result.forEach(System.out::println);
        }
    }
    public void searchByCategory(String category) {
        List<T> result = books.values().stream()
                .filter(book -> book.getCategory().toLowerCase().contains(category.toLowerCase()))
                .toList();

        if (result.isEmpty()) {
            System.out.println("No books found in category: " + category);
        } else {
            result.forEach(System.out::println);
        }
    }

    //Method for borrowBook
    public void viewBorrowedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println("No books are currently borrowed.");
            return;
        }

        System.out.println("Borrowed Books List:");
        for (Map.Entry<Integer, Integer> entry : issuedBooks.entrySet()) {
            int bookId = entry.getKey();
            int userId = entry.getValue();

            T book = books.get(bookId);
            User user = users.get(userId);

            if (book != null && user != null) {
                System.out.println("📖 Book: " + book.getTitle() + " | Borrowed by: " + user.getName());
            }
        }
    }


}
